package com.example.demo.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "account")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class AccountDetails {

    @Id
    private int id;
    private int accNO;
    private int balance;

}
