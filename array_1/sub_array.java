package array_1;

import java.util.*;

public class sub_array{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the array elements: ");
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Sub-arrays are as follows : ");
        System.out.println();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(");
                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k]);
                    if(k!=j){
                        System.out.print(",");
                    }
                }
                    
                System.out.print(")  ");
            }
            System.out.println();
            sc.close();
        }
    }
}
