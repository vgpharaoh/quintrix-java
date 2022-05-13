package com.quintrix.jfs.quintrixspring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.quintrix.jfs.quintrixspring.models.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}
