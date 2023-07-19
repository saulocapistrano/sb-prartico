package com.gm2.dev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    public String getMessage(){
        return "Texto de configuração";
    }

    @Bean
    public void init(){
        System.out.println("Inicializado");
    }
}
