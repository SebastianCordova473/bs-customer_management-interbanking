package pe.com.interbanking.customer.infrastructure.adapters.input.eventlistener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pe.com.interbanking.customer.domain.event.CustomerCreatedEvent;

@Component
@Slf4j
public class CustomerEventListenerAdapter {

    @EventListener
    public void handle(CustomerCreatedEvent event){
        if(log.isDebugEnabled()) {
            log.info("Product created with id " + event.getId() + " at " + event.getDate());
        }
    }
}
