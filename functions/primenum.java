package functions;

import java.util.*;

public class primenum {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            System.out.println("1 is not a prime number!");
        } else if (n == 2) {
            return true;
        }
            for (int i = 2; i <= n-1; i++) {
                if (n % i == 0) {
                    return false;
                } 
                
                }
                return true;
            
        }
    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
        sc.close();
    }

}
