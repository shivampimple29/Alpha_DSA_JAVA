package assignment1;
import java.util.*;
public class Q1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float sum=a+b+c;
        float avg=sum/3;
        System.out.println("Average is "+avg);
        sc.close();

    }
}
