package com.example.demo.repository;

import com.example.demo.model.AccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TransactionRepository extends JpaRepository <AccountDetails , Integer> {

    @Query (value = "SELECT * FROM ACCOUNT WHERE accNo = ?1",nativeQuery = true)
    public AccountDetails findByAccNo ( int receiverAccNo);
}
