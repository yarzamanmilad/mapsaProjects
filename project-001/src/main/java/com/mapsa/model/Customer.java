package com.mapsa.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CUSTOMER")
@SequenceGenerator(
        name = "customer_sequence",
        sequenceName = "CUSTOMER_SEQ",
        allocationSize = 1000, initialValue = 10000
)
@Data
public class Customer {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence")
    private long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "REMARKS")
    private String remarks;
}
