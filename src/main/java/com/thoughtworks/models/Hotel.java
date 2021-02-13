package com.thoughtworks.models;

import java.util.Objects;

import static com.thoughtworks.models.Constants.*;

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
            playerLandedInHotelCell.updateAmount(NEGATIVE_FIFTY);
            return;
        }

        if (playerLandedInHotelCell.hasCapacityToBuy(TWO_HUNDRED)) {
            playerLandedInHotelCell.updateAmount(NEGATIVE_TWO_HUNDRED);
            purchasedBy(playerLandedInHotelCell);
        }
    }

    @Override
    void movePlayer(Player player) {
        this.setLandedPlayer(player);
        updatePlayerAmount();
    }

    private boolean isPreOwned() {
        return Objects.nonNull(owner);
    }
}
