package functions;

import java.util.*;

public class avg {
    public static float average(int a, int b, int c) {
        int sum;
        float avg;
        sum = a + b + c;
        avg = sum / 3.0f;
        return avg;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println("Average is :" + average(n1, n2, n3));
        sc.close();
    }
}
