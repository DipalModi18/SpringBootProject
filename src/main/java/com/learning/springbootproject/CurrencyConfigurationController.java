package com.learning.springbootproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class CurrencyConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration configuration;

        @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveAllConfig() {
        return configuration;
    }
}
