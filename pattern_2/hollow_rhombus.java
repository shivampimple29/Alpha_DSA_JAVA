package pattern_2;

import java.util.*;

public class hollow_rhombus {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int row=sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=row-i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j >= 1; j--) {
                
                if(i==1 | i==row | j==1 | j==row){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
