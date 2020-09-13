import java.util.*;

import jdk.nashorn.internal.runtime.arrays.NumericElements;

public class ScoreBoard {
    private int numEntries = 0;
    private GameEntry[] board;

    public ScoreBoard(int capacity) {
        board = new GameEntry[capacity];
    }

    public void add(GameEntry entry) {
        int newScore = entry.getScore();
        // Stel board = 100, 200 en new score = 400
        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            // Dit is een hulp teller die alvast bepaald dat het aantal entries drie zal
            // worden
            // Echter staan er nog steeds twee entries op het board.
            if (numEntries < board.length) {
                numEntries++;
            }
            // We pakken nu de laatste score op het huidge op het board, in ons geval 100
            int j = numEntries - 1;
            // Zolang de score op het board kleiner als de newScore doe
            // Ons baord heeft nu driee entries 100, 200, 400
            // De while loop paakt
            while (j > 0 && board[j - 1].getScore() < newScore) {
                board[j] = board[j - 1];
                j--;
            }
            // new score is added to the board at poistion J
            board[j] = entry;
        }
    }

    public GameEntry remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= numEntries) {
            throw new IndexOutOfBoundsException("Fout stommeling: " + i);
        }
        GameEntry temp = board[i];
        for (int j = i; j < numEntries - 1; j++) {
            board[j] = board[j + 1];
        }
        board[numEntries - 1] = null;
        numEntries--;
        return temp;

    }

    public StringBuilder printBoard() {
        StringBuilder lijst = new StringBuilder();
        for (int i = 0; i < numEntries; i++) {
            GameEntry entry = board[i];
            lijst.append(entry + " \n");
        }
        return lijst;
    }
}
