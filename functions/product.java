package functions;

import java.util.*;

public class product {

    public static int pro(int a, int b) {
        int ans;
        ans = a * b;
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter another number: ");
        int n2 = sc.nextInt();
        int ans;

        ans = pro(n1, n2);
        System.out.println(n1+"*"+n2+"="+ans);
        sc.close();
    }
}
