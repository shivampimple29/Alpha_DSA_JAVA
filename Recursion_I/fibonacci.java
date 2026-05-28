package Recursion_I;

import java.util.*;

public class fibonacci {

    public static int Fibo(int n) {

        if (n == 0) {
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return (Fibo(n-1) + Fibo(n - 2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int ans=Fibo(n);
        System.out.println(ans);
        sc.close();
    }
}
