package com.lalit.customer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(
        scanBasePackages = {
                "com.lalit.customer",
                "com.lalit.amqp",
        }
)@EnableEurekaClient
@EnableFeignClients(basePackages = "com.lalit.client")
public class CustomerApplication
{
    public static void main( String[] args )
    {    SpringApplication.run(CustomerApplication.class,args);

    }

}
