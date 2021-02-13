import com.thoughtworks.models.*;

import java.util.LinkedList;
import java.util.List;

import static com.thoughtworks.models.CellType.*;
import static java.util.Arrays.asList;

public class ApplicationStartup {
    public static void main(String[] args) {
        List<Player> players = getThreePlayersWithInitialAmountAsThousand();

        List<Cell> cells = getCells();
        Board board = new Board(cells, players);

        Game game = new Game(board);
        game.play();
        game.displayScores();
    }

    private static List<Player> getThreePlayersWithInitialAmountAsThousand() {
        AmountMoney initialAmountPlayerOne = new AmountMoney(1000);
        AmountMoney initialAmountPlayerTwo = new AmountMoney(1000);
        AmountMoney initialAmountPlayerThree = new AmountMoney(1000);

        Player firstPlayer = new Player(0, initialAmountPlayerOne);
        Player secondPlayer = new Player(1, initialAmountPlayerTwo);
        Player thirdPlayer = new Player(2, initialAmountPlayerThree);

        List<Player> players = new LinkedList<>();
        players.add(firstPlayer);
        players.add(secondPlayer);
        players.add(thirdPlayer);
        return players;
    }

    private static List<Cell> getCells() {
        Cell startingCell = new Cell(EMPTY, 1);
        Cell cell2 = new Cell(EMPTY, 2);
        Cell cell3 = new Jail(JAIL, 3);
        Cell cell4 = new Hotel(HOTEL, 4);
        Cell cell5 = new Cell(EMPTY, 5);
        Cell cell6 = new Treasure(TREASURE, 6);
        Cell cell7 = new Jail(JAIL, 7);
        Cell cell8 = new Treasure(TREASURE, 8);
        Cell cell9 = new Cell(EMPTY, 9);
        Cell cell10 = new Cell(EMPTY, 10);
        Cell cell11 = new Hotel(HOTEL, 11);
        Cell cell12 = new Jail(JAIL, 12);
        Cell cell13 = new Treasure(TREASURE, 13);
        Cell cell14 = new Hotel(HOTEL, 14);
        Cell cell15 = new Cell(EMPTY, 15);
        Cell cell16 = new Cell(EMPTY, 16);
        Cell cell17 = new Jail(JAIL, 17);
        Cell cell18 = new Hotel(HOTEL, 18);
        Cell cell19 = new Cell(EMPTY, 19);
        Cell cell20 = new Treasure(TREASURE, 20);
        Cell cell21 = new Jail(JAIL, 21);
        Cell cell22 = new Treasure(TREASURE, 22);
        Cell cell23 = new Cell(EMPTY, 23);
        Cell cell24 = new Cell(EMPTY, 24);
        Cell cell25 = new Hotel(HOTEL, 25);
        Cell cell26 = new Jail(JAIL, 26);
        Cell cell27 = new Treasure(TREASURE, 27);
        Cell cell28 = new Hotel(HOTEL, 28);
        Cell cell29 = new Cell(EMPTY, 29);
        Cell cell30 = new Cell(EMPTY, 30);
        Cell cell31 = new Jail(JAIL, 31);
        Cell cell32 = new Cell(HOTEL, 32);
        Cell cell33 = new Treasure(TREASURE, 33);
        Cell cell34 = new Jail(JAIL, 34);
        Cell cell35 = new Jail(JAIL, 35);
        Cell cell36 = new Treasure(TREASURE, 36);
        Cell cell37 = new Cell(EMPTY, 37);
        Cell cell38 = new Cell(EMPTY, 38);
        Cell cell39 = new Hotel(HOTEL, 39);
        Cell cell40 = new Jail(JAIL, 40);
        Cell cell41 = new Treasure(TREASURE, 41);
        Cell cell42 = new Cell(EMPTY, 42);
        Cell cell43 = new Hotel(HOTEL, 43);
        Cell cell44 = new Cell(EMPTY, 44);

        return asList(startingCell, cell2, cell3, cell4, cell5, cell6, cell7, cell8, cell9, cell10, cell11, cell12, cell13, cell14, cell15,
                cell16, cell17, cell18, cell19, cell20, cell21, cell22, cell23, cell24, cell25, cell26, cell27, cell28,
                cell29, cell30, cell31, cell32, cell33, cell34, cell35, cell36, cell37, cell38, cell39, cell40, cell41,
                cell42, cell43, cell44);
    }
}
