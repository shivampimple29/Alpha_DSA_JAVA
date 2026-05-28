package Bit_Manupulation;

import java.util.*;

public class swapW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int a = sc.nextInt();
        System.out.print("Enter another number :");
        int b = sc.nextInt();
        System.out.println("\nBefore Swapping :");
        System.out.println("a : " + a + " | b : " + b);

        // Basic Method :
        // a -= b;
        // b += a;
        // a = b - a;

        // bit-level Method :
        a=a^b;
        b=b^a;
        a=a^b;


        System.out.println("After Swapping :");
        System.out.println("a : " + a + " | b : " + b);

        sc.close();
    }

}
