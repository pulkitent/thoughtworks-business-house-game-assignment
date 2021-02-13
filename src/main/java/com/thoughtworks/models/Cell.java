package com.thoughtworks.models;

public class Cell {
    private final CellType cellType;
    private final Integer position;
    private Player landedPlayer;

    public Cell(CellType cellType, Integer position) {
        this.cellType = cellType;
        this.position = position;
    }

    void updatePlayerAmount() {
        //Not to do anything in case of empty cell
    }

    void movePlayer(Player player) {
        this.landedPlayer = player;
        this.updatePlayerAmount();
    }

    public Player getLandedPlayer() {
        return landedPlayer;
    }
}
