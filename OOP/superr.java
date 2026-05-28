package OOP;

public class superr {
    public static void main(String[] args) {
        
    B b=new B();
    C c=new C();

    }
}

class A{
    A(){
        System.out.println("Parent Class");
    }

    
}
class B extends A{
    B(){
        super();
        System.out.println("Child1 Class");
    }
}
class C extends A{
    C(){
        super();
        System.out.println("Child2 Class");
    }
}
