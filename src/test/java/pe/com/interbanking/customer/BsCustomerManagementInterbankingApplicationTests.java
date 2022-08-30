package pe.com.interbanking.customer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import pe.com.interbanking.customer.domain.model.Customer;
import pe.com.interbanking.customer.domain.service.CustomerService;

import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class BsCustomerManagementInterbankingApplicationTests {
   private static  final String VERSION ="/api/v1";

	@Autowired
	private MockMvc mockMvc;
    @MockBean
	CustomerService customerService;

	@Test
	void createCustomer_PJ1Sebastian() throws Exception {

		Customer customer = Customer.builder()
				.id(UUID.randomUUID())
				.fistName("Sebastian")
				.lastName("Cordova Vasquez")
				.businessName("PepitosSac")
				.businessIdentification("47898795465365466")
				.email("sebastiancordova473@gmail.com")
				.address("Av. Ayacucho 123456")
				.phone("966506777")
				.build();
		when(customerService.createProduct(any(Customer.class))).thenReturn(customer);
		mockMvc.perform(
				MockMvcRequestBuilders.post(VERSION + "/customer")
						.contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON)
				.content(asJsonString(customer)))
				.andExpect(status().isCreated());
	}
	public static String asJsonString(final Object obj){
       try {
         return  new ObjectMapper().writeValueAsString(obj);
	   }catch (Exception ex){
         throw  new RuntimeException(ex);
	   }
	}

}
