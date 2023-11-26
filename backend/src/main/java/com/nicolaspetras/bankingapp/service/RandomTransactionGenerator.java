package com.nicolaspetras.bankingapp.service;

import com.nicolaspetras.bankingapp.model.transaction.Transaction;

import java.util.ArrayList;
import java.util.Random;

/**
 * Generates a random set of transactions, depending on the input provided in regards to the number of transactions
 * and number of weeks.
 */
public class RandomTransactionGenerator {
    private static final int NUM_DAYS_IN_WEEK = 7;

    private int numOfTransactions;
    private int numOfWeeks;
    private Random random;

    public RandomTransactionGenerator(int numOfTransactions, int numOfWeeks) {
        this.numOfTransactions = numOfTransactions;
        this.numOfWeeks = numOfWeeks;
        this.random = new Random();
    }

    public int getNumOfTransactions() {
        return numOfTransactions;
    }

    public void setNumOfTransactions(int numOfTransactions) {
        this.numOfTransactions = numOfTransactions;
    }

    public int getNumOfWeeks() {
        return numOfWeeks;
    }

    public void setNumOfWeeks(int numOfWeeks) {
        this.numOfWeeks = numOfWeeks;
    }

    public ArrayList<Transaction> generate() {
        int numOfRemainingTransactions = this.numOfTransactions;
        ArrayList<Transaction> generatedTransactions = new ArrayList<>();

        for (int i = 0; i < numOfWeeks; i++) {
            int numOfTransactionForThisWeek = this.random.nextInt(numOfTransactions) + 1;
            numOfRemainingTransactions = numOfRemainingTransactions - numOfTransactionForThisWeek;
            int[] transactionsPerDay = determineTransactionsPerDay(numOfTransactionForThisWeek);
        }
        return generatedTransactions;
    }

    /**
     * Generates an array that states the number of transactions that should be generated for each day of the week.
     * @param numOfTransactionsPerWeek The number of total transactions to be generated for this week
     * @return An array of length 7, with each index representing a day of the week and the value being the
     * number of transactions to generate for that day.
     */
    private int[] determineTransactionsPerDay(int numOfTransactionsPerWeek) {
        int[] transactionsPerDay = new int[NUM_DAYS_IN_WEEK];
        for (int i = 0; i < NUM_DAYS_IN_WEEK; i++) {
            transactionsPerDay[i] = this.random.nextInt(numOfTransactionsPerWeek);
            numOfTransactionsPerWeek = numOfTransactionsPerWeek - transactionsPerDay[i];
        }
        return transactionsPerDay;
    }


}
