package com.example.springbootspringdatajpa.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class TestEntityPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // @ManyToOne
    @OneToOne
    private TestEntityAnimal animal;

    public TestEntityPerson(String name) {
        this.name = name;
    }
}
