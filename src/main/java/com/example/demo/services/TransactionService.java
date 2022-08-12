package com.example.demo.services;
import com.example.demo.models.Transaction;
import com.example.demo.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;
    public ArrayList<Transaction> getAllTransactions (){
        return (ArrayList<Transaction>) transactionRepository.findAll();
    }
    public Transaction createTransaction (Transaction transaction){
        return transactionRepository.save(transaction);
    }
    public Optional<Transaction> getTransactionById (Long id){
        return transactionRepository.findById(id);
    }
    public boolean deleteTransaction (Long id){
        try {
            transactionRepository.deleteById(id);
            return true;
        }catch (Exception ex){
            return false;
        }

    }

}
