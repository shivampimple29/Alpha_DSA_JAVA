/* prefix sum */

package array_2;

import java.util.*;

public class subarray_maxsum2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        int max = Integer.MIN_VALUE, sum = 0;
        System.out.println("Enter the array elements: ");
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println();

        int prefix[] = new int[5];
        prefix[0] = arr[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = arr[i] + prefix[i - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                System.out.println(sum);
            }
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println("max sum is " + max);
        sc.close();
    }
}
