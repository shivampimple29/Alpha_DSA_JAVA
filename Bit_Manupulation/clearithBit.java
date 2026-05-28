package Bit_Manupulation;

import java.util.Scanner;

public class clearithBit {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number :");
        int n=sc.nextInt();
        System.out.print("Enter the bit u want to clear :");
        int bit=sc.nextInt();
        int bitmask=1<<bit;

        System.out.println(n^bitmask);
        sc.close();
    }
}
