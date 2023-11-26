package com.nicolaspetras.bankingapp.model.transaction;

import java.time.LocalDateTime;

public class Transaction {
    private TransactionCategory category;
    private Direction direction;
    private LocalDateTime dateTime;
    private CurrencyAndAmount currencyAndAmount;
}
