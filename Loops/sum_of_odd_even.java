package Loops;

import java.util.*;

public class sum_of_odd_even {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum_even=0;
        int sum_odd=0;
        int choice;

        do{
            System.out.print("Enter a number: ");
            int n=sc.nextInt();
            if (n%2==0) {
                sum_even+=n;
            }
            else{
                sum_odd+=n;
            }

            System.out.println("Enter 1 for entering values or enter 0 for the sum: ");
            choice=sc.nextInt();

        }while(choice==1);

        System.out.println("Sum of even numbers is : "+sum_even);
        System.out.println("Sum of odd number is   : "+sum_odd);
        sc.close();
    }
}