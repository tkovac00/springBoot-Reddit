package com.example.udemy.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
*This is welcome message
*/
@ConfigurationProperties("springit")
public class SpringitProperties {

    @Getter
    @Setter
    private String welcomeMessage="Hello world";
}
