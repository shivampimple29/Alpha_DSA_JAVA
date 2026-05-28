
package OOP.Abstraction;

public class Func{
    public static void main(String[] args) {
        Horse h = new Horse();
        h.Eats();
        h.Walks();
        System.out.println(h.color);
        h.changeColor();
        Chicken c = new Chicken();
        c.Eats();
        c.Walks();
        c.changeColor();
    }
}

abstract class Animal {
    String color="brown";
    void Eats() {
        System.out.println("Animal Eats");
    }
    abstract void Walks();
}

class Horse extends Animal {
    void changeColor(){
        color="Black";
        System.out.println(color);
    }
    void Walks() {
        System.out.println("Horse walks on 4 legs");
    }
} 

class Chicken extends Animal {
    void changeColor(){
        color="White";
        System.out.println(color);
    }
    void Walks() {
        System.out.println("Chicken walks on 2 legs");
    }
}


