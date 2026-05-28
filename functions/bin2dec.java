package functions;

import java.util.*;

public class bin2dec{
    
    public static int bindec(int bin){
        int dec=0, var=0,exp=0;

        while( bin>0){
            var=bin%10;
            dec+=var*Math.pow(2, exp);
            bin/=10;
            exp++;
        }
        return dec;
    }



    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter a binary number :");
        int n=sc.nextInt();
        System.out.println(n+" in decimal is "+bindec(n));
        sc.close();
    }
}