package operators_loops_pattern.Assignments;

import java.util.Scanner;

public class AssignPatternProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Q1: ABCDEFGH
        for (int i=0; i<n; i++){

            // A
            for(int j=0;j<n;j++){
                if(i==0 && j>0 && j<n-1|| i==(n-1)/2 && j<n-1 || j==0 && i!=0 || j==n-1 && i!=0)
                    System.out.print("|");
                else System.out.print(" ");
            }

            // B
            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(i==0 && j>0 && j<n-1|| i==(n-1)/2 && j<n-1 || i==n-1 && j!=n-1 || j==0 || j==n-1 && i!=0 && i!=n-1)
                    System.out.print("|");
                else System.out.print(" ");
            }

            // C
            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(i==0 && j>0 || i==n-1 && j>0 || j==0 && i!=0 && i!=n-1)
                    System.out.print("|");
                else System.out.print(" ");
            }

            // D
            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(i==0 && j<n-1 || i==n-1 && j<n-1 || j==0 || j==n-1 && i<n-1 && i>0) 
                    System.out.print("|");
                else System.out.print(" ");
            }

            // E
            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(i==0 || i==(n-1)/2 || i==n-1 || j==0) 
                    System.out.print("|");
                else System.out.print(" ");
            }

            // F
            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(i==0 || i==(n-1)/2 || j==0)
                    System.out.print("|");
                else System.out.print(" ");
            }

            // G
            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(i==0 && j>0 || i==(n-1)/2 && j>(n-1)/2 || i==n-1 && j>0 && j<n-1 || j==0 && i!=0 && i!=n-1 || j==n-1 && i>(n-1)/2 && i<n-1)
                    System.out.print("|");
                else System.out.print(" ");
            }

            // H
            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(i==(n-1)/2 && j<n-1 || j==0 || j==n-1)
                    System.out.print("|");
                else System.out.print(" ");
            }

            System.out.println("");
        }

        System.out.println("\n");

        // Q2
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j<=i) System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");

        // Q4
        for(int i=0; i<n; i++){
            // P
            for(int j=0;j<n;j++){
                if(i==0 && j<n-1|| i==(n-1)/2 && j<n-1 || j==0 || j==n-1 && i!=0 && i<(n-1)/2)
                    System.out.print("|");
                else System.out.print(" ");
            }

            // W
            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || i==j && i>(n-1)/2 && j>(n-1)/2 || i+j==n-1 && i-j>0)
                    System.out.print("|");
                else System.out.print(" ");
            }

            // S
            System.out.print("     ");
            for(int j=0;j<n;j++){
                if(i==0 && j>0 || i==(n-1)/2 && j<n-1 && j>0 || i==n-1 && j<n-1 || 
                   j==0 && i>0 && i<(n-1)/2 || j==n-1 && i>(n-1)/2 && i<n-1)
                    System.out.print("|");
                else System.out.print(" ");
            }

            // K
            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(j==0 || j==(n-1)/2-i || j==i-(n-1)/2)
                    System.out.print("|");
                else System.out.print(" ");
            }

            // I
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j == (n-1)/2)
                    System.out.print("|");
                else System.out.print(" ");
            }

            // 2 times L
            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(i==n-1 || j==0)
                    System.out.print("|");
                else System.out.print(" ");
            }

            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(i==n-1 || j==0)
                    System.out.print("|");
                else System.out.print(" ");
            }

            // S
            System.out.print(" ");
            for(int j=0;j<n;j++){
                if(i==0 && j>0 || i==(n-1)/2 && j<n-1 && j>0 || i==n-1 && j<n-1 || 
                   j==0 && i>0 && i<(n-1)/2 || j==n-1 && i>(n-1)/2 && i<n-1)
                    System.out.print("|");
                else System.out.print(" ");
            }

            System.out.println(" ");
        }

        System.out.println(" \n");


        // Q5
        for(int i=0;i<n;i++){

            // D
            for(int j=0;j<n;j++){
                if(i==0 && j<n-1 || i==n-1 && j<n-1 || j==0 || j==n-1 && i<n-1 && i>0) 
                    System.out.print("|");
                else System.out.print(" ");
            }
            // 2 times E
            int k=2;
            while(k-->0){
                System.out.print("  ");
                for(int j=0;j<n;j++){
                    if(i==0 || i==(n-1)/2 || i==n-1 || j==0) 
                        System.out.print("|");
                    else System.out.print(" ");
                }
            }

            // P
            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(i==0 && j<n-1|| i==(n-1)/2 && j<n-1 || j==0 || j==n-1 && i!=0 && i<(n-1)/2)
                    System.out.print("|");
                else System.out.print(" ");
            }

            // A
            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(i==0 && j>0 && j<n-1|| i==(n-1)/2 && j<n-1 || j==0 && i!=0 || j==n-1 && i!=0)
                    System.out.print("|");
                else System.out.print(" ");
            }

            // K
            System.out.print("  ");
            for(int j=0;j<n;j++){
                if(j==0 || j==(n-1)/2-i || j==i-(n-1)/2)
                    System.out.print("|");
                else System.out.print(" ");
            }
            System.out.println(" ");
        }



        sc.close();
    }
}
