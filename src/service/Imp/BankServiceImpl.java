package service.Imp;

import domain.Account;
import repository.AccountRepository;
import service.BankService;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class BankServiceImpl implements BankService {

    private final AccountRepository accountRepository = new AccountRepository();

    @Override
    public String openAccount(String name,String email,String accountType) {
        String customerId= UUID.randomUUID().toString();

        String accountNumber = getAccountNumber();
        Account a =new Account(accountNumber,accountType, (double) 0,customerId);
        accountRepository.save(a);
        return accountNumber;
    }

    @Override
    public List<Account> listAccounts(){
        return accountRepository.findAll().stream().sorted(Comparator.comparing(Account::getAccountNumber))
                .collect(Collectors.toList());
    }

    private String getAccountNumber(){
        int temp= accountRepository.findAll().size()+1;
        String accountNumber= String.format("AC%06d",temp);
        return accountNumber;
    }
}
