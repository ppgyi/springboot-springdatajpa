package com.example.springbootspringdatajpa.logika;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String createResponse(HelloRequestBody request){
        return "Hello " + request.getName();
    }
}
