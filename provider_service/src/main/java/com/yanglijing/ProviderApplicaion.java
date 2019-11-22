package com.yanglijing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ProviderApplicaion
 * @Description: TODO
 * @Author :yanglijing
 * @Date 2019/11/22
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class ProviderApplicaion {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplicaion.class,args);
    }
}
