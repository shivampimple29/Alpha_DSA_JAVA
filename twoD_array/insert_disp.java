// array is stored in computer either in row major or column major
// in JAVA its not necessary for elements to get stored in contigious memory location
// can assign separate array for them

package twoD_array;

import java.util.*;

public class insert_disp {

    public static void insert(int a[][]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                System.out.print("[" + (i+1) + "]" + "[" + (j+1) + "]" + " :");
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public static void display(int a[][]) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        int matrix[][] = new int[3][3];
        insert(matrix);
        System.out.println();
        display(matrix);
    }

}
