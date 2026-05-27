package edu.teamrocket;

public class ComputeCard {
    private final ScoreCard card;
    private final GolfPlay strategy;
    public ComputeCard(ScoreCard card, GolfPlay strategy) {
        this.card = card;
        this.strategy = strategy;
    }

    public void compute(){
        this.strategy.marcarPuntos(this.card);
    }
}
