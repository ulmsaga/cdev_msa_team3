package com.mobigen.group1.team3.accounts.module.repository;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.mobigen.group1.team3.accounts.module.dto.CustomerDto;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    private final SqlSessionTemplate sqlSessionTemplatePemdb1;
    private final String namespace = "com.mobigen.group1.team3.accounts.module.customer.";
    // Constructor
    public CustomerRepositoryImpl(SqlSessionTemplate sqlSessionTemplatePemdb1) {
        this.sqlSessionTemplatePemdb1 = sqlSessionTemplatePemdb1;
    }

    @Override
    public List<CustomerDto> getCustomerList(Map<String, Object> param) {
        return sqlSessionTemplatePemdb1.selectList(namespace + "getCustomerList", param);
    }
  
    @Override
    public int addCustomer(Map<String, Object> param) {
        return sqlSessionTemplatePemdb1.insert(namespace + "addCustomer", param);
    }

    @Override
    public int delCustomer(Map<String, Object> param) {
        return sqlSessionTemplatePemdb1.delete(namespace + "delCustomer", param);
    }
}
