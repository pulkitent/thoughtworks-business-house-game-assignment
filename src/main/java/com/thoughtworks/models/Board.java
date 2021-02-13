package com.thoughtworks.models;

import java.util.List;

public class Board {
    private final List<Cell> cells;
    private final List<Player> players;
    private static Integer playerIdWithCurrentChance = 0;

    public Board(List<Cell> cells, List<Player> players) {
        this.cells = cells;
        this.players = players;
    }

    public void movePlayerWithChanceTo(Integer cellNumber) {
        Player playerWithCurrentChance = players.get(Board.playerIdWithCurrentChance);
        Cell nextCell = cells.get(cellNumber - 1);

        nextCell.movePlayer(playerWithCurrentChance);

        Board.playerIdWithCurrentChance = isCurrentPlayersIdGreaterThanTotalPlayers()
                ? 0 : Board.playerIdWithCurrentChance + 1;
    }

    void displayScores() {
        System.out.println(players);
    }

    private boolean isCurrentPlayersIdGreaterThanTotalPlayers() {
        return playerIdWithCurrentChance >= players.size() - 1;
    }
}
