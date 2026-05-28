package functions;

import java.util.*;

public class prime_range {

    public static void prime(int a, int b) {
        if(a<=1){
            a=2;
        }
        while (a <= b) {
            boolean isPrime = true;
            for (int i = 2; i <=Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(a);
            }
            a++;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int l = sc.nextInt();
        System.out.print("Enter the upper limit: ");
        int u = sc.nextInt();
        prime(l, u);
        sc.close();

    }
}
