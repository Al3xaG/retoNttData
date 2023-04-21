package com.reto.nttData.domain.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
    private String name;
    private String gender;
    private Integer age;
    private String dni;
    private String address;
    private String phoneNumber;
}
