package com.example.springbootspringdatajpa.controllers;

import com.example.springbootspringdatajpa.TestAnimalRequest;
import com.example.springbootspringdatajpa.response.TestAnimalResponse;
import com.example.springbootspringdatajpa.service_implementacia.TestAnimalServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/animal")
public class TestAnimalController {

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

    // http://localhost:8080/animal/3?person=3
    // Priradenie perosny k zvieratu:
    @PutMapping("/{id}")
    public TestAnimalResponse addPersonToAnimal(@PathVariable("id") long animalId,
                                                @RequestParam("person") long personId){
        return new TestAnimalResponse(this.serviceImplement
                .addPersonToAnimal(animalId, personId));
    }

    @PostMapping()
    public TestAnimalResponse addAnimal(@RequestBody TestAnimalRequest request){
        return new TestAnimalResponse(this.serviceImplement.create(request));
    }

    @DeleteMapping("/{id}")
    public Optional<String> deleteProduct(@PathVariable(value = "id") Long id){
        return serviceImplement.findById(id).map(p -> {
            serviceImplement.deleteById(id);
            return "Animal deleted";
        });
    }

    // Vyhladavanie:
    @GetMapping("/{name}")
    public List<TestAnimalResponse> getAllAnimalsByName(@PathVariable("name") String name) {
        return this.serviceImplement.getAllByName(name).stream()
                .map(TestAnimalResponse::new)
                .collect(Collectors.toList());
    }
}
