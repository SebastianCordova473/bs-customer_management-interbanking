package pe.com.interbanking.customer.application.ports.input;

import pe.com.interbanking.customer.domain.model.Customer;

public interface CreateCustomerUseCase {
    Customer createProduct(Customer customer);
}
