package guessser_game;

import java.util.ArrayList;
import java.util.Scanner;

public class GuesserGame{

    private Scanner sc = new Scanner(System.in);
    private String userChoice = null;
    private int playerCount = -1;
    private ArrayList<Integer> guessList = new ArrayList<Integer>();
    private ArrayList<String> playerNames = new ArrayList<String>();

    GuesserGame(){}

    GuesserGame(String choice){
        this.userChoice = choice;
    }

    public void launchGame(){
        System.out.println("****** WELCOME TO GUESSER GAME ******");

        while(true){
            System.out.print("Will you play GuesserGame: (Yes or No) -> ");
            this.userChoice = sc.next();
            if(this.userChoice != null && (this.userChoice.equalsIgnoreCase("yes") || this.userChoice.equalsIgnoreCase("y")))
                this.playGame();
            else if(this.userChoice != null && (this.userChoice.equalsIgnoreCase("no") || this.userChoice.equalsIgnoreCase("n")))
            {
                this.exitGame();
                break;
            }else{
                System.out.println("Please enter a correct choice!!!");
            }
        }

    }

    public void playGame(){
        System.out.print("Enter Player Count here -> ");
        this.playerCount = this.sc.nextInt();
        for(int i=0; i<this.playerCount;i++){
            System.out.println("Player " + (i+1) + " enter your name and number.");
            this.playerNames.add(sc.next());
            this.guessList.add(sc.nextInt());
        }
        GuessGenerator guessGenerator = new GuessGenerator();
        Umpire ump = new Umpire();
        ump.announceWinner(this.playerNames, this.guessList, guessGenerator.returnGeneratedNum(2));
        // ump.announceWinner(this.playerNames, this.guessList, 34);

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
            System.out.print("Exception " + e.toString() + "occured during program execution.");
        }
    }

}
