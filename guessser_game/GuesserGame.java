package guessser_game;

import java.util.ArrayList;
import java.util.Scanner;

public class GuesserGame{

    private Scanner sc = new Scanner(System.in);
    private String userChoice = null;
    int playerCount = -1;
    ArrayList<Integer> guessList = new ArrayList<Integer>();
    ArrayList<String> playerNames = new ArrayList<String>();

    GuesserGame(){}

    GuesserGame(String choice){
        this.userChoice = choice;
    }

    public void launchGame(){
        System.out.println("****** WELCOME TO GUESSER GAME ******");

        while(true){
            System.out.print("Do you want to continue: (Yes or No) -> ");
            this.userChoice = sc.next();
            if(this.userChoice != null && (this.userChoice.equalsIgnoreCase("yes") || this.userChoice.equalsIgnoreCase("y")))
                this.playGame();
            else {
                this.exitGame();
                break;
            }
        }

    }

    public void playGame(){
        System.out.print("Enter Player Count here -> ");
        this.playerCount = this.sc.nextInt();
        for(int i=0; i<this.playerCount;i++){
            System.out.println("Player " + (i+1) + " enter your name and number.");
            playerNames.add(sc.next());
            guessList.add(sc.nextInt());
        }
        GuessGenerator guessGenerator = new GuessGenerator();
        Umpire ump = new Umpire();
        ump.announceWinner(playerNames, guessList, guessGenerator.returnGeneratedNum(2));
        // ump.announceWinner(playerNames, guessList, 34);

    }

    public void exitGame(){
        System.out.println("****** THANK YOU FOR PLAYING ******");
        this.sc.close();
    }

    public static void main (String args[]){
        GuesserGame game = new GuesserGame("y");
        try{
            game.launchGame();
        }catch(Exception e){
            System.out.println(e.toString());
            System.out.print("Above Exception Occured...");
        }
    }

}
