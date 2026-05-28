package functions;

import java.util.*;

public class even {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n1=sc.nextInt();
        System.out.println(isEven(n1));
        sc.close();
        }
    
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
        
    }
}
