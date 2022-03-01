package com.example.springbootspringdatajpa.logika;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private int counter = 0;

    @GetMapping("/hello")
    public String hello(){
        return "hello world" + (this.counter++);
    }

    // http://localhost:8080/param?name=Peter
    // ak nedame nic tak da defaultvalue
    @GetMapping("/param")
    public String helloParam(@RequestParam(
            name = "name", defaultValue = "WORLD") String name){
        return "Hello " + name;
    }

    // http://localhost:8080/param/Peter
    @GetMapping("/param/{name}")
    public String helloPathParam(@PathVariable("name") String name){
        return "Hello " + name;
    }
}
