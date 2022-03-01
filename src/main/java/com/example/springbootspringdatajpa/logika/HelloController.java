package com.example.springbootspringdatajpa.logika;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

//    @Autowired
//    bud dame toto alebo to inicializujeme cez konstruktor -
//    odporoca sa cez konstruktor
    private HelloService service;

    public HelloController(HelloService service) {
        this.service = service;
    }

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

    // http://localhost:8080/body POST metoda body JSON:
    // {
    //    "name":"Daniel"
    // }
    @PostMapping("/body")
    public String body(@RequestBody HelloRequestBody body){
        return service.createResponse(body);
    }
}
