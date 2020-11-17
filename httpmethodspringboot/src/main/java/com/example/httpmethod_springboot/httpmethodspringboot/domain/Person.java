package com.example.httpmethod_springboot.httpmethodspringboot.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Person {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name,family;
}
