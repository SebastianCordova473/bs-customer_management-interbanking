package pe.com.interbanking.customer.infrastructure.adapters.input.rest.mapper;
import pe.com.interbanking.customer.infrastructure.adapters.input.rest.data.request.CustomerCreateRequest;
import org.mapstruct.Mapper;
import pe.com.interbanking.customer.domain.model.Customer;
import pe.com.interbanking.customer.infrastructure.adapters.input.rest.data.response.CustomerCreateResponse;
import pe.com.interbanking.customer.infrastructure.adapters.input.rest.data.response.CustomerQueryResponse;

@Mapper
public interface CustomerRestMapper {
    Customer toCustomer(CustomerCreateRequest customerCreateRequest);
    CustomerCreateResponse toCustomerCreateResponse(Customer customer);
    CustomerQueryResponse toCustomerQueryResponse(Customer customer);
}
