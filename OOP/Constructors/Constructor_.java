package OOP.Constructors;

public class Constructor_ {
    public static void main(String[] args) {
    Student s1=new Student();    
    Student s2=new Student(28);    
    Student s3=new Student("Shivam"); 
    

    }
}

class Student{
    int roll;
    String name;

    Student(){
        System.out.println("Non-parameterized Constructor");
    }
    
    Student(int roll){
        
        System.out.println("Parameterized Constructor");
        this.roll=roll;
        System.out.println(this.roll);
    }
    
    Student(String name){
        System.out.println("Parameterized Constructor");
        this.name=name;
        System.out.println(this.name);
    }

}
