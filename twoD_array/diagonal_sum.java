package twoD_array;

import java.util.*;

public class diagonal_sum {
    //O(n+m)
    public static void Staircase_Search(int a[][]) {

        Scanner sc = new Scanner(System.in);
        int row = 0, col = a[0].length - 1;
        System.out.print("Enter a element to search :");
        int key = sc.nextInt();
        boolean flag=true; 
        while (row < a.length && col >= 0) {
            if (a[row][col] == key) {
                System.out.println(key + " is found at  " + "(" + row + "," + col + ")");
                flag=false;
                break;
            }
            else if(a[row][col]>key){
                col--;
            }
            else{
                row++;
            }


        }
        if(flag){
            System.out.println(key+" is absent in the given array");
        }
        sc.close();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 49 } };
        Staircase_Search(matrix);
    }

}
