package functions;

import java.util.*;

public class factorial {

    public static int fact(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int ans;

        if (n < 0) {
            System.out.println("Factorial of " + n + " is not possible!");
        }

        else if (n == 0 && n == 1) {
            System.out.println("Factorial of " + n + " is 1");
        }

        else {

            ans = fact(n);
            System.out.println("Factorial of " + n + " is " + ans);
        }
        sc.close();
    }
}
