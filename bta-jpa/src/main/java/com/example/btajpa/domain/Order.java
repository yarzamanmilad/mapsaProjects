package com.example.btajpa.domain;

import lombok.*;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.Map;

@Entity
@Data
@NoArgsConstructor
@Table(name = "hhh")
public class Order extends BaseEntity<Long> {

}


