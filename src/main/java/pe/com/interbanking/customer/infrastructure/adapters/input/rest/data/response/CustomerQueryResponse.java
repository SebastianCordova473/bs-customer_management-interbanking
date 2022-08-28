package pe.com.interbanking.customer.infrastructure.adapters.input.rest.data.response;

import lombok.*;

import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerQueryResponse {
    private UUID id;
    private String fistName;
    private String lastName;
    private String businessName;
    private String businessIdentification;
    private String email;
    private String address;
    private String phone;
}
