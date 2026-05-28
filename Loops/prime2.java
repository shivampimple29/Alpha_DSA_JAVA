package Loops;

import java.util.*;

public class prime2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        boolean isPrime=true;

        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(n%i==0){
                isPrime=false;
                break;
            }
            
        }

        System.out.println(isPrime);
        sc.close();
    }
}
