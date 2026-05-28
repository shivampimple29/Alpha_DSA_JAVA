package Recursion_I;

public class tenToOne {

    public static void Reverse(int i){
        
        if(i>0){
            System.out.print(i+" ");
            Reverse(i-1);
        }
    }

    public static void main(String args[]){
        int i=10;
        Reverse(i);
    }
}
