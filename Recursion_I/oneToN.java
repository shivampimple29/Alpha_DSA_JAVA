package Recursion_I;

import java.util.*;

public class oneToN {

    public static void Straight(int n, int i) {
        if (i <= n) {
            System.out.println(i);
            Straight(n, i + 1);
        }
    }

    // public static void Incr(int n){
    //     if(n==1){
    //         System.out.println(n);
    //         return;
    //     }
    //     Incr(n-1);
    //     System.out.println(n);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int i = 1;
        Straight(n, i);
        // Incr(n);
        sc.close();

    }
}
