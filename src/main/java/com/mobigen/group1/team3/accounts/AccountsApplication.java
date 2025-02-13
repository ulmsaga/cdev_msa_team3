package com.mobigen.group1.team3.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.mobigen.group1.team3.accounts")
public class AccountsApplication {

    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "false");
        try {
            SpringApplication.run(AccountsApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
