package OOP.Inheritance;

public class Hier {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.Parent();
        System.out.println("--------------");
        b.Parent();
        b.Child1();
        System.out.println("--------------");
        c.Parent();
        c.Child2();
    }
}

class A {

    void Parent() {
        System.out.println("Parent Class");
    }
}

class B extends A {
    void Child1() {
        System.out.println("Child1 Class");
    }
}

class C extends A {
    void Child2() {
        System.out.println("Child2 Class");
    }
}