import java.util.*;
public class Taxcalci {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your amount in Lakhs :");
        float income=sc.nextFloat();

        if(income<5){
            System.out.println("0% tax: 0 Rs");
        }
        else if(income>=5 && income<=10 ){
            System.out.println("20% tax: "+income*0.2f);
        }
        else{
            System.out.println("30% tax: "+income*0.3f);
        }
        sc.close();
    }
    
}
