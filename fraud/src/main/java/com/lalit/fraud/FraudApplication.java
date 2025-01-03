package com.lalit.fraud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class FraudApplication {
    public static void main( String[] args )
    {    SpringApplication.run(FraudApplication.class,args);

    }

}
