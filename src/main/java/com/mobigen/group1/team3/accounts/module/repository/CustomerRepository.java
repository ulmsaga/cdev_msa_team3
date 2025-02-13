package com.mobigen.group1.team3.accounts.module.repository;

import java.util.List;
import java.util.Map;

import com.mobigen.group1.team3.accounts.module.dto.CustomerDto;

public interface CustomerRepository {
  List<CustomerDto> getCustomerList(Map<String, Object> param);
  int addCustomer(Map<String, Object> param);
  int delCustomer(Map<String, Object> param);
}
