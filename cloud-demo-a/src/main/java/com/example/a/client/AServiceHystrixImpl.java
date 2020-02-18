package com.example.a.client;

import com.example.api.hystrix.DefaultAServiceHystrix;
import org.springframework.stereotype.Component;

@Component
public class AServiceHystrixImpl extends DefaultAServiceHystrix {
    @Override
    public String getA(Integer a) {
        return "a Override hystrix";
    }
}
