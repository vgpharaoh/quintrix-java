package com.quintrix.jfs.quintrixspring.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Customer")
public class Customer {
  @Id
  Long carID;
  Long customerID;
  String firstName;
  String lastName;
  String model;
  Integer year;

  public Customer() {}



  public Long getCarID() {
    return carID;
  }



  public void setCarID(Long carID) {
    this.carID = carID;
  }



  public Long getCustomerID() {
    return customerID;
  }



  public void setCustomerID(Long customerID) {
    this.customerID = customerID;
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



  public String getModel() {
    return model;
  }



  public void setModel(String model) {
    this.model = model;
  }



  public Integer getYear() {
    return year;
  }



  public void setYear(Integer year) {
    this.year = year;
  }



  public Customer(Long carID, String firstName, String lastName, String model, Integer year) {
    super();
    this.carID = carID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.model = model;
    this.year = year;
  }


}

