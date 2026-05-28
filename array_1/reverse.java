package array_1;

import java.util.*;

public class reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int arr[]=new int [5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >= 0; j--) {
                if (i+j==arr.length-1 && i<j){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + " : "+arr[i]);

        }
        sc.close();
    }
}
