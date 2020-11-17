package com.example.clientapp.client.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data

@Builder
@AllArgsConstructor
//@JsonIgnoreProperties
public class User {
    //private Long id;
   // @JsonProperty("firstName")
    private String firstName;
    //@JsonProperty("lastName")
    private String lastName;
   // private String nationaly;
}
