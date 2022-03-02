package com.example.springbootspringdatajpa.controllers;

import com.example.springbootspringdatajpa.response.TestPersonResponse;
import com.example.springbootspringdatajpa.service_implementacia.TestPersonServiceImplementacia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/person")
public class TestPersonController {

    @Autowired
    private TestPersonServiceImplementacia serviceImplementacia;

    @GetMapping()
    public List<TestPersonResponse> getAll() {
        return this.serviceImplementacia.findAll().stream()
                .map(TestPersonResponse::new)
                .collect(Collectors.toList());
    }
}
