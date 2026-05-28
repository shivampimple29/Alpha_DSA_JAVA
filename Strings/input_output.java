package Strings;

import java.util.*;

public class input_output {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's first name : ");
        String fname = sc.nextLine();
        System.out.print("Enter student's last name  : ");
        String lname = sc.nextLine();
        System.out.println("Greetings of the day " + fname + " " + lname + " !");

        System.out.println("Length of entered string is : " +(fname+lname).length());
        sc.close();
    }
}
