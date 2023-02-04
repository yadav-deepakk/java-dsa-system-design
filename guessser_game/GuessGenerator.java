package guessser_game;

public class GuessGenerator {
    private int generateNum;
    
    public int returnGeneratedNum(int digits){
        this.generateNum = (int) (Math.random() * Math.pow(10, digits));
        return this.generateNum;
    }
}
