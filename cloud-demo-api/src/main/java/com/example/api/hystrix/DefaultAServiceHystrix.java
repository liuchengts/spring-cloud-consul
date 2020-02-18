package com.example.api.hystrix;

import com.example.api.client.AServiceClient;
import org.springframework.stereotype.Component;

@Component
public abstract class DefaultAServiceHystrix implements AServiceClient {
    @Override
    public String getA(Integer a) {
        return " Default hystrix";
    }
}
