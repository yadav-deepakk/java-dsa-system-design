package fundamentals_of_java;

public class Exercise1 {
    public static void main(String args[]){
        // Arithmetic Operators - addition, substraction, multiplication, division, modulo
        // modulo operation 
        int a=123, b=7;
        float a1 = 15.2f, b1 = 7.6f;
        System.out.println(a%b);
        System.out.println(a1%b1);

        // unary operators - applied on single operands. 
        // increament and decrement 
        int x = 10; // x+3-1 => 12 
        int y = x++ + ++x + ++x + x--;
        //       10 + 12  +  13 +  13  => 48
        System.out.println("x=" + x + " y=" + y);
    }
}
