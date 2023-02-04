package guessser_game;

import java.util.ArrayList;

public class Umpire {

    public void announceWinner(ArrayList<String> playerNames, ArrayList<Integer> palyerGuesses, int numToBeGuessed){
        int flag = 0; 
        for(int i=0; i<playerNames.size(); i++){
            if(palyerGuesses.get(i) == numToBeGuessed) {
                flag = 1;
                System.out.println(playerNames.get(i) + " has guessed correct number."); 
            } 
        }
        System.out.println("The number was: " + numToBeGuessed);
        if(flag == 0){
            System.out.println("No one guessed correct number. \nBetter Luck next time.");
        }
      
    }
    
}
