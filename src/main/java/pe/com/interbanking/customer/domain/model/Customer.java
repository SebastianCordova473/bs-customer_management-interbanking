package pe.com.interbanking.customer.domain.model;

import lombok.*;

import java.util.UUID;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {

    private UUID id;
    private String fistName;
    private String lastName;
    private String businessName;
    private String businessIdentification;
    private String email;
    private String address;
    private String phone;
}
