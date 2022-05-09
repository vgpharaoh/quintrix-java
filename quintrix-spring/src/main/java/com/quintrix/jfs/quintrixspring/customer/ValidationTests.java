package com.quintrix.jfs.quintrixspring.customer;

// import java.util.ArrayList;
// import java.util.List;
import org.junit.Test;

public class ValidationTests {

  Validations validation;

  @Test
  public void validateEmailForNoAt() {
    validation.validateEmail("Hussein");
  }
}
