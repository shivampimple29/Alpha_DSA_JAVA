package functions;

import java.util.*;

public class binomial_coefficient {

    public static int bin(int n, int r) {
        int nfact = 1;
        int rfact = 1;
        int nrfact = 1;
        for (int i = 1; i <= n; i++) {
            nfact *= i;
        }
        for (int i = 1; i <= r; i++) {
            rfact *= i;
        }

        for (int i = 1; i <= n - r; i++) {
            nrfact *= i;
        }
        int ans = nfact / (nrfact * rfact);
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ans;
        System.out.print("Enter a value of n :");
        int n1 = sc.nextInt();
        System.out.print("Enter a value of r :");
        int n2 = sc.nextInt();

        if (n2 > n1) {
            System.out.println("n should always be greater than r");
        }

        else {
            ans = bin(n1, n2);
            System.out.println(ans);
        }
        sc.close();
    }
}
