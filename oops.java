import java.sql.Struct;
import java.util.Scanner;

// import Triangle.EquilTri;

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
// class Student{
//     String name;
//     int age;
//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     Student(Student s2){
//         this.name=s2.name;
//         this.age=s2.age;
//     }
//     Student(){

//     }

// }
// public class oops {
//     public static void main(String args[]){
//         Student s1=new Student();
//         s1.name="Naruto";
//         s1.age=16;
//         Student s2=new Student(s1);
//         s2.printInfo();
//     }

// }

//polymoriphism
// class Student{
//     String name;
//     int age;
//     public void printInfo(String name){
//         System.out.println(name);
//     }
//     public void printInfo(int age){
//         System.out.println(age);
//     }
//     public void printInfo(String name,int age){
//         // System.out.println(name+" "+"ln"+age);
//         System.out.println(name+'\n'+age);
//     }

// }
// public class oops {
// public static void main(String args[]){
//     Student s1=new Student();
//     s1.name="Prince";
//     s1.age=20;
//     s1.printInfo(s1.name,s1.age);
//     // s1.printInfo("aman");
//     // s1.printInfo(20);
//     // s1.printInfo("Naruto", 16);
// }

// }

//Inheritance
// class Shape {
//     public void area() {
//         System.out.println("Displays area");
//     }
// }

// class Triangle extends Shape {
//     public void area(int l, int h) {
//         System.out.println((1.0 / 2) * h * l);

//     }
// }

// class EquilTri extends Triangle {
//     public void area(int l, int h) {
//         System.out.println(1.0 / 2 * h * l);
//     }
// }

// class circle extends Shape {
//     public void area(int r) {
//         System.out.println((3.14) * r * r);
//     }

// }

// /**
//  * oops
//  */
// public class oops {

//     public static void main(String args[]) {
//         Triangle t1 = new Triangle();
//         t1.area(45, 5);
//         // equilateraltrinagle t2=new equilateraltrinagle();
//         // EquilTri t2=new EquilTri();
//         circle c1=new circle();
//         c1.area(4);
//         EquilTri t2=new EquilTri();
//         t2.area(4, 8);
//     }
// }

//Access modifier and packages
// class Account {
//     public String name;
//     protected String email;
//     private String password;

//     // getter and setter =>Its used to access the private parts from the class

//     public String getPassword() {
//         return this.password;
//     }

//     public String setPassword(String pass) {
//         return this.password=pass;
//     }

// }

// public class oops {
//     public static void main(String args[]) {
//         Account account1 = new Account();
//         account1.name = "Naruto";
//         account1.email = "Naruto@gmail.com";
//         account1.setPassword("prince123");
//         System.out.println(account1.getPassword());

//     }

// }

//Abstraction
//  abstract class Animal {
//     abstract void walk();
// }

// class Horse extends Animal{
//     public void walk(){
//         System.out.println("Walks on the 4 legs");
//     }
// }
// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("Walks on the 2 legs");
//     }
// }
// public class oops {
//     public static void main(String args[]) {
//         Horse horse=new Horse();
//         horse.walk();


//     }

// }

//Interface
interface Animal{
    void walk();
}
interface Herbivore{

}
//multiple inhertance
class Horse implements Animal,Herbivore{ //we can access the interface by implements
public void walk(){
    System.out.println("walks on the 4 legs");
}
}
public class oops {

    public static void main(String args[]){
        Horse horse =new Horse();
        horse.walk();

    }
}


/*Static
 =>
 */