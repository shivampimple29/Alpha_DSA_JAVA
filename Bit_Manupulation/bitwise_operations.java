package Bit_Manupulation;

import java.util.*;

public class bitwise_operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int a = sc.nextInt();
        System.out.print("Enter another number :");
        int b = sc.nextInt();

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(a << b);
        System.out.println(a >> b);
        sc.close();
    }
}
