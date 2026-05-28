package OOP.Abstraction;

public class Const {
    public static void main(String[] args) {
        Horse h=new Horse();
        Chicken c=new Chicken();
    }
}

abstract class Animal{
    Animal(){
        System.out.println("Animal Class");
    }
} 

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Class");
    }
} 

class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken Class");
    }
}
