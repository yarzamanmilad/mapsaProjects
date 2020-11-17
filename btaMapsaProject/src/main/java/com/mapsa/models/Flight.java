package com.mapsa.models;

import javax.persistence.*;

@Entity
@Table(name ="Flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String flightNumber;

    public Flight() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}
