package Strings;

import java.util.*;

public class palindrome_checking {
    public static Boolean palindrome(String str) {

        int n=str.length();
        for(int i=0;i<(n/2)-1;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string :");
        String str = sc.nextLine();

        System.out.println(str + " is palindrome :" + palindrome(str));
        sc.close();
    }
}
