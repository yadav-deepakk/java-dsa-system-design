package operators_loops_pattern;

import java.util.Scanner;

public class SimplePatterns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number(more than 5): ");
        int n = scan.nextInt();

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                if(i==0 && j<n-1 || i==n-1 && j<n-1 || j==0 || j==n-1 && i<n-1 && i>0) 
                    System.out.print("|");
                else System.out.print(" ");
            }
            int k=2;
            while(k-->0){
                System.out.print("  ");
                for(int j=0;j<n;j++){
                    if(i==0 || i==(n-1)/2 || i==n-1 || j==0) 
                        System.out.print("|");
                    else System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(i==0 && j<n-1|| i==(n-1)/2 && j<n-1 || j==0 || j==n-1 && i!=0 && i<(n-1)/2)
                    System.out.print("|");
                else System.out.print(" ");
            }
            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(i==0 && j>0 && j<n-1|| i==(n-1)/2 && j<n-1 || j==0 && i!=0 || j==n-1 && i!=0)
                    System.out.print("|");
                else System.out.print(" ");
            }
            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(j==0 || j==(n-1)/2-i || j==i-(n-1)/2)
                    System.out.print("|");
                else System.out.print(" ");
            }
            System.out.println(" ");
        }

        scan.close();
    }
}
