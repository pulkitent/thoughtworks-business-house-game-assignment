package com.thoughtworks.models;

import java.util.List;

public class Board {
    private final List<Cell> cells;
    private final List<Player> players;
    private static Integer playerWithCurrentChance = 0;

    public Board(List<Cell> cells, List<Player> players) {
        this.cells = cells;
        this.players = players;
    }

    public void movePlayerWithChanceTo(Integer diceOutput) {
        Player player = players.get(playerWithCurrentChance);
        Cell nextCell = cells.get(diceOutput);

        nextCell.movePlayer(player);
        playerWithCurrentChance = isCurrentPlayersIdGreaterThanTotalPlayers() ? 0 : playerWithCurrentChance + 1;
    }

    void displayScores() {
        System.out.println(players);
    }

    private boolean isCurrentPlayersIdGreaterThanTotalPlayers() {
        return playerWithCurrentChance >= players.size() - 1;
    }
}
