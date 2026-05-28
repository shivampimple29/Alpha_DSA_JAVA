package assignment1;

import java.util.*;

public class Q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float side=sc.nextFloat();
        float area=side*side;
        System.out.println("Area of the squarer who's side is " +side+ " sq units is :"+area);
        sc.close();
    }
}
