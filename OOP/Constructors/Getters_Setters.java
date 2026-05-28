package OOP.Constructors;

public class Getters_Setters {
    public static void main(String[] args) {
        Pen p = new Pen();// Pen() is a constructor

        p.setColor("blue");
        System.out.println("Pen's color is "+p.getColor());

        p.setTip(5);
        System.out.println("Pen's tip is "+p.getTip()+" units thick");
    }
}

class Pen {
    private String color;
    private int tip;


    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color=newColor;
    }

    void setTip(int tip){
        this.tip=tip;
    }
}