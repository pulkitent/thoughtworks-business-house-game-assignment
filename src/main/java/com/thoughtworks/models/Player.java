package com.thoughtworks.models;

public class Player {
    private Integer playedId;
    private AmountMoney amountMoney;

    public Player(Integer playedId, AmountMoney amountMoney) {
        this.playedId = playedId;
        this.amountMoney = amountMoney;
    }

    @Override
    public String toString() {
        return "Player-" + playedId + " has total worth " + amountMoney;
    }

    void updateAmount(Integer money) {
        this.amountMoney = this.amountMoney.add(money);
    }

    boolean hasCapacityToBuy(Integer money) {
        return this.amountMoney.isGreaterThanGivenValue(money);
    }
}
