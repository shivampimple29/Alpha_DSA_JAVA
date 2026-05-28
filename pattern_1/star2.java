package pattern_1;

import java.util.*;

public class star2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {

                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
