package pattern_2;

import java.util.*;

public class inverted_rotated_pyramid {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter number of rows :");
        int row=sc.nextInt();

        

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=row-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
            System.out.print("*"); 
            }
            
            
            System.out.println();
        }
        sc.close();
    }
}

