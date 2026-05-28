package Strings;

public class compare {

    public static void main(String[] args) {
        
        String str1="Shivam";
        String str2="Shivam";
        String str3=new String("Shivam");
        //== compares object not the string content
        if(str1==str3){
            System.out.println("SAME");
        }
        else{
            System.out.println("DIFFERENT");
        }
        if(str1.equals(str3)){
            System.out.println("SAME");
        }
        else{
            System.out.println("DIFFERENT");
        }

    }
}
