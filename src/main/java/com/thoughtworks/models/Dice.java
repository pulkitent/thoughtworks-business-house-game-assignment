package com.thoughtworks.models;

import java.util.List;

import static java.util.Arrays.asList;

public class Dice {
    private List<Integer> diceOutputs;

    Dice() {
        Integer[] diceOutputsArray = {4, 4, 4, 6, 7, 8, 5, 11, 10, 12, 2, 3, 5, 6, 7, 8, 5, 11, 10, 12, 2, 3, 5, 6, 7, 8, 5,
                11, 10, 12};
        diceOutputs = asList(diceOutputsArray);
    }

    public List<Integer> getDiceOutputs() {
        return diceOutputs;
    }
}
