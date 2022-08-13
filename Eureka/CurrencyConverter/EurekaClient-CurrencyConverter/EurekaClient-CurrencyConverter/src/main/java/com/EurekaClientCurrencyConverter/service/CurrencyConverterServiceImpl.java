package com.EurekaClientCurrencyConverter.service;

import com.EurekaClientCurrencyConverter.service.CurrencyConverterService;
import org.springframework.stereotype.Service;

@Service
public class CurrencyConverterServiceImpl implements CurrencyConverterService {
    @Override
    public Double convertCurrency(String from, String to) {
        Double random = Math.random()+150;
        return random;
    }
}
