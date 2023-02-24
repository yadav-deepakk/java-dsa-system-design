package operators_loops_pattern;

import java.util.Scanner;

public class Loops {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        // for loop
        System.out.println("Enter a number to print table: ");
        int n = scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n + " X " + i + " = " + n*i);
        }

        // while loop
        System.out.println("Enter a number to reverse it: ");
        n = scan.nextInt();
        int rev=0;
        while(n>0){
            rev = rev * 10 + (n%10);
            n /= 10;
        }
        System.out.println("Reversed number is: " + rev);

        // do while loop
        System.out.println("Enter a number to find factorial: ");
        n = scan.nextInt();
        int fact = 1;
        do{
            fact = fact * n--;
        }while(n>0);
        System.out.println("Factorial is "+fact);

        // enhanced for loop
        int[] nums = {6, 7, 3, 21, 77};
        for (int num : nums) {
            System.out.println("number " + num +" is " + (num%2==0 ? "Even":"ODD" + "."));
        }
    }
}
