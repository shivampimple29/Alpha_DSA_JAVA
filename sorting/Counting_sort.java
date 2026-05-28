package sorting;

import java.util.Scanner;

public class Counting_sort {

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

    // time complexity : O(n + range)
    public static void C_sort(int a[], int n) {

        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            largest=Math.max(largest, a[i]);
        }

        int count[]=new int[largest+1];
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }

        int j=0;
        for (int i = 0; i < count.length; i++) {
            while(count[i]>0){
                a[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of array elements :");
        int num = sc.nextInt();
        int arr1[] = new int[num];
        insert(arr1, num);
        System.out.println("\narray before Counting sorting : ");
        display(arr1, num);
        System.out.println("\narray after Counting sorting    : ");
        C_sort(arr1, num);
        display(arr1, num);
        sc.close();

    }
}
