package pe.com.interbanking.customer.domain.exception;


public class CustomerNotFound  extends  RuntimeException{
 public CustomerNotFound(String message){
     super(message);
 }
}
