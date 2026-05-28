package Loops;
import java.util.*;

public class reverse1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        System.out.println("Original number is :"+n);
        int rev=0;
        System.out.print("Reversed number is :");

        while( n>0){
            rev=n%10;
            System.out.print(rev+"");
            n/=10;
        }
       
        sc.close();
        
    }
}
