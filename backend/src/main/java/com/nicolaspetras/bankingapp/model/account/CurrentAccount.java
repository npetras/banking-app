package com.nicolaspetras.bankingapp.model.account;

import com.nicolaspetras.bankingapp.model.Currency;
import com.nicolaspetras.bankingapp.model.Customer;
import com.nicolaspetras.bankingapp.model.transaction.Transaction;

import java.util.ArrayList;

public class CurrentAccount {
    Customer customer;
    Currency currency;
    int amount;
    ArrayList<Transaction> transactions;
 }
