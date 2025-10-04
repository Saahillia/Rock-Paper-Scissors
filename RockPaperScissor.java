package RockPaperScissor;

import java.util.*;


public class RockPaperScissor{
    // Backend
    // All of the choices that computer can choose
    private static final String[] computerChoices = {"Rock","Paper","Scissors"};

    public String getcomputerChoice(){
        return computerChoice;
    }
    public int getcomputerScore(){
        return computerScore;
    }
    public int getPlayerScore(){
        return playerScore;
    }

    // Store the computer choice so that we can retrieve the value and display it into the frontend   
    private String computerChoice;

    // Store the scores so that we can retrieve the value and display it to the frontend
    private int computerScore, playerScore;

    // Use to generate a random number to randomly choose an option for the computer
    private Random random;

    // constructor - to initalize random obj
    public RockPaperScissor(){
        random = new Random();
    }

    // call this method to begun playing rock paper scissor
    // playerChoice - is the choice made by the player (i.e :- rock, paper, scissor) 
    // this method will return the result of the game (i.e :-computer wins, player wins, draw)
    public String playRockPaperScissor(String playerChoice){
        // generate computer choice
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        // will contain the returning message indicating the result of the game
        String result;

        // Evaluate the Winner
        if(playerChoice.equals(computerChoice)){
            result = "Draw";
        } else if (
            (playerChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
            (playerChoice.equals("Paper") && computerChoice.equals("Rock")) ||
            (playerChoice.equals("Scissors") && computerChoice.equals("Paper"))
        ) {
            result = "Player Wins";
            playerScore++;
        } else {
            result = "Computer Wins";
            computerScore++;
        }

        return result;
    }
}
