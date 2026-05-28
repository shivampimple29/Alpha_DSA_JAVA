package Strings;
import java.util.*;


public class anagram {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first word :");
        String str1=sc.next();
        System.out.print("");
        System.out.print("Enter second word :");
        String str2=sc.next();

        str1.toLowerCase();
        str2.toLowerCase();

        if(str1.length()==str2.length()){
            char[] ch1=str1.toCharArray(); 
            char[] ch2=str2.toCharArray(); 

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if(Arrays.equals(ch1,ch2)){
                System.out.println(str1 +" and "+str2+" are anagrams .");
            }
            else{
                System.out.println(str1 +" and "+str2+" are not anagrams .");
            }
        }
        else{
            System.out.println(str1+" and "+str2+" have different lengths .");
        }
        sc.close();
    }
}
