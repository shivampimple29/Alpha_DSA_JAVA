package Bit_Manupulation;
import java.util.*;

public class NumberOfSetBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number :");
        int n=sc.nextInt();
        int OG=n;
        int count=0;

        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        System.out.println(OG+" consists of "+count+" set bits .");
        sc.close();

    }
}
