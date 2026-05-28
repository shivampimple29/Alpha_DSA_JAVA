package OOP;

public class interfaces {
    public static void main(String[] args) {
        Queen q=new Queen();
        Rook r=new Rook();

        q.moves();
        r.moves();
    }
}

interface Chess{
    void moves();
}

class Queen implements Chess{
    public void moves(){
        System.out.println("Moves only 1 square in any direction");
    }
}

class Rook implements Chess{
    public void moves (){
        System.out.println("Moves in available sqaure only in X and Y axis");
    }
}
