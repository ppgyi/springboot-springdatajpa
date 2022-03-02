package com.example.springbootspringdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/animal")
public class TestController {

    @Autowired
    private TestAnimalServiceImplement serviceImplement;


    @GetMapping()
    public List<TestAnimalResponse> getAllAnimals(){
        return this.serviceImplement.getAll().stream()
                .map(TestAnimalResponse::new)
                .collect(Collectors.toList());
        // Alebo takto je to to iste:
//        var result = new ArrayList<TestAnimalResponse>();
//        for (TestEntityAnimal a : this.serviceImplement.getAll()){
//            result.add(new TestAnimalResponse(a));
//        }
//        return result;
    }
}
