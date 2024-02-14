import java.util.Scanner;

// class Pen {
//     String color;
//     String type;

//     public void write() {
//         System.out.println("Writing Something");
//     }

//     public void printColor() {
//         System.out.println(this.color);
//     }

//     public void printType() {
//         System.out.println(this.type);
//     }
// }

// public class oops {

//     public static void main(String args[]) {
//         Pen pen1 = new Pen();
//         pen1.color = "blue";
//         pen1.type = "gel";
//         Pen pen2 = new Pen();
//         pen2.color = "black";
//         pen2.type = "ballpoint";
//         pen1.printColor();
//         pen1.printType();
//         pen2.printColor();
//         pen2.printType();

//     }
// }


class Student{
    String Name;
    int age;
    public void printInfo(){
        System.out.println(this.Name);
        System.out.println(this.age);
    }
}
/**
 * oops
 */
public class oops {

    public static void main(String args[]){
        Student s1=new Student();
        s1.Name="Prince";
        s1.age=20;
        s1.printInfo();
        Student s2=new Student();
        s2.Name="Naruto";
        s2.age=16;
        s2.printInfo();

    }
}
