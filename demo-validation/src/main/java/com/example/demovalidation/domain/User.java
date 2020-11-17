package com.example.demovalidation.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;
@Data
public class User {
    @NotEmpty(message = "firstName is required.")
    private String firstName;
    @NotEmpty(message = "firstName is required.")
    private String lastName;
    @NotEmpty(message = "firstName is required.")
    @Email
    private String email;
    @NotBlank(message = "firstName is required.")
    @Size(max = 8,min = 4)
    private String password;
    @Min(18)
    @Digits(integer = 2,fraction = 0)
    private int age;
    @Past
    @JsonFormat(pattern = "yyyy-mm-dd")
    private LocalDate birthDate;
    @Pattern(regexp = "^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$")
    private String subscribeNumber;

}
