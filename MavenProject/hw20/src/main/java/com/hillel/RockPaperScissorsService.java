package com.hillel;

import java.util.Random;

public class RockPaperScissorsService {

    private static final  String[] OPTIONS = {"rock", "papper", "scissors"};
    public static int gamesPlayed = 0;
    public static int gamesWon = 0;
    public static int gamesLost = 0;

    public static boolean isValidChoice(String choise){
       for (String option:OPTIONS){
           if (option.equalsIgnoreCase(choise)){
               return true;
           }
       }
       return false;
    }


    public static String getRandomChoice(){
        Random random = new Random();
        return OPTIONS[random.nextInt(OPTIONS.length)];
    }

    public static String determineWiner(String playerChoice, String computerChoice){
        if(playerChoice.equalsIgnoreCase(computerChoice)){
            return "Draw";
        } else if ((playerChoice.equalsIgnoreCase("rock")&& computerChoice.equalsIgnoreCase("scissors")) ||
                  (playerChoice.equalsIgnoreCase("scissors")&& computerChoice.equalsIgnoreCase("papper")) ||
                  (playerChoice.equalsIgnoreCase("papper")&& computerChoice.equalsIgnoreCase("scissors"))) {
            return "You Win!";
                  }else{
            return "You Lost!";
        }
    }
}
