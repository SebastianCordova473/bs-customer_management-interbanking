package pe.com.interbanking.customer.infrastructure.adapters.ouput.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.interbanking.customer.infrastructure.adapters.ouput.persistence.entity.CustomerEntity;

import java.util.UUID;

//@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, UUID> {
}
