package pe.com.interbanking.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import pe.com.interbanking.customer.application.ports.input.CreateCustomerUseCase;
import pe.com.interbanking.customer.infrastructure.adapters.input.rest.ProductRestAdapter;
import pe.com.interbanking.customer.infrastructure.adapters.ouput.persistence.mapper.CustomerPersistenceMapper;

@SpringBootApplication
@ComponentScan(basePackageClasses = {CustomerPersistenceMapper.class, ProductRestAdapter.class, CreateCustomerUseCase.class})
public class BsCustomerManagementInterbankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BsCustomerManagementInterbankingApplication.class, args);
	}

}
