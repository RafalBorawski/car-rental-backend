package com.miwi.carrental.control.dto;


import com.miwi.carrental.control.validation.ValidEmail;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.hateoas.server.core.Relation;

@Relation(value = "user", collectionRelation = "users")
public class UserDto {

  private Long id;

  @NotNull(message = "The first name can't be null")
  @NotEmpty(message = "The first name can't be empty")
  @Size(min = 5, max = 20, message = "The first name must have a minimum of 5 and a maximum of 15 letters")
  private String firstName;

  @NotNull(message = "The last name can't be null")
  @NotEmpty(message = "The last name can't be empty")
  @Size(min = 3, max = 30, message = "The last name have a minimum of 5 and a maximum of 15 letters")
  private String lastName;

  @ValidEmail
  @NotNull(message = "The email can't be null")
  @NotEmpty(message = "The email can't be empty")
  private String email;

  private Long addressId;

  @NotNull(message = "The city can't be null")
  @NotEmpty(message = "The city name can't be empty")
  private String city;

  @NotNull(message = "The street name can't be null")
  @NotEmpty(message = "The street name can't be empty")
  private String street;

  @NotNull(message = "The house number can't be null")
  @NotEmpty(message = "The house number can't be empty")
  private String houseNumber;

  @NotNull(message = "The zip code can't be null")
  @NotEmpty(message = "The zip code can't be empty")
  @Pattern(regexp = "^\\d{2}[- ]{0,1}\\d{3}$", message = "The zip code must be in the format XX-XXX")
  private String zipCode;

  public UserDto() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Long getAddressId() {
    return addressId;
  }

  public void setAddressId(Long addressId) {
    this.addressId = addressId;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }
}
