package Loops;
import java.util.*;

public class one_to_n {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        while (i<=n) {
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}
