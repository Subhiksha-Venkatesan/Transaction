package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Transaction {

    private int senderAccNo;
    private int receiverAccNo;
    private int amount;

}
