package com.thoughtworks.models;

public class AmountMoney {
    private final Integer value;

    public AmountMoney(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }

    AmountMoney add(Integer value) {
        return new AmountMoney(this.value + value);
    }
}
