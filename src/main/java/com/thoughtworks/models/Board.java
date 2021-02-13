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

    public void movePlayerWithChanceTo(Integer cellNumber) {
        Player playerWithCurrentChance = players.get(Board.playerWithCurrentChance);
        Cell nextCell = cells.get(cellNumber - 1);

        nextCell.movePlayer(playerWithCurrentChance);

        Board.playerWithCurrentChance = isCurrentPlayersIdGreaterThanTotalPlayers()
                ? 0 : Board.playerWithCurrentChance + 1;
    }

    void displayScores() {
        System.out.println(players);
    }

    private boolean isCurrentPlayersIdGreaterThanTotalPlayers() {
        return playerWithCurrentChance >= players.size() - 1;
    }
}
