package com.service.eurekaservice.service;

import org.springframework.stereotype.Service;


public interface WeatherService {
    public Integer getTemperature(String city, String country);
}
