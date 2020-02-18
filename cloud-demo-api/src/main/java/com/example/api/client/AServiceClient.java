package com.example.api.client;

import com.example.api.hystrix.DefaultAServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "demo-a", fallback = DefaultAServiceHystrix.class)
public interface AServiceClient {

    @GetMapping(value = "get_a")
    String getA(@RequestParam Integer a);
}
