package operators_loops_pattern;

public class Operators {
    public static void main(String[] args) {
        // OPERATORS: AALU RCB - Arithmatic, Assignment, Logical, Unary, Relational, Conditional(Ternary), Bitwise

        // Arithmetic Operators - addition, substraction, multiplication, division, modulo
        // modulo operation 
        int a=123, b=7;
        float a11 = 15.2f, b11 = 7.6f;
        System.out.println(a%b);
        System.out.println(a11%b11);


        // Assignment operator: =
        a = 100;
        System.out.println("a=" + a);

        int a1,a2,a3,a4;
        a1=a2=a3=a4=145;
        System.out.println("a1=" + a1 + " a2=" + a2 + " a3=" + a3 + " a4=" + a4);

        b = 190;
        b /= 10;
        b += 18;
        System.out.println("b="+ b);    // 37


        // Relational Operator: ==, <, >, <=, >= 
        int b1=10, b2=100, b3=10;
        System.out.println(b1==b3);     // true
        System.out.println(b1<b3);      // false
        System.out.println(b2>b3);      // true
        System.out.println(b1<=b3);     // true
        System.out.println(b1>=b3);     // true


        // Logical Operators: AND(&&), OR(||), NOT(!)
        System.out.println(b1==b3 && b2>b3);// true
        System.out.println(b1<b3 || b1>=b3);// true
        System.out.println(!(b2<b3));       // true


        // Unary Operators - applied on single operands. +, -, !, ~, ++, --,
        // bitwise complement 
        a = 10;   // 1010 in binary. Complment of a will be 0101 -> 5
        System.out.println("Bitwise Complement of a=10 is: " + ~a); // 2s complement of 10 will be -6 
        // (pre/post)increament and (pre/post)decrement 
        int x = 10; // x+3-1 => 12 
        int y = x++ + ++x + ++x + x--;
        //       10 + 12  +  13 +  13  => 48
        System.out.println("x=" + x + " y=" + y);

        int x1=5;
        x1 = ++x1 + x1++;
        System.out.println("x=" + x1);


        // Conditional operator (expression1 ? expression2 : expression3)
        int p=10,q=24,r=18;
        System.out.println("p="+p+",q="+q+",r="+r);
        int biggest_of_pqr = p>q ? (p>r?p:r) : (q>r?q:r);
        System.out.println("Biggest is: " + biggest_of_pqr);

        // Bitwise operator - AND(&), OR(|), XOR(^), Left Shift(<<), Signed Right Shift(>>), Unsigned Right Shift(>>>)
        int l=7, m=10, n=5; // 7 - (0000 0111), 10 - (0000 1010), 5 - (0000 0101)
        int k=-8;           // 1111 1111 1111 1000  -> 2s complement form
        System.out.println(l&m);    // 0000 0010
        System.out.println(m|n);    // 0000 1111
        System.out.println(l^n);    // 0000 0010
        System.out.println(m<<2);   // 0010 1000
        System.out.println(k>>1); 
        System.out.println(k>>>2);
    }
}