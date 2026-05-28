package Loops;
import java.util.*;

public class sqaure {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of lines for square pattern :");
        int lines=sc.nextInt();
        for (int i = 1; i<=lines; i++) {
            for (int j = 1; j <=lines; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }
        sc.close();
    }
}
