package com.covid.app.covid_app.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class config {
    @Bean
    public RestTemplate getInstance(){
        return new RestTemplate();
    }

}
