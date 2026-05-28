package functions;

import java.util.*;

public class num_palindrome {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        System.out.println(n+" is a palindrome: "+pal(n));
        sc.close();
    }
    public static boolean pal(int num){
        int rev=0,var=0;
        int og=num;
        while(num>0){
            var=num%10;
            rev=rev*10+var;
            num/=10;
        }
        num=og;
        if (num==rev){
            return true;
        }
        else{
            return false;
        }
    }
    

    
}
