package OOP.Inheritance;

public class MultiLevel {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.GrandParent();
        System.out.println("--------------");
        b.Parent();
        b.GrandParent();
        System.out.println("--------------");
        c.GrandParent();
        c.Parent();
        c.Child();

    }
}

class A {

    void GrandParent() {
        System.out.println("Grandparent Class");
    }
}

class B extends A {
    void Parent() {
        System.out.println("Parent Class");
    }
}

class C extends B {
    void Child() {
        System.out.println("Child Class");
    }
}
