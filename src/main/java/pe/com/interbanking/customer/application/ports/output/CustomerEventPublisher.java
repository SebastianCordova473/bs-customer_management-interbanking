package pe.com.interbanking.customer.application.ports.output;

import pe.com.interbanking.customer.domain.event.CustomerCreatedEvent;

public interface CustomerEventPublisher {
    void publishCustomerCreatedEvent(CustomerCreatedEvent event);
}
