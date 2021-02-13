package com.thoughtworks.models;

public class Jail extends Cell {

    public Jail(CellType cellType, Integer position) {
        super(cellType, position);
    }

    @Override
    void updatePlayerAmount() {
        Player playerLandedInJailCell = this.getLandedPlayer();
        playerLandedInJailCell.updateAmount(-150);
    }

    @Override
    void movePlayer(Player player) {
        super.setLandedPlayer(player);
        updatePlayerAmount();
    }
}
