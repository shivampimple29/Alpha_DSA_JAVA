package functions;

import java.util.*;

public class sum_of_digits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        System.out.println("Sum of the digits of " + n + " is : " + sod(n));
        sc.close();
    }

    public static int sod(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
        
    }
}
