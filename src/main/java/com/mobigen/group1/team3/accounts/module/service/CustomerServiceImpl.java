package com.mobigen.group1.team3.accounts.module.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mobigen.group1.team3.accounts.module.dto.CustomerDto;
import com.mobigen.group1.team3.accounts.module.repository.CustomerRepository;


@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerDto> getCustomerList(Map<String, Object> param) {
        return customerRepository.getCustomerList(param);
    }

    @Override
    public int addCustomer(Map<String, Object> param) {
        return customerRepository.addCustomer(param);
    }

    @Override
    public int delCustomer(Map<String, Object> param) {
        return customerRepository.delCustomer(param);
    }
  
}
