package operators_loops_pattern;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do{ ch=sc.next().toLowerCase().charAt(0); }while(!(ch>='a' && ch<='z'));
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It's a vowel.");
                break;
            default:
                System.out.println("It's a consonant.");
        }

        sc.close();
    }
}
