package Bit_Manupulation;
import java.util.*;

public class setithBit {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number :");
        int n=sc.nextInt();
        System.out.print("Enter the bit u want to set :");
        int bit=sc.nextInt();
        int bitmask=1<<bit;

        System.out.println(n|bitmask);
        sc.close();
    }
}
