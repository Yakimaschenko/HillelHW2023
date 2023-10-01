package com.hillel;

import java.util.Scanner;

import static com.hillel.RockPaperScissorsService.*;

public class MainRockPaperScissors {
    public static void main(String[] args) {

        RockPaperScissorsService rps = new RockPaperScissorsService();

        System.out.println("Welcome to Rock Paper Scissors");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter number of games [more then 0]: ");
        Integer gameCount = sc.nextInt();
        sc.nextLine();


        for (int i = 0; i < gameCount; i++) {
            System.out.println("\nGames num = " + (i + 1));
            System.out.print("choose your option (rock, papper, scissors): ");
//            sc.nextLine(); // Очищаємо буфер після введення числа
            String playerChoice = sc.nextLine();

            if(playerChoice.equalsIgnoreCase("exit")){
                break;// виходимо з гри
            }

            if (!rps.isValidChoice(playerChoice)){
                System.out.println("Wrong choice. Try again");
                i--;
                continue;
            }

            String computerChoice = getRandomChoice();
            System.out.println("Computer choice: " + computerChoice);

            String result = determineWiner(playerChoice,computerChoice);
            System.out.println("Result in this game: " + result);

            if (result.equalsIgnoreCase("You Win!")){
                rps.gamesWon++;
            } else if (result.equalsIgnoreCase("You Lose!")) {
                rps.gamesLost++;
            }

            gamesPlayed++;
        }

        System.out.println("Game is over.");
        System.out.println("Games played: " + gamesPlayed);
        System.out.println("Game won: " + gamesWon);
        System.out.println("Game lost: " + gamesLost);

    }
}
