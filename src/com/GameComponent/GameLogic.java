package com.GameComponent;


import java.util.Date;
import java.util.concurrent.TimeUnit;

import static java.lang.Math.round;

public class GameLogic {
    String secretWord;
    String hintWord;

    String missedLetters;
    String correctLetters;
    String guessedLetters;

    String inputLetter;
    String inputWord;

    boolean isWordGuessed;

    int roundCounter;
    int lifePoints;

    double gameStartTime;
    double gameEndTime;

    public GameLogic(String capitalName, String countryName) {
        secretWord = capitalName;
        hintWord = countryName;

        isWordGuessed = false;

        roundCounter = 0;
        lifePoints = 5;

        gameStartTime = new Date().getTime();
    }

    public static void main(String[] args) throws Exception {
        GameLogic game = new GameLogic("aa", "bb");
        System.out.println(game.gameStartTime);
        TimeUnit.MILLISECONDS.sleep(2423);
        double asd = new Date().getTime();
        double a = (double) Math.round(asd - game.gameStartTime) / 1000;
        System.out.println(a);
    }

    public double getGameDuration() {
        return gameEndTime - gameStartTime;
    }

    public double getTime() {
        return new Date().getTime();
    }



}
