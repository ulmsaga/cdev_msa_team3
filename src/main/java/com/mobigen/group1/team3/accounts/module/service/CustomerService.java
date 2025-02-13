package com.mobigen.group1.team3.accounts.module.service;

import java.util.List;
import java.util.Map;

import com.mobigen.group1.team3.accounts.module.dto.CustomerDto;

public interface CustomerService {
    List<CustomerDto> getCustomerList(Map<String, Object> param);
    int addCustomer(Map<String, Object> param);
    int delCustomer(Map<String, Object> param);
}
