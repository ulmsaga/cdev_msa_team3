package com.mobigen.group1.team3.accounts.module.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mobigen.group1.team3.accounts.module.dto.CustomerDto;
import com.mobigen.group1.team3.accounts.module.dto.RsResultDto;
import com.mobigen.group1.team3.accounts.module.service.CustomerService;

@RestController
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
  
    @RequestMapping(value = "/customerList", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RsResultDto> customerList(@RequestBody Map<String, Object> param) {
        RsResultDto result = new RsResultDto();
        List<CustomerDto> list = customerService.getCustomerList(param);
        result.setRs(list);
        return ResponseEntity.ok(result);
    }


    @RequestMapping(value = "/getCustomerList", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RsResultDto> getCustomerList(@RequestParam Map<String, Object> param) {
        RsResultDto result = new RsResultDto();
        List<CustomerDto> list = customerService.getCustomerList(param);
        result.setRs(list);
        return ResponseEntity.ok(result);
    }

    @RequestMapping(value = "/addCustomer", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RsResultDto> addCustomer(@RequestBody Map<String, Object> param) {
        RsResultDto result = new RsResultDto();
        result.setRs(customerService.addCustomer(param));
        return ResponseEntity.ok(result);
    }

    @RequestMapping(value = "/delCustomer", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RsResultDto> delCustomer(@RequestBody Map<String, Object> param) {
        RsResultDto result = new RsResultDto();
        result.setRs(customerService.delCustomer(param));
        return ResponseEntity.ok(result);
    }

}
