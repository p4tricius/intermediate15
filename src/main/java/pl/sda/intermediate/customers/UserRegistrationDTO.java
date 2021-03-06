package pl.sda.intermediate.customers;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRegistrationDTO {

    private String firstName;
    private String lastName;
    private String eMail;
    private String birthDate;
    private String pesel;
    private String phone;
    private String password;
    private String city;
    private String country;
    private String zipCode;
    private String street;
    private boolean preferEmails;


}
