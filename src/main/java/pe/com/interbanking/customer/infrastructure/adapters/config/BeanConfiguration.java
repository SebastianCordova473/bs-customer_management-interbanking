package pe.com.interbanking.customer.infrastructure.adapters.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import pe.com.interbanking.customer.domain.service.CustomerService;
import pe.com.interbanking.customer.infrastructure.adapters.ouput.eventpublisher.CustomerEventPublisherAdapter;
import pe.com.interbanking.customer.infrastructure.adapters.ouput.persistence.CustomerPersistenceAdapter;
import pe.com.interbanking.customer.infrastructure.adapters.ouput.persistence.mapper.CustomerPersistenceMapper;
import pe.com.interbanking.customer.infrastructure.adapters.ouput.persistence.repository.CustomerRepository;

@Configuration
public class BeanConfiguration {
  @Bean
    public CustomerPersistenceAdapter customerPersistenceAdapter(CustomerRepository customerRepository, CustomerPersistenceMapper customerPersistenceMapper){
          return  new CustomerPersistenceAdapter(customerRepository, customerPersistenceMapper);
  }
  @Bean
    public CustomerEventPublisherAdapter customerEventPublisherAdapter(ApplicationEventPublisher applicationEventPublisher){
     return new CustomerEventPublisherAdapter(applicationEventPublisher);
  }
  @Bean
    public CustomerService customerService(CustomerPersistenceAdapter customerPersistenceAdapter, CustomerEventPublisherAdapter customerEventPublisherAdapter){
      return new CustomerService(customerPersistenceAdapter, customerEventPublisherAdapter);
  }
}
