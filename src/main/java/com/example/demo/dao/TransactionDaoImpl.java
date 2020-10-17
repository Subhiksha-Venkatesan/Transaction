package com.example.demo.dao;

import com.example.demo.model.AccountDetails;
import com.example.demo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;



@Component
public class TransactionDaoImpl implements TransactionDao {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public int getBalance (int id ){
        Optional<AccountDetails> user = transactionRepository.findById(id);
        return user.get().getBalance();
    }

    @Override
    public void updateBalance(int sender_bal, int id) throws Exception {
        AccountDetails user = transactionRepository.findById(id)
                .orElseThrow(() -> new Exception("Employee not found for this id :: " + id));
        user.setBalance(sender_bal);
        transactionRepository.save(user);
    }

    @Override
    public void updateReceiverBalance(int receiverAccNo, int amount) {
        AccountDetails user = transactionRepository.findByAccNo(receiverAccNo);
        user.setBalance(amount+ user.getBalance());
        transactionRepository.save(user);
    }
}
