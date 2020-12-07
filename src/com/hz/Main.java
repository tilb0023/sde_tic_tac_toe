package com.hz;

public class Main {

    public static void main(String[] args) {
	// write your code here

        GameEngine engine = new GameEngine();

        // player 1
        TicTacToe playerOne = new PlayerLevi(9, 9);
        playerOne.acceptSymbol(0);

        // player 2
        TicTacToe playerTwo = new DummyPlayer();
        playerOne.acceptSymbol(1);

        engine.setPlayerOne(playerOne);
        engine.setPlayerTwo(playerTwo);

        engine.startGame();

    }
}
