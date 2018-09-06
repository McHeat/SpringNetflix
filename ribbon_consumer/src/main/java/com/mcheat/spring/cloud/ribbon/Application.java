package com.mcheat.spring.cloud.ribbon;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.util.Calendar;
import java.util.Date;

/**
 * 启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Application {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {

        new SpringApplicationBuilder(Application.class).run(args);
    }
}
