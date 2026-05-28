package OOP.polymorphism;

public class overriding {
    public static void main(String[] args) {
        Summ s1=new Summ();
        Subb s2=new Subb();

        s2.Calc(10, 6);
        s1.Calc(10, 6);
    }
}

class Summ {
    void Calc(int a, int b) {
        System.out.println(a + b);
    }
}

class Subb {
    void Calc(int a, int b) {
        System.out.println(a-b);
    }
}