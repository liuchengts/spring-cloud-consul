package com.example.b;

import com.example.api.client.AServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
@ComponentScan(value = {"com.example"})
public class DemoBApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoBApplication.class, args);
    }

    @Autowired
    AServiceClient aServiceClient;

    //todo  这个访问是失败的,貌似不能通过 FeignClient 访问 只能使用 RestTemplate
    @GetMapping("test/a")
    public String getA() {
        return aServiceClient.getA(1);
    }

}
