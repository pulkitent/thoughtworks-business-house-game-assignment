package com.thoughtworks.models;

import java.util.List;

public class Game {
    private final Board board;
    private final Dice dice;

    public Game(Board board) {
        this.board = board;
        dice = new Dice();
    }

    public void play() {
        List<Integer> diceOutputs = dice.getDiceOutputs();

        for (Integer diceOutput : diceOutputs) {
            this.board.movePlayerWithChanceTo(diceOutput);
        }
    }

    public void displayScores() {
        board.displayScores();
    }
}
