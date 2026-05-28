package Recursion_I;

public class OptimizedPower {
    public static int pow(int x, int n) {
        if (n == 1) {
            return x;
        }
        if (n == 0) {
            return 1;
        }

        if (n % 2 != 0) {
            return x * pow(x, n - 1);
        }

        else {
            int half = pow(x, n / 2);
            return half * half;
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 10));
    }
}
