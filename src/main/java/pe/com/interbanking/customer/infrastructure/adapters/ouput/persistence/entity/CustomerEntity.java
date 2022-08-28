package pe.com.interbanking.customer.infrastructure.adapters.ouput.persistence.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerEntity {
    @Id
    private UUID id;
    private String fistName;
    private String lastName;
    private String businessName;
    private String businessIdentification;
    private String email;
    private String address;
    private String phone;
}
