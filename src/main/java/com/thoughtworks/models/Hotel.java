package com.thoughtworks.models;

import java.util.Objects;

public class Hotel extends Cell {
    private Player owner;

    public Hotel(CellType cellType, Integer position) {
        super(cellType, position);
    }

    void purchasedBy(Player player) {
        this.owner = player;
    }

    @Override
    void updatePlayerAmount() {
        Player playerLandedInHotelCell = this.getLandedPlayer();

        if (isPreOwned()) {
            playerLandedInHotelCell.updateAmount(-50);
            return;
        }

        if (playerLandedInHotelCell.hasCapacityToBuy(200)) {
            playerLandedInHotelCell.updateAmount(-200);
            purchasedBy(playerLandedInHotelCell);
        }
    }

    @Override
    void movePlayer(Player player) {
        super.setLandedPlayer(player);
        updatePlayerAmount();
    }

    private boolean isPreOwned() {
        return Objects.nonNull(owner);
    }
}
