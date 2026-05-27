package edu.teamrocket;

import com.google.common.primitives.Bytes;

public class StrokePlay implements GolfPlay{
    @Override
    public void marcarPuntos(ScoreCard card) {

        for (Player player : card.getPlayers()) {
            int score = Bytes.asList(card.getPlayersCourse(player))
                .stream()
                .mapToInt(Byte::intValue)
                .sum();
            player.setScore(score);
        }

    }
}
