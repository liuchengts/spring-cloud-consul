package com.example.a.client;

import com.example.a.service.AService;
import com.example.api.client.AServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("internal/a")
public class AServiceClientImpl implements AServiceClient {
    @Autowired
    AService aService;

    @Override
    public String getA(@RequestParam Integer a) {
        return aService.getA(a);
    }
}
