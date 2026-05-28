package twoD_array;

import java.util.Scanner;

public class search_L_S {
    static Scanner sc = new Scanner(System.in);

    public static void insert(int a[][]) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                System.out.print("[" + (i + 1) + "]" + "[" + (j + 1) + "]" + " :");
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static void Search(int a[][]) {

        System.out.print("Enter a element to find :");
        int key = sc.nextInt();
        System.out.println();
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == key) {
                    System.out.println("Element is found at " + "[" + (i + 1) + "]" + "[" + (j + 1) + "]");
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("Element not found !");
        }
    }

    public static void Smallest(int a[][]) {
        int s = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (s > a[i][j]) {
                    s = a[i][j];
                }
            }
        }
        System.out.println("Smallest element is " + s);

    }

    public static void Largest(int a[][]) {
        int l = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (l < a[i][j]) {
                    l = a[i][j];
                }
            }
        }
        System.out.println("Largest element is " + l);

    }
    
    public static void main(String args[]) {

        int matrix[][] = new int[3][3];
        insert(matrix);
        System.out.println();
        Search(matrix);
        System.out.println();
        Smallest(matrix);
        System.out.println();
        Largest(matrix);

    }
}
