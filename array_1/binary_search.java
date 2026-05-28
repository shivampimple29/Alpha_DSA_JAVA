package array_1;

import java.util.*;

public class binary_search {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
        int start = 0;
        int end = arr.length - 1;
        System.out.print("Enter a number to find :");
        int n = sc.nextInt();
        boolean no = true;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == n) {
                System.out.println("Number is found at index " + mid);
                no = false;
                break;
            } else if (arr[mid] > n) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        if (no) {
            System.out.println(n + " is not present in given array.");
        }
        sc.close();
    }
}
