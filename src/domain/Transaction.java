package domain;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private Type type;
    private String accountNumber;
    private Double amount;
    private LocalDateTime timestamp;
    private String note;

    public Transaction(String id, String note, LocalDateTime timestamp, String accountNumber, Double amount, Type type) {
        this.id = id;
        this.note = note;
        this.timestamp = timestamp;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.type = type;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getId() {
        return id;
    }

    public String getNote() {
        return note;
    }

    public Double getAmount() {
        return amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Type getType() {
        return type;
    }
}
