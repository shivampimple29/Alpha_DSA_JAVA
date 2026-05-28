package Strings;

import java.util.*;

public class shortest_path {

    static int x = 0;
    static int y = 0;

    public static void Fposition(String str) {
        //O(n)
        System.out.println("Initial position :" + "(" + x + "," + y + ")");

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'W') {
                x--;
            }
            if (str.charAt(i) == 'N') {
                y++;
            }
            if (str.charAt(i) == 'S') {
                y--;
            }
        }

        System.out.println("Final position   :" + "(" + x + "," + y + ")");
    }

    public static void ShortestPath() {
        int sq=x*x + y*y;
        int ans=(int) Math.sqrt(sq);

        System.out.println("Shortest path    :"+ans+" units");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your directions (N,S,E,W) :");
        String str = sc.nextLine();
        Fposition(str);
        ShortestPath();
        sc.close();
    }
}
// WNEENESENNN