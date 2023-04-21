package com.reto.nttData.domain.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Person {
    private String name;

    private String gender;

    private Integer age;

    private String dni;

    private String address;

    private String phoneNumber;
}
