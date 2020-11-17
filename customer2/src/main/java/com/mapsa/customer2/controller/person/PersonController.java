package com.mapsa.customer2.controller.person;

import com.mapsa.customer2.data.PersonDto;
import com.mapsa.customer2.domain.Person;
import com.mapsa.customer2.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {
    @Autowired
    PersonRepository personRepository;
    @GetMapping("/{id}")
    public ResponseEntity<?> getPerson(@PathVariable Long id){

       return new ResponseEntity<>(personRepository.findById(id), HttpStatus.OK);
    }
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Person> getAll(){

        return personRepository.findAll();
    }
    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    public Person create(@RequestBody  Person person){

        return personRepository.save(person);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> putPerson(@PathVariable Long id, @RequestBody PersonDto personDto){

        return new ResponseEntity<>(personRepository.findById(id), HttpStatus.OK);
    }
    @PatchMapping("/{id}")
    public ResponseEntity<?> patchPerson(@PathVariable Long id){

        return new ResponseEntity<>(personRepository.findById(id), HttpStatus.OK);
    }
}
