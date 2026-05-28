package array_1;

import java.util.*;

public class repeatation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n=sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a number to find its occurence :");
        int key = sc.nextInt();
        boolean yes = true;
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                yes = false;
                counter++;
            }
        }
        if (yes) {
            System.out.println(key + " is not present in given array!");
        }

        System.out.println("given number is repeated " + counter + " times in given array .");
        sc.close();
    }
}
