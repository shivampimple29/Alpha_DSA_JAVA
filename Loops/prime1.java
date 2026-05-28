package Loops;

import java.util.*;

public class prime1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("not prime");
        }

        else if (n == 2) {
            System.out.println("prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println("not prime");
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("prime");
            }
        }
        sc.close();
    }
}
