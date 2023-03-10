package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerRepository CustomerRepository;   

@GetMapping("/customers")

public List<Customer> findAll(){
  return CustomerRepository.findAll();
}
 @GetMapping("/customers/{id}")
 public Optional<Customer> findById(@PathVariable Integer id){
     return CustomerRepository.findById(id);
 }

    
}
