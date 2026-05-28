package OOP.Inheritance;

public class Single_level {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();

        a.Parent();
        b.Child();
        b.Parent();

        
    }
}

class A {
    
    void Parent() {
        System.out.println("Parent Class");
    }
}

class B extends A {
    void Child(){
        System.out.println("Child Class");
    }
}
