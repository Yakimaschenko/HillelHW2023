package com.hillel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsServiceTest {

    @Test
    public void testdetermineWiner_PlayerWins(){
        String result = RockPaperScissorsService.determineWiner("rock", "papper");
        assertEquals("You Lost!", result);
    }

    @Test
    public void testdetermineWiner_ComputerWins(){
        String result = RockPaperScissorsService.determineWiner("scissors", "papper");
        assertEquals("You Win!", result);
    }

    @Test
    public void testdetermineWiner_Draw(){
        String result = RockPaperScissorsService.determineWiner("papper", "papper");
        assertEquals("Draw", result);
    }

}