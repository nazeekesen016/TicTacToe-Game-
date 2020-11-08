package models;

public enum GameState {
    WAITING_FOR_GAME_START("Waiting for the starting"),
    X_IS_MAKING_MOVE("X moves"),
    O_IS_MAKING_MOVE("O moves"),
    X_WIN("X won"),
    O_WIN("O won"),
    DRAW("Draw");

    private String value;

    GameState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
