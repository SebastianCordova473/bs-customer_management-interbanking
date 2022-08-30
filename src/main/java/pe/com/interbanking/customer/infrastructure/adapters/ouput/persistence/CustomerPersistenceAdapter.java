package pe.com.interbanking.customer.infrastructure.adapters.ouput.persistence;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.com.interbanking.customer.application.ports.output.CustomerOutputPort;
import pe.com.interbanking.customer.domain.model.Customer;
import pe.com.interbanking.customer.infrastructure.adapters.ouput.persistence.entity.CustomerEntity;
import pe.com.interbanking.customer.infrastructure.adapters.ouput.persistence.mapper.CustomerPersistenceMapper;
import pe.com.interbanking.customer.infrastructure.adapters.ouput.persistence.repository.CustomerRepository;

import java.util.Optional;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class CustomerPersistenceAdapter implements CustomerOutputPort {

    private final CustomerRepository customerRepository;
    private final CustomerPersistenceMapper customerPersistenceMapper;

    @Override
    public Customer saveCustomer(Customer customer) {
        CustomerEntity customerEntity = customerPersistenceMapper.toCustomerEntity(customer);
        customerEntity = customerRepository.save(customerEntity);
        return customerPersistenceMapper.toCustomer(customerEntity);
    }

    @Override
    public Optional<Customer> getCustomerById(UUID id) {
        Optional<CustomerEntity> customerEntity = customerRepository.findById(id);
        if (customerEntity.isEmpty()) {
            return Optional.empty();
        }
        Customer customer = customerPersistenceMapper.toCustomer(customerEntity.get());
        return Optional.of(customer);
    }
}