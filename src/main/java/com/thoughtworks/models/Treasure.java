package com.thoughtworks.models;

public class Treasure extends Cell {

    public Treasure(CellType cellType, Integer position) {
        super(cellType, position);
    }

    @Override
    void updatePlayerAmount() {
        Player playerLandedInJailCell = this.getLandedPlayer();
        playerLandedInJailCell.updateAmount(200);
    }
}
