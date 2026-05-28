package Strings;

import java.util.*;

public class vowels_consonents {

    public static void Recognize(String st) {
        int vowels = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u'|| 
                st.charAt(i) == 'A' || st.charAt(i) == 'E' || st.charAt(i) == 'I' || st.charAt(i) == 'O' || st.charAt(i) == 'U') 
                {
                vowels++;
            }
        }
        System.out.println("Number of vowels :"+vowels);



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to recognize number of vowels : ");
        String str = sc.nextLine();

        Recognize(str);
        sc.close();
    }
}
