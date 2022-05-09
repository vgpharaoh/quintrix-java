package com.quintrix.jfs.quintrixspring.customer;

public class Validations {
  public static void main(String[] args) {

  }

  boolean validateEmail(String email) {
    if (email.contains("@")) {
      return true;
    } else
      return false;
  }


}
