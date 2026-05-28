package array_1;

import java.util.*;

public class pair {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the array elements: ");
        

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println();
        System.out.println("pairs are as follows : ");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("( " + arr[i] + " , " + arr[j] + " ) ");
            }
            System.out.println();
        }
        sc.close();
    }
}
