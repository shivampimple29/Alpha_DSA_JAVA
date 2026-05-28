package Recursion_I;


import java.util.Scanner;

public class factorial {

    // public static int Fact(int n, int i) {
    //     if (n < 0) {
    //         System.out.println("Factorial of a negative number is not possible");
    //         return -1;
    //     } else if (n == 0 || n == 1) {
    //         System.out.println(n + "! = 1");
    //         return 1;
    //     }
    //     if (i > n) {
    //         return 1; 
    //     }
    //     return i * Fact(n, i + 1);
    // }

    public static int fact(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }
    return n * fact(n - 1);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        // int i = 1;
        // int ans = Fact(n, i);
        int ans=fact(n);
        if (ans >= 0) System.out.println(n + "! = " + ans);
        sc.close();
    }
}
