package sorting;

import java.util.*;

public class Bubble_sort2 {

    public static void insert(int a[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("element " + (i + 1) + " :");
            a[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void display(int a[], int n) {

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("element " + (i + 1) + " :" + a[i]);
        }
    }

    // time complexity : O(n^2)
    public static void Bsort(int a[], int n) {
        int temp;
        for (int turns = 0; turns < n - 1; turns++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - turns; j++) {
                if (a[j] > a[j + 1]) {

                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of array elements :");
        int num = sc.nextInt();
        int arr1[] = new int[num];
        insert(arr1, num);
        System.out.println("\narray without buuble sorting : ");
        display(arr1, num);
        System.out.println("\narray with buuble sorting    : ");
        Bsort(arr1, num);
        display(arr1, num);
        sc.close();

    }
}