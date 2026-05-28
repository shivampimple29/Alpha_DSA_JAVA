package array_1;

import java.util.*;

public class largest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the array elements: ");
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        int l = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (l < arr[i]) {
                l = arr[i];
            }
        }
        System.out.println("largest element in given array is " + l);
        sc.close();
    }
}
