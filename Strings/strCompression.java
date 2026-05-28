package Strings;

import java.util.*;

// Time Complexity : O(n)
public class strCompression {

    public static void Compression(String str) {
        int count = 1;
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                sb.append(count);
                count = 1;
            }
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :");

        String str = sc.nextLine();
        Compression(str);

        sc.close();
    }

}
