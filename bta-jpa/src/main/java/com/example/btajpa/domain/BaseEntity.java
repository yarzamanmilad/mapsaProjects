package com.example.btajpa.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
@MappedSuperclass
@Data
@NoArgsConstructor
public class BaseEntity <T extends Serializable>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private T id;
}
