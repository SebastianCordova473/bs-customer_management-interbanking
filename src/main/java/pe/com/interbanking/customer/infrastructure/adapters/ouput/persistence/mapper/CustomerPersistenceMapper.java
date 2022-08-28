package pe.com.interbanking.customer.infrastructure.adapters.ouput.persistence.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;
import pe.com.interbanking.customer.domain.model.Customer;
import pe.com.interbanking.customer.infrastructure.adapters.ouput.persistence.entity.CustomerEntity;

@Mapper
public interface CustomerPersistenceMapper {
    CustomerEntity toProductEntity(Customer customer);
    Customer toProduct(CustomerEntity customerEntity);
}
