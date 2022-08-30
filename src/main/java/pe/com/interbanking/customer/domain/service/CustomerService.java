package pe.com.interbanking.customer.domain.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.com.interbanking.customer.application.ports.input.CreateCustomerUseCase;
import pe.com.interbanking.customer.application.ports.input.GetCustomerUseCase;
import pe.com.interbanking.customer.application.ports.output.CustomerEventPublisher;
import pe.com.interbanking.customer.application.ports.output.CustomerOutputPort;
import pe.com.interbanking.customer.domain.event.CustomerCreatedEvent;
import pe.com.interbanking.customer.domain.exception.CustomerNotFound;
import pe.com.interbanking.customer.domain.model.Customer;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class CustomerService implements CreateCustomerUseCase, GetCustomerUseCase {
    private final CustomerOutputPort customerOutputPort;
    private final CustomerEventPublisher customerEventPublisher;

    @Override
    public Customer createProduct(Customer customer) {
        customer = customerOutputPort.saveCustomer(customer);
        customerEventPublisher.publishCustomerCreatedEvent(new CustomerCreatedEvent(customer.getId()));
        return customer;
    }

    @Override
    public Customer getProductById(UUID id) {
        return customerOutputPort.getCustomerById(id).orElseThrow(() -> new CustomerNotFound("Customer not found with id: " + id));
    }
}
