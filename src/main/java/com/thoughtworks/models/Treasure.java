package com.thoughtworks.models;

import static com.thoughtworks.models.Constants.NEGATIVE_TWO_HUNDRED;

public class Treasure extends Cell {

    public Treasure(CellType cellType, Integer position) {
        super(cellType, position);
    }

    @Override
    void updatePlayerAmount() {
        Player playerLandedInJailCell = this.getLandedPlayer();
        playerLandedInJailCell.updateAmount(NEGATIVE_TWO_HUNDRED);
    }

    @Override
    void movePlayer(Player player) {
        this.setLandedPlayer(player);
        updatePlayerAmount();
    }
}
