package sorting;

import java.util.Arrays;

public class Inbuilt_sort {

    public static void display(int a[], int n) {

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("element " + (i + 1) + " :" + a[i]);
        }
    }

    public static void main(String args[]) {

        int a[] = { 5, 4, 3, 2, 1 };

        // O(n logn)
        Arrays.sort(a);

        display(a, 5);

        Arrays.sort(a, 0, 3);
        display(a, 5);

    }
}