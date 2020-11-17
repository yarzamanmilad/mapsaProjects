package com.example.btajpa.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.List;

//@Entity
@Data
@NoArgsConstructor
//@Table(name = "FLIGHT")
public class Flight extends BaseEntity<Long> {
/*    private String number;
    private int numberOfSeat;
    private int numberOfEmptySeats;
    private String destination;
    private String origin;
    private Date startTime;
    private Date endTime;
    //@elementColection for list
    @Enumerated(EnumType.STRING)
    private FlightStatus status;
    private String description;
    //private double price;*/
/*@OneToMany(mappedBy="flight",fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
   private List<Order> orders;*/
   /* @OneToOne
    private Order order;
*/

}
