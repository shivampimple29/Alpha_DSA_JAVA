package Bit_Manupulation;
import java.util.*;


public class clearRangeOfbits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number :");
        int n=sc.nextInt();
        System.out.print("Enter lower limit :");
        int i=sc.nextInt();
        System.out.print("Enter upper limit :");
        int j=sc.nextInt();

        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        System.out.println(n&bitmask);



        sc.close();
    }    
}