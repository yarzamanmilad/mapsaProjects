package com.example.metric.controller;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service-test")
public class ServiceController {
    @GetMapping
    @Timed(value = "myMetric",histogram = true,extraTags = {"version","1.0"},percentiles = {0.95, 0.99})
    public String getTest(){

        return "is ok";
    }
}
