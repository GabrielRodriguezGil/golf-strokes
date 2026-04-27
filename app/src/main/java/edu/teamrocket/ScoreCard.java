package edu.teamrocket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ScoreCard {

    private Optional<Player> playerA = Optional.empty();

    private Optional<Player> playerB = Optional.empty();

    private Optional<Player> playerC = Optional.empty();

    private Optional<Player> playerD = Optional.empty();

    final List<Hole> holes = new ArrayList<>();

    Course playersCourse;

    ScoreCard() {

    }

    public List<Player> getPlayers() {

        return Arrays.asList(playerA, playerB, playerC, playerD).stream().filter(Optional::isPresent)
                .map(Optional::get).toList();

    }

    public void setPlayerA(Player playerA) {
        this.playerA = Optional.of(playerA);
    }

    public void setPlayerB(Player playerB) {
        this.playerB = Optional.of(playerB);
    }

    public void setPlayerC(Player playerC) {
        this.playerC = Optional.of(playerC);
    }

    public void setPlayerD(Player playerD) {
        this.playerD = Optional.of(playerD);
    }

    public void setPlayersCourse(Course playersCourse) {
        this.playersCourse = playersCourse;
    }

    public byte[] getPlayersCourse(Player player) {
        return playersCourse.getPlayerCourse(player);
    }

    public void addHoles(Byte[] holePar) {
        byte holeNumber = 1;
        for (Byte par : holePar) {
            this.holes.add(new Hole(holeNumber++, par));
        }
    }

    List<Hole> getHoles() {
        return this.holes;
    }

    public Byte getNumHoles() {
        return (byte) this.holes.size();
    }

}