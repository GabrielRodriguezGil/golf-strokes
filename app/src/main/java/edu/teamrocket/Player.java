package edu.teamrocket;

public class Player {

    private String initials;

    private Byte handicap;

    private Short score;

    private Short points;

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

    Short getPoints() {
        return points;
    }

    void setPoints(int score) {
        this.points = (short) score;
    }

    @Override
    public String toString() {
        StringBuilder player = new StringBuilder();

        return player.toString();
    }

}