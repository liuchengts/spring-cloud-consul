package com.example.b.hystrix;

import com.example.api.hystrix.DefaultAServiceHystrix;
import org.springframework.stereotype.Component;

@Component
public class AServiceHystrixImpl extends DefaultAServiceHystrix {
    @Override
    public String getA(Integer a) {
        return "b Override hystrix";
    }
}
