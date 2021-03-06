package com.empanada.app.webservice.ui.model.response;

import java.util.List;

import org.springframework.hateoas.RepresentationModel;

public class UserRest extends RepresentationModel<UserRest> {

  // public user id
  private String userId;
  private String firstName;
  private String lastName;
  private String email;
  private List<AddressRest> addresses;

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
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

  public List<AddressRest> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<AddressRest> addresses) {
    this.addresses = addresses;
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }
}
