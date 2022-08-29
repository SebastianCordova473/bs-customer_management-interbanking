package pe.com.interbanking.customer.infrastructure.adapters.input.rest.data.request;

import lombok.*;

import javax.validation.constraints.NotEmpty;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerCreateRequest {
    @NotEmpty(message = "firstName may not be empty")
    private String fistName;

    @NotEmpty(message = "lastName may not be empty")
    private String lastName;

    @NotEmpty(message = "businessName may not be empty")
    private String businessName;

    @NotEmpty(message = "businessIdentification may not be empty")
    private String businessIdentification;

    @NotEmpty(message = "email may not be empty")
    private String email;

    @NotEmpty(message = "address may not be empty")
    private String address;

    @NotEmpty(message = "phone may not be empty")
    private String phone;
}
