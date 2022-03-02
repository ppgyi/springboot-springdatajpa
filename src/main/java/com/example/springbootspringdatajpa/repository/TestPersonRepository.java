package com.example.springbootspringdatajpa.repository;

import com.example.springbootspringdatajpa.entity.TestEntityPerson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestPersonRepository extends CrudRepository<TestEntityPerson, Long> {

}
