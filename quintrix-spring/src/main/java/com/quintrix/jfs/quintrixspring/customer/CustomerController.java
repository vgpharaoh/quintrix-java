package com.quintrix.jfs.quintrixspring.customer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import com.quintrix.jfs.quintrixspring.models.Customer;

public class CustomerController {
  @Autowired
  CustomerService ccustomerService;

  // @Value(*$(http://localhost:8083/customer)*)
  ConnectionString connectionString = new ConnectionString(
      "mongodb+srv://hamr1:<password>@cluster0.qo4k1.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
  MongoClientSettings settings =
      MongoClientSettings.builder().applyConnectionString(connectionString)
          .serverApi(ServerApi.builder().version(ServerApiVersion.V1).build()).build();
  MongoClient mongoClient = MongoClients.create(settings);
  MongoDatabase database = mongoClient.getDatabase("test");
  String getCustomerUrl;

  public List<Customer> getCustomers(){
    
    ResponseEntity<List<Customer>> 
  }
}
