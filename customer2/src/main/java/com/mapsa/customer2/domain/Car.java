package com.mapsa.customer2.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Car {
    Long id;
    String type;
    String color;
}
