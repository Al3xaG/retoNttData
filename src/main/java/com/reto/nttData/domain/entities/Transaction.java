package com.reto.nttData.domain.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;


    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    private Date date;

    private String transactionType;

    private Double amount;

    private Double balance;
}
