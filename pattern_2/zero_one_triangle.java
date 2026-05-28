package pattern_2;

import java.util.*;

public class zero_one_triangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int row=sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((j+i)%2==0){
                    System.out.print(1+" ");
                } 
                else{
                    System.out.print(0+" ");
                }          
            }
            System.out.println();
        }
        sc.close();
    }
}
