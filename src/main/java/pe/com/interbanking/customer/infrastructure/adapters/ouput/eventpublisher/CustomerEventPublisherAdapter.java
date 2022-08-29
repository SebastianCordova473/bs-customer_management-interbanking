package pe.com.interbanking.customer.infrastructure.adapters.ouput.eventpublisher;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import pe.com.interbanking.customer.application.ports.output.CustomerEventPublisher;
import pe.com.interbanking.customer.domain.event.CustomerCreatedEvent;

@RequiredArgsConstructor
@Service
public class CustomerEventPublisherAdapter implements CustomerEventPublisher {
    private final ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void publishCustomerCreatedEvent(CustomerCreatedEvent event) {
        applicationEventPublisher.publishEvent(event);
    }
}
