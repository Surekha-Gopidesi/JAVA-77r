package com.polymorphism.methodoverriding;

class Game {
    void play() {
        System.out.println("Playing a generic game");
    }
}

class RacingGame extends Game {
	@Override
    void play() {
        System.out.println("Playing a racing game");
    }
}

public class GameTest {
    public static void main(String[] args) {
        Game g = new RacingGame();
        g.play();
    }
}


