package com.example.springbootspringdatajpa.entity;

import lombok.Data;

import javax.persistence.*;

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
}
