package pe.com.interbanking.customer.infrastructure.adapters.ouput.customizedexception.data.response;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {
    private LocalDateTime date;
    private String message;
    private List<String> details;
}
