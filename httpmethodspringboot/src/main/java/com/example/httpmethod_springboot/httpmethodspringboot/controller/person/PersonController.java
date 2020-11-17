package com.example.httpmethod_springboot.httpmethodspringboot.controller.person;

import com.example.httpmethod_springboot.httpmethodspringboot.domain.Person;
import com.example.httpmethod_springboot.httpmethodspringboot.exception.CostomException;
import com.example.httpmethod_springboot.httpmethodspringboot.service.person.PersonService;
import javassist.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;
    @GetMapping("{id}")
    public ResponseEntity<?> get(@PathVariable Long id){
        try {
            return ResponseEntity.ok(personService.get(id));
        }catch (CostomException e){
            e.printStackTrace();
            return ResponseEntity.ok(e.getMessage());
        }


    }
    @GetMapping("/getAll")
    public List<Person> getAll(){
        return personService.getAll();
    }
    @GetMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Person create(@RequestBody Person person){
        return personService.create(person);
    }
    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Person put(@PathVariable Long id,@RequestBody Person person){
        if (person.getName()==null||person.getFamily()==null){
            throw  new IllegalStateException("invalid data.");}
        return personService.put(person,id);
    }
    @PatchMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Person patch(@PathVariable Long id,@RequestBody Person person){
        return personService.patch(person,id);
    }
}
