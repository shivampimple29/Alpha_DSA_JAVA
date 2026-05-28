package array_1;

import java.util.*;

public class linear_search {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a number to find it :");
        int key = sc.nextInt();
        boolean yes = true;

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println(key + " is at index " + i);
                yes = false;
                break;
            }
        }
        if (yes) {
            System.out.println(key + " is not present in given array!");
        }
        sc.close();
    }

}
