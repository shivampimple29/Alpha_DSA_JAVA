package sorting;

import java.util.Arrays;
import java.util.Collections;

public class reverse_sort {
    public static void display(Integer a[], Integer n) {

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("element " + (i + 1) + " :" + a[i]);
        }
    }

    public static void main(String args[]) {

        Integer a[] = { 1, 2, 3, 4, 5 };

        // O(n logn)

        Arrays.sort(a, Collections.reverseOrder());

        display(a, 5);

    }
}
