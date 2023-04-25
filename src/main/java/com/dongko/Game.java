package com.dongko;

public class Game {

    private Participants participants;
    private int gameCount;

    public void start() {
        init();
        play();
        summary();
    }

    private void init() {
        GameView.askCarNamesString();
        initParticipants(GameView.getConsoleInput());
        GameView.askGameCount();
        initGameCount(GameView.getConsoleInput());
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
            participants.move();
            participants.printMoveResult();
            playCount++;
        }
    }

    private void summary() {
        participants.printSummary();
    }
}
