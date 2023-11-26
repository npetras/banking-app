package com.nicolaspetras.bankingapp.model;

public enum Currency {
    POUND_STERLING("GBP"),
    US_DOLLAR("USD");

    public final String label;

    private Currency(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
