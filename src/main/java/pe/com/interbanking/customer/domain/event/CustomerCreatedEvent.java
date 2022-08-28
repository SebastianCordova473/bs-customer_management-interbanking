package pe.com.interbanking.customer.domain.event;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerCreatedEvent {
    private UUID id;
    private LocalDateTime date;
    
    public CustomerCreatedEvent(UUID id) {
        this.id = id;
        this.date = LocalDateTime.now();
    }
}
