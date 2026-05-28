package Loops;
import java.util.*;

public class sum_of_n {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=1 , sum=0;
        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        while (i<=n) {
            sum+=i;
            i++;
        }
        System.out.println("sum of first "+n+" numbers is :"+sum);
        sc.close();
    }


}
