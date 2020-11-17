package com.mapsa.customer2;

import com.mapsa.customer2.domain.Person;
import com.mapsa.customer2.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Customer2Application implements CommandLineRunner {
        @Autowired
    PersonRepository personRepository;
    public static void main(String[] args) {
        SpringApplication.run(Customer2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Person person=Person.builder()
                .name("milad1")
                .family("yarzaman1")
                .build();
        personRepository.save(person);

        person=Person.builder()
                .name("milad2")
                .family("yarzaman2")
                .build();
        personRepository.save(person);

        person=Person.builder()
                .name("milad3")
                .family("yarzaman3")
                .build();
        personRepository.save(person);

        person=Person.builder()
                .name("milad4")
                .family("yarzaman4")
                .build();
        personRepository.save(person);
    }
}
