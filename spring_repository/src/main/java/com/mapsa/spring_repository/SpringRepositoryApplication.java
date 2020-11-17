package com.mapsa.spring_repository;

import com.mapsa.spring_repository.domain.Personn;
import com.mapsa.spring_repository.repository.flight.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRepositoryApplication implements CommandLineRunner {
        @Autowired
    IPersonRepository iPersonRepository;
    public static void main(String[] args) {
        SpringApplication.run(SpringRepositoryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        iPersonRepository.save(new Personn(0L,"a1","b1","9180"));
        iPersonRepository.save(new Personn(0L,"a2","b2","9181"));
        iPersonRepository.save(new Personn(0L,"a3","b3","9182"));
        iPersonRepository.save(new Personn(0L,"a4","b4","9183"));

    }
}
