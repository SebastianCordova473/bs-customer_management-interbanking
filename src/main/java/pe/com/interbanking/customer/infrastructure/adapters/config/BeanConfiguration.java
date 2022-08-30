package pe.com.interbanking.customer.infrastructure.adapters.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.com.interbanking.customer.infrastructure.adapters.input.rest.mapper.CustomerRestMapper;
import pe.com.interbanking.customer.infrastructure.adapters.input.rest.mapper.CustomerRestMapperImpl;
import pe.com.interbanking.customer.infrastructure.adapters.ouput.persistence.CustomerPersistenceAdapter;
import pe.com.interbanking.customer.infrastructure.adapters.ouput.persistence.mapper.CustomerPersistenceMapper;
import pe.com.interbanking.customer.infrastructure.adapters.ouput.persistence.mapper.CustomerPersistenceMapperImpl;

@Configuration
public class BeanConfiguration {

    @Bean
    public CustomerRestMapper customerRestMapper() {
        return new CustomerRestMapperImpl();
    }

    @Bean
    public CustomerPersistenceMapper customerPersistenceMapper() {
        return new CustomerPersistenceMapperImpl();
    }
}
