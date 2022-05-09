package com.quintrix.jfs.quintrixspring.models;

public class Customer {

  Long carID;
  Long customerID;
  String firstName;
  String lastName;
  String model;
  Integer year;

  public Customer() {}

  public Long getcarID() {
    return carID;
  }

  public void setcarID(Long id) {
    this.carID = id;
  }

  public Long getcustomerID() {
    return customerID;
  }

  public void setcustomerID(Long id) {
    this.customerID = id;
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

