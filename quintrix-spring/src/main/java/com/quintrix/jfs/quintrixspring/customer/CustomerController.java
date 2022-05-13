package com.quintrix.jfs.quintrixspring.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.quintrix.jfs.quintrixspring.models.Customer;
import com.quintrix.jfs.quintrixspring.repository.CustomerRepository;

@RestController
public class CustomerController {
  @Autowired
  CustomerRepository repo;

  @RequestMapping("/count")
  Long getCustomerCount() {
    // Car car = new Car(1L, "Ford", "SUV", 2011);
    return repo.count();
  }

  @RequestMapping(method = RequestMethod.POST, value = "/customer")
  Customer test(@RequestBody Customer customer) {
    return repo.save(customer);
  }
}

// CustomerService customerService;

// @Value(*$(http://localhost:8083/customer)*)
/*
 * ConnectionString connectionString = new ConnectionString(
 * "mongodb+srv://hamr1:<password>@cluster0.qo4k1.mongodb.net/myFirstDatabase?retryWrites=true&w=majority"
 * ); MongoClientSettings settings =
 * MongoClientSettings.builder().applyConnectionString(connectionString)
 * .serverApi(ServerApi.builder().version(ServerApiVersion.V1).build()).build(); MongoClient
 * mongoClient = MongoClients.create(settings); MongoDatabase database =
 * mongoClient.getDatabase("test"); String getCustomerUrl;
 */

// public List<Customer> getCustomers(){

// ResponseEntity<List<Customer>>


