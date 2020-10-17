package com.example.demo.dao;

public interface TransactionDao {

   public int getBalance(int id);

   public void updateBalance( int sender_bal, int id) throws Exception;

   public void updateReceiverBalance(int receiverAccNo, int amount);
}
