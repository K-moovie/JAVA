package ch02.game2.newpackage;

import ch02.game2.GuessGame;
import java.io.IOException;

public class TestDrive {

    public static void main(String[] args) throws IOException {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}
