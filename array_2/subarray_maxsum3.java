/* Kadane's Algorithm */

package array_2;

import java.util.*;

public class subarray_maxsum3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        int max = Integer.MIN_VALUE, sum = 0;
        System.out.println("Enter the array elements: ");
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            max=Math.max(max, sum);
        }
        System.out.println("maximum sum of subarray is : "+max);
        sc.close();
    }
}
