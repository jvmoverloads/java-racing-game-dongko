package com.dongko;

import com.dongko.service.Movable;
import com.dongko.service.RandomThresholdMovingStrategy;

public class Game {

    private Participants participants;
    private int gameCount;

    private Movable movingStrategy;

    public void start() {
        init();
        play();
        summary();
    }

    private void init() {
        getMovingStrategy();
        GameView.askCarNamesString();
        initParticipants(GameView.getConsoleInput());
        GameView.askGameCount();
        initGameCount(GameView.getConsoleInput());
    }

    private void getMovingStrategy() {
        this.movingStrategy = new RandomThresholdMovingStrategy();
    }

    private void initParticipants(String carNames) {
        participants = new Participants(carNames);
    }

    private void initGameCount(String gameCountString) {
        this.gameCount = StringValidator.getValidGameCountOrThrow(gameCountString);
    }

    private void play() {
        int playCount = 0;
        while(playCount < gameCount) {
            participants.move(movingStrategy);
            participants.printMoveResult();
            playCount++;
        }
    }

    private void summary() {
        participants.printSummary();
    }
}
