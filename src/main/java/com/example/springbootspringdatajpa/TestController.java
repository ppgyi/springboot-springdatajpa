package com.example.springbootspringdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/product") === toto je end point pre vsetkych!
@RequestMapping("/animal")
public class TestController {

    @Autowired
    private TestAnimalServiceImplement serviceImplement;

    // potom toto vyzera takto: .../product/hello
    // @GetMapping("/hello")
    public String hello(){
        return "Hello world";
    }

    @GetMapping()
    public List<TestAnimalResponse> getAllAnimals(){}
}
