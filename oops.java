import java.sql.Struct;
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
/*Constructor are two types parameterised and non parameterised */

// class Student{
//     String Name;
//     int age;
//     public void printInfo(){
//         System.out.println(this.Name);
//         System.out.println(this.age);
//     }
// }
// /**
//  * oops
//  */
// public class oops {

//     public static void main(String args[]){
//         Student s1=new Student();
//         s1.Name="Prince";
//         s1.age=20;
//         s1.printInfo();
//         Student s2=new Student();
//         s2.Name="Naruto";
//         s2.age=16;
//         s2.printInfo();

//     }
// }

/*Constructor(Parameterised Constructor) */
// class Student {
//     String name;
//     int age;

//     public void printInfo() {
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }

//     Student(String name, int age) { // parameterised constructor
//         this.name = name;
//         this.age = age;
//     }

// }

// public class oops {

//     public static void main(String args[]) {
//         Student s1 = new Student("naruto", 16);

//         s1.printInfo();

//     }
// }


//Copy Constructor
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    Student(){

    }

}
public class oops {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Naruto";
        s1.age=16;
        Student s2=new Student(s1);
        s2.printInfo();
    }

    
}
