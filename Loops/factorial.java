package Loops;
import java.util.*;

public class factorial {
    public static void main(String args[] ){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        int fact=1;

        if (n<0){
            System.out.println("factorial doesn't exist for negative numbers");
        }
        else if(n==1 || n==0){
            System.out.println("factorial is 1");
        }
        else{
            for (int i=2;i<=n;i++){
                fact*=i;
        }
        System.out.println("factrial is "+fact);
       
    }
    sc.close();
}
}
