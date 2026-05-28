package Bit_Manupulation;
import java.util.*;

public class ithBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.print("Enter a number :");
        int n=sc.nextInt();
        System.out.println("Enter the bit u want to check :");
        int bit=sc.nextInt();
        int bitmask=1<<bit;

        if((n&bitmask)==0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
        sc.close();
    }    
}
