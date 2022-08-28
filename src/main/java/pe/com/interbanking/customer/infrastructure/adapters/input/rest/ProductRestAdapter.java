package pe.com.interbanking.customer.infrastructure.adapters.input.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pe.com.interbanking.customer.application.ports.input.CreateCustomerUseCase;
import pe.com.interbanking.customer.application.ports.input.GetCustomerUseCase;
import pe.com.interbanking.customer.domain.model.Customer;
import pe.com.interbanking.customer.infrastructure.adapters.input.rest.data.request.CustomerCreateRequest;
import pe.com.interbanking.customer.infrastructure.adapters.input.rest.data.response.CustomerCreateResponse;
import pe.com.interbanking.customer.infrastructure.adapters.input.rest.data.response.CustomerQueryResponse;
import pe.com.interbanking.customer.infrastructure.adapters.input.rest.mapper.CustomerRestMapper;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ProductRestAdapter {
    private final CreateCustomerUseCase createCustomerUseCase;
    private final GetCustomerUseCase getCustomerUseCase;
    private final CustomerRestMapper customerRestMapper;

    @PostMapping("/customer")
    public ResponseEntity<CustomerCreateResponse> createProduct(@RequestBody @Valid CustomerCreateRequest customerCreateRequest){
        Customer customer = customerRestMapper.toCustomer(customerCreateRequest);
        customer = createCustomerUseCase.createProduct(customer);
        return new ResponseEntity<>(customerRestMapper.toCustomerCreateResponse(customer), HttpStatus.OK);
    };

    @GetMapping("/customers/{id}")
    public ResponseEntity<CustomerQueryResponse> getCustomer(@PathVariable UUID id){
        Customer customer = getCustomerUseCase.getProductById(id);
        return  new ResponseEntity<>(customerRestMapper.toCustomerQueryResponse(customer), HttpStatus.OK);
    };

}
