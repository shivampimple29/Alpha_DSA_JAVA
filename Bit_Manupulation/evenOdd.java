package Bit_Manupulation;
import java.util.*;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.print("Enter a number :");
        int n=sc.nextInt();
        int bitmask=1;

        if((n&bitmask)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        sc.close();
    }    
}
