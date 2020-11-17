package com.example.httpmethod_springboot.httpmethodspringboot.repository;

import com.example.httpmethod_springboot.httpmethodspringboot.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository <Person, Long> {
}
