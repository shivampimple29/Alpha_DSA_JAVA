package functions;

import java.util.*;

public class dec2bin {
    
    public static void bindec(int dec){
        int var=0,bin=0,exp=0;
        while(dec>0){
             
            
            
            var=dec%2;
            dec/=2;
            bin=bin+var*(int)Math.pow(10,exp);
            exp++;
            

        }
        System.out.println(bin);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number in decimals :");
        int n=sc.nextInt();
        System.out.print("Number in binary :");
        bindec(n);
        sc.close();
    }
}
