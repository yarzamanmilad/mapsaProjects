package com.example.btajpa;

import com.example.btajpa.domain.Flight;
import com.example.btajpa.domain.FlightStatus;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class BtaJpaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BtaJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
      /*  Flight flight=Flight.builder()
                .number("z1111")
                .numberOfEmptySeats(200)
                .numberOfSeat(200)
                .destination("tehran")
                .origin("ilam")
                .startTime(new Date())
                .endTime(new Date())
                .description("airplan classType is A.")
                .status( FlightStatus.ready)
                .build();
        flight=Flight.builder()
                .number("z1112")
                .numberOfEmptySeats(200)
                .numberOfSeat(200)
                .destination("ilam")
                .origin("karbala")
                .startTime(new Date())
                .endTime(new Date())
                .description("airplan classType is B.")
                .status(FlightStatus.ready)
                .build();
        flight=Flight.builder()
                .number("z1113")
                .numberOfEmptySeats(200)
                .numberOfSeat(200)
                .destination("kordestan")
                .origin("mashhad")
                .startTime(new Date())
                .endTime(new Date())
                .description("airplan classType is A.")
                .status(FlightStatus.ready)
                .build();
        flight=Flight.builder()
                .number("z1114")
                .numberOfEmptySeats(200)
                .numberOfSeat(200)
                .destination("mashhad")
                .origin("ilam")
                .startTime(new Date())
                .endTime(new Date())
                .description("airplan classType is A.")
                .status(FlightStatus.ready)
                .build();
        flight=Flight.builder()
                .number("z1115")
                .numberOfEmptySeats(200)
                .numberOfSeat(200)
                .destination("ghome")
                .origin("mashhad")
                .startTime(new Date())
                .endTime(new Date())
                .description("airplan classType is A.")
                .status(FlightStatus.ready)
                .build();
        flight=Flight.builder()
                .number("z1116")
                .numberOfEmptySeats(200)
                .numberOfSeat(200)
                .destination("karbala")
                .origin("mashhad")
                .startTime(new Date())
                .endTime(new Date())
                .description("airplan classType is A.")
                .status(FlightStatus.ready)
                .build();
        flight=Flight.builder()
                .number("z1117")
                .numberOfEmptySeats(200)
                .numberOfSeat(200)
                .destination("mashhad")
                .origin("karbala")
                .startTime(new Date())
                .endTime(new Date())
                .description("")
                .status(FlightStatus.ready)
                .build();*/
    }
}
