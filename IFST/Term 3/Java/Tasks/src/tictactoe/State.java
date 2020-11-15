package tictactoe;

public interface State {
    State getState();
    boolean isValid(Move move);
}
