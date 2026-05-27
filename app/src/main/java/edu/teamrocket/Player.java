package edu.teamrocket;

public class Player {

    private String initials;

    private Byte handicap;

    private Short score = 0;

    private Short stablefordPoints = 0
    ;

    Player(String initials, Byte handicap) {
        this.initials = initials;
        this.handicap = handicap;
    }

    String getInitials() {
        return initials;
    }

    Short getScore() {
        return score;
    }

    void setScore(int score) {
        this.score = (short) score;
    }

    Short getStablefordPoints() {
        return stablefordPoints;
    }

    void setPoints(int points) {
        this.stablefordPoints = (short) points;
    }

    @Override
    public String toString() {
        StringBuilder player = new StringBuilder();

        return player.toString();
    }

}