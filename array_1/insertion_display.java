package array_1;

import java.util.*;

public class insertion_display {

    public static void input(int num[], int f) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements :");
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            System.out.print("element " + (i + 1) + " : ");
            num[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void display(int num[]) {
        System.out.println("array elements are:");
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            System.out.println("element " + (i + 1) + " : "+num[i]);

        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements :");
        int n = sc.nextInt();
        System.out.println();
        int arr[] = new int[n];
        input(arr,n);
        System.out.println();
        display(arr);
        sc.close();
}
}
