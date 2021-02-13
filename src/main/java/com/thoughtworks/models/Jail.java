package com.thoughtworks.models;

import static com.thoughtworks.models.Constants.NEGATIVE_ONE_FIFTY;

public class Jail extends Cell {

    public Jail(CellType cellType, Integer position) {
        super(cellType, position);
    }

    @Override
    void updatePlayerAmount() {
        Player playerLandedInJailCell = this.getLandedPlayer();
        playerLandedInJailCell.updateAmount(NEGATIVE_ONE_FIFTY);
    }

    @Override
    void movePlayer(Player player) {
        this.setLandedPlayer(player);
        updatePlayerAmount();
    }
}
