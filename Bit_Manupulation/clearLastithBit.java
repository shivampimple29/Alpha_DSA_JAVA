package Bit_Manupulation;

import java.util.*;

public class clearLastithBit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        System.out.print("Enter how many last bits you want to set :");
        int bit = sc.nextInt();
        int bitmask = (~0) << bit;
        System.out.println(n & bitmask);

        sc.close();
    }
}
