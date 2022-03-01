package com.example.springbootspringdatajpa.logika;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary - toto dame ked mame viac @Service ktore implementuju rovnaku
// interface, budu mat rovnake metody, preto treba takto urcit ktora je
// hlavna.
@Service
public class HelloService {

    public String createResponse(HelloRequestBody request){
        return "Hello " + request.getName();
    }
}
