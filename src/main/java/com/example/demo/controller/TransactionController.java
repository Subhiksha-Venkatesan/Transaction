package com.example.demo.controller;

import com.example.demo.model.Transaction;
import com.example.demo.service.TransactionService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class TransactionController {

    @NonNull
    private TransactionService service;

    @PutMapping("/transaction/{id}")
    public void trans (@PathVariable(value = "id") int id, @RequestBody Transaction details) throws Exception {
        service.payment( id, details );
    }
}
