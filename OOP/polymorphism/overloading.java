package OOP.polymorphism;

public class overloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.Addition(2, 3));
        System.out.println(c.Addition(2, 3, 4, 5));
        System.out.println(c.Addition(2.5f, 3.5f));
    }
}

class Calculator {

    int Addition(int a, int b) {
        return a + b;
    }

    int Addition(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    float Addition(float a, float b) {
        return a + b;
    }

}
