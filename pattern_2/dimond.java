package pattern_2;

import java.util.*;

public class dimond {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int row = sc.nextInt();

        for (int i = 1; i <= row / 2; i++) {

            for (int j = 1; j <= (row / 2) - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = (row / 2) - 1; i >= 1; i--) {
            for (int j = 1; j <= (row / 2) - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
