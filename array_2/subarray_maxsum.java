/*Brute's Force */

package array_2;


import java.util.*;

public class subarray_maxsum{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int max=Integer.MIN_VALUE,sum=0;
        System.out.println("Enter the array elements: ");
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                
                for (int k = i; k <=j; k++) {
                    sum+=arr[k];
                    
                }
                if(max<sum){
                    max=sum;
                }
                sum=0;
                    
                
            }
            
        }
        System.out.println("Maximum sum of the subarray is :"+max);
        sc.close();
    }
}
