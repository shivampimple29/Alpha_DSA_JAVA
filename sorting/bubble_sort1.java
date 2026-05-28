package sorting;

import java.util.*;

public class bubble_sort1 {

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

    public static void Bsort(int a[], int n) {
        int t;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
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
