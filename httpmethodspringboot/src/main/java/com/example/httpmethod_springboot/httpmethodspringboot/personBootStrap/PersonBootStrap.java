package com.example.httpmethod_springboot.httpmethodspringboot.personBootStrap;

import com.example.httpmethod_springboot.httpmethodspringboot.domain.Person;
import com.example.httpmethod_springboot.httpmethodspringboot.repository.PersonRepository;
import com.example.httpmethod_springboot.httpmethodspringboot.service.person.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PersonBootStrap implements CommandLineRunner {
    private final PersonService personService;
    @Override
    public void run(String... args) throws Exception {
        Person person=Person.builder()
                .name("a1")
                .family("b1").build();
        personService.create(person);
        person=Person.builder()
                .name("a2")
                .family("b2").build();
        personService.create(person);
        person=Person.builder()
                .name("a3")
                .family("b3").build();
        personService.create(person);
    }
}
