package edu.teamrocket;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player("MJ", (byte) 0);
    }


    @Test
    void testPlayerCreation() {
        assert player.getInitials().equals("MJ");
        assert player.getScore() == 0;
        assert player.getStablefordPoints() == 0;
    }


    @Test
    void addPointsTest(){
        player.setPoints(5);
        assertEquals((short)5,player.getStablefordPoints() );
    }

    @Test
    void addScoreTest(){
        player.setScore(60);
        assertEquals((short)60, player.getScore());
    }
}
