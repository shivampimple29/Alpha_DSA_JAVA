package Recursion_I;

import java.util.Scanner;

public class SumOfN {
    // static int i = 1;

    // public static int sumN(int n, int summ) {
    // if (i == n) {
    // summ+=i;
    // return summ;
    // }
    // summ += i;
    // i++;
    // return sumN(n, summ);

    // }
    public static int sumN(int n) {
        if (n == 1) {
            return 1;
        }

        int sumn1 = sumN(n - 1);
        int summ=sumn1+n;
        return summ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        // int ans=sumN(n, summ);
        int ans =sumN(n);
        System.out.println(ans);
        sc.close();
    }
}
