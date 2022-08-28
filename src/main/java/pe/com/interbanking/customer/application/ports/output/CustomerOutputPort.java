package pe.com.interbanking.customer.application.ports.output;

import pe.com.interbanking.customer.domain.model.Customer;

import java.util.Optional;
import java.util.UUID;

public interface CustomerOutputPort {
    Customer saveCustomer(Customer customer);
    Optional<Customer> getCustomerById(UUID id);
}
