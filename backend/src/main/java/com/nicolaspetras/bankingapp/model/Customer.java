package com.nicolaspetras.bankingapp.model;

import com.nicolaspetras.bankingapp.model.account.CurrentAccount;

import java.util.ArrayList;

// add DOB in future?
public class Customer {
    private String forename;
    private ArrayList<String> middleNames;
    private String surname;
    private ArrayList<CurrentAccount> accounts;
}
