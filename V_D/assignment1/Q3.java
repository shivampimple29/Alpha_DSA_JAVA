package assignment1;
import java.util.*;

public class Q3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int pen_cost=sc.nextInt();
        int pencil_cost=sc.nextInt();
        int eraser_cost=sc.nextInt();
        int bill=pen_cost+pencil_cost+eraser_cost;
        System.out.println("-- Bill --");
        System.out.println("cost of Pen:"+pen_cost);
        System.out.println("cost of Pencil:"+pencil_cost);
        System.out.println("cost of Eraser:"+eraser_cost);
        System.out.println("Total cost:"+bill);
        float gst=0.18f*bill;
        System.out.println("Bill with taxes are:"+gst);
        sc.close();


    }
}


