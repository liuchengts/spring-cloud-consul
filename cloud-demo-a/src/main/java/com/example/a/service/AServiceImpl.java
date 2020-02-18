package com.example.a.service;

import org.springframework.stereotype.Service;

@Service
public class AServiceImpl implements AService {
    @Override
    public String getA(Integer a) {
        return a + " | " + System.currentTimeMillis();
    }
}
