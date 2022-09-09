package com.example.playground.repository;

import com.example.playground.model.Customer;

import java.util.List;

public interface CustomerRepo {
    List<Customer> getCustomers();
}
