package com.mapsa.spring_repository.controller.flight;

import com.mapsa.spring_repository.domain.Personn;
import com.mapsa.spring_repository.repository.flight.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("persons")
public class PersonController {
    @Autowired
    IPersonRepository iPersonRepository;
    @GetMapping
    public ResponseEntity<List<Personn>> personns(){

        return ResponseEntity.ok(iPersonRepository.findAll());
    }
}
