package com.reto.nttData.domain.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clients")
public class Client extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long clientId;

    private String password;

    private Boolean status;

    //@OneToMany(cascade = CascadeType.ALL)
    @OneToMany
    private List<Account> accounts = new ArrayList<>();

}
