package OOP.Constructors;

public class Deep_Constructor {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.age = 18;
        s1.marks[0] = 80;
        s1.marks[1] = 90;
        s1.marks[2] = 100;
        System.out.println("age is " + s1.age);
        
        Student1 s2 = new Student1(s1);
        for (int i = 0; i < 3; i++) {

            System.out.println(s1.marks[i]);
        }

        System.out.println();
        s1.marks[2] = 95;
        for (int i = 0; i < 3; i++) {

            System.out.println(s2.marks[i]);
        }
    }

}

class Student1 {
    int age;
    int marks[];

    Student1() {
        marks = new int[3];
    }

    Student1(Student1 s1) {
        marks = new int[3];

        for(int i=0;i<3;i++){
            this.marks[i]=s1.marks[i];
        }
        
    }
}

