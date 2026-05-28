import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value:");
        int a=sc.nextInt();
        System.out.print("Enter a value:");
        int b=sc.nextInt();
        System.out.print("Enter the operator:");
        char op=sc.next().charAt(0);
        
        switch(op){
            case '+':
                System.out.println(a+b);
                break;
            
            
            case '-':
                System.out.println(a-b);
                break;
            
            
            case '*':
                System.out.println(a*b);
                break;
            

            case '/':
                System.out.println(a/b);
                break;
            

            case '%':
                System.out.println(a%b);
                break;
            
            
            default:System.out.println("Entered character is invalid! Try again!");
        }
        sc.close();
    }
}
                

            
        
    

