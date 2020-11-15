package tictactoe;

import java.io.PrintStream;
import java.util.Scanner;

public class Player {
    private final PrintStream out;
    private final Scanner in;

    public Player(final PrintStream out, final Scanner in) {
        this.out = out;
        this.in = in;
    }

    public Player() {
        this(System.out, new Scanner(System.in));
    }

    public Move move(final State state, final Cell cell) {
        while (true) {
            out.println("State");
            out.println(state);
            out.println(cell + "'s move");
            out.println("Enter row and column");
            final Move move = new Move(in.nextInt(), in.nextInt(), cell);
            if (state.isValid(move)) {
                return move;
            }
            final int row = move.getRow();
            final int column = move.getColumn();
            out.println("Move " + move + " is invalid");
        }
    }
}
