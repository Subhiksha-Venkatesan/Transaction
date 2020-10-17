package com.example.demo.service;

import com.example.demo.dao.TransactionDaoImpl;
import com.example.demo.model.Transaction;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionService {

    @NonNull
    private TransactionDaoImpl transactionDaoimpl;

    public void payment (int id, Transaction details) throws Exception {
        int balance = transactionDaoimpl.getBalance(id);
        if(balance > details.getAmount()) {
            int sender_bal = balance - details.getAmount();
            transactionDaoimpl.updateBalance(sender_bal, id);
            transactionDaoimpl.updateReceiverBalance(details.getReceiverAccNo(),details.getAmount());
        }

    }
}
