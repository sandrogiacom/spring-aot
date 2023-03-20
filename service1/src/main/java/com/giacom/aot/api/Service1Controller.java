package com.giacom.aot.api;

import com.giacom.aot.basics.Customer;
import com.giacom.aot.basics.CustomerRepository;
import com.giacom.aot.exception.CustomerNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {

    private CustomerRepository repository;

    public Service1Controller(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/customer-1/{id}")
    private Customer getCustomer1(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow(
                () -> new CustomerNotFoundException()
        );
    }

}
