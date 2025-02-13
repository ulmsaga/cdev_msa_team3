package com.mobigen.group1.team3.accounts.module.dto;

public class CustomerDto {
  private String customer_id;
  private String customer_name;
  private String mobile_phone;
  private String email;

  public String getCustomer_id() {
    return customer_id;
  }

  public void setCustomer_id(String customer_id) {
    this.customer_id = customer_id;
  }

  public String getCustomer_name() {
    return customer_name;
  }

  public void setCustomer_name(String customer_name) {
    this.customer_name = customer_name;
  }

  public String getMobile_phone() {
    return mobile_phone;
  }

  public void setMobile_phone(String mobile_phone) {
    this.mobile_phone = mobile_phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
