package Bit_Manupulation;

import java.util.*;

public class Adding1Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int x = sc.nextInt();
        System.out.println(x + " + 1" + " = " + (-~x));

        // Since Bitwise not uses 2's complement we need to use '-' sign before it , to balance out sign bit.

        sc.close();
    }
}
