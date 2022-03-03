package com.example.springbootspringdatajpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class TestEntityAnimal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String species;

    // Kvoli vyhladavaniu
    private String name;

    @OneToOne
    private TestEntityPerson person;

    @OneToMany
    private List<TestEntityPerson> personList = new ArrayList<>();
    // musel som vytvorit v my sql novu tabulku a pridat 3 stlpce s IDCKAMI
}
