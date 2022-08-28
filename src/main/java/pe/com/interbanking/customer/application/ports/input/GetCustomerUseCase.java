package pe.com.interbanking.customer.application.ports.input;

import pe.com.interbanking.customer.domain.model.Customer;

import java.util.UUID;

public interface GetCustomerUseCase {
    Customer getProductById(UUID id);
}
