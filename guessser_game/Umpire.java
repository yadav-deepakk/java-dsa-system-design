package guessser_game;

import java.util.ArrayList;

public class Umpire {

    public void announceWinner(ArrayList<String> playerNames, ArrayList<Integer> palyerGuesses, int numToBeGuessed){
        ArrayList<String> winnerList = new ArrayList<String>();

        for(int i=0; i<playerNames.size(); i++){
            if(palyerGuesses.get(i) == numToBeGuessed) {
                winnerList.add(playerNames.get(i));
            } 
        }
        System.out.println("The number to be guessed was: " + numToBeGuessed);
        if(winnerList.size() == 0){
            System.out.println("No one guessed correct number. \nBetter Luck next time.");
        }else{
            System.out.print("Winner(s): ");
            winnerList.forEach(winner -> System.out.print(winner + " "));
            System.out.println();
        }
    }
    
}
