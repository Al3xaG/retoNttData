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
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String accountNumber;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    private String accountType;

    private Double initialBalance;

    private Boolean status;

    //@OneToMany(cascade = CascadeType.ALL)
    @OneToMany
    private List<Transaction> transactions = new ArrayList<>();




}
