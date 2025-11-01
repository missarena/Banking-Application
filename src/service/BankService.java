package service;

import domain.Account;
import domain.Transaction;
import repository.AccountRepository;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public interface BankService {
    String openAccount(String name, String email, String accountType);

    List<Account> listAccounts();

    void deposit(String accountNumber, Double amount, String note);

    void withdraw(String accountNumber, Double amount, String withdrawal);

    void transfer(String from, String to, Double amount, String transfer);

    List<Transaction> getStatement(String account);

    List<Account> searchAccountsByCustomerName(String q);

}