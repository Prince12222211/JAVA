// public class practice{
//     public static void main(String[] args){
//     String name="Madara Uchia";
//     int age=34;
//     System.err.println(name);
//     System.err.println(age);
//     }
// }.

// import java.util.Scanner;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.err.println("Enter the radius of the circle");
//         double radius = sc.nextInt();
//         // System.err.println(radius);
//         double area=3.14*radius*radius;
//         System.err.println("The area of the circle is "+area);

//     }
// }

//Calculator
// import java.util.*;

// public class practice {
//     public static void main(String[] args) {
//         System.err.print("Enter two numebr for the calculate the numbers:");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.err.println("Enter the options:(1,2,3,4,5): ");
//         char options = sc.next().charAt(0);
//         // double result = 0;
//         switch (options) {
//             case '1':
//             System.err.println(a+b);
//                 // result = a + b;
//                 break;
//             case '2':
//                 // result = a - b;
//                 System.err.println(a-b);
//                 break;
//             case '3':
//                 // result = a * b;
//                 System.err.println(a*b);
//                 break;
//             case '4':
//                 // result = a / b;
//                 System.err.println(a/b);
//                 break;
//             case '5':
//                 // result = a % b;
//                 System.err.println(a%b);
//                 break;
//             default:
//                 System.err.println("Invalid Input");
//                 break;
//         }
//     }
// }

import java.util.*;
// public class practice {

//     public static void main(String[] args){
// System.err.println("Enter the number: ");
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         switch (n) {
//             case 1:
//                 System.err.println("January");
//                 break;
//                 case 2:
//                 System.err.println("February");
//                 break;
//                 case 3:
//                 System.err.println("March");
//                 break;
//                 case 4:
//                 System.err.println("April");
//                 break;
//                 case 5:
//                 System.err.println("May");
//                 break;
//                 case 6:
//                 System.err.println("June");
//                 break;
//                 case 7:
//                 System.err.println("July");
//                 break;
//                 case 8:
//                 System.err.println("August");
//                 break;
//                 case 9:
//                 System.err.println("September");
//                 break;
//                 case 10:
//                 System.err.println("October");
//                 break;
//                 case 11:
//                 System.err.println("November");
//                 break;
//                 case 12:
//                 System.err.println("December");
//                 break;

//             default:
//             System.err.println("Invalid");
//                 break;
//         }
//             }
// }
// public class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=0;i<=n;i++){
//             if(i%2!=0){
//                 System.err.println(i);
//             }
//         }

//         }
// }

// public class practice {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int choice;
//         int marks;
//       do{
//         System.err.println("\n Menu");
//         System.err.println("1. Enter Student's marks");
//         System.err.println("0. Exit");
//         System.err.println("Enter your choice(1 or 0)");
//         choice =sc.nextInt();
//         switch (choice) {
//             case 1:
//             System.err.println("Enter students mrtks(out of 100)");
//             marks=sc.nextInt();
//             if(marks>=90){
//                 System.err.println("This is Good");

//             }
//             else if(marks>=60&&marks<=89){
//                 System.err.println("This is alse good");

//             }

//             else if(marks>=59&&marks<=0){
//                 System.err.println("This is good as well");
//             }
//           }
//           break;
//           case 0:
//           System.err.println("Exiting Program. GoodBye");
//     }
// }
// }

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

// public class practice {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int choice;
//         int marks;

//         do {
//             System.out.println("\nMenu:");
//             System.out.println("1. Enter student's marks");
//             System.out.println("0. Exit");
//             System.out.print("Enter your choice (1 or 0): ");
//             choice = scanner.nextInt();

//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter student's marks (out of 100): ");
//                     marks = scanner.nextInt();

//                     if (marks >= 90) {
//                         System.out.println("This is Good");
//                     } else if (marks >= 60 && marks <= 89) {
//                         System.out.println("This is also Good");
//                     } else if (marks >= 0 && marks <= 59) {
//                         System.out.println("This is Good as well\nBecause marks don’t matter but our effort does.");
//                     } else {
//                         System.out.println("Invalid marks entered!");
//                     }
//                     break;
//                 case 0:
//                     System.out.println("Exiting program. Goodbye!");
//                     break;
//                 default:
//                     System.out.println("Invalid choice. Please enter 1 or 0.");
//             }
//         } while (choice != 0);
//     }
// }

// public class practice {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int marks;
//         int choice;
//         do{
//             System.err.println("Menu");
//             System.err.println("1.Enter your marks");
//             System.err.println("0. for exit the program");
//             System.err.println("Choose either 1 or 0");
//             choice = sc.nextInt();
//             switch (choice) {
//                 case 1:
//                 System.err.println("Enter your marks out of 100");
//                 marks =sc.nextInt();
//                 if(marks>=90){
//                     System.err.println("This is Good");
                    

//                 }
//                 else if(marks>=60 && marks<=89){
//                     System.err.println("This is also good "+
//                             "Because marks dont't matter but our efforts does.");
//                 }
//                 else if(marks>=0&&marks<=59){
//                     System.err.println("This is Good as well " + //
//                             "Because marks dont't matter but our efforts does.");
//                 }
//                 else{
//                     System.err.println("Invalid Input");
//                 }
                    
//                     break;
//                     case 0:
//                     System.err.println("Exiting program.Goodbye!");
//                     break;
            
//                 default:System.err.println("give me the correct input either 0 or 1");
                  
//             }
//         }
//         while(choice!=0);

//     }
// }

// public class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//   boolean isPrime=true;
//   if(n<=1){
//     isPrime=false;
//   }
//   else{
//     for(int i=2;i<n;i++){
//         if(n%i==0){
//             isPrime=false;
//             break;
//         }
//     }
//   }
//   if(isPrime){
//     System.err.println("Is a  prime Number");
//   }
//   else{
//     System.err.println("Is not a prime number");
//   }
// }
// }

// public class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         if(n<=1){
//             System.err.println("Is not a prime number");
//         }
//         else{
//             int cnt=0;
//             for(int i=2;i<=n/2;i++){
//                 if(n%i==0){
//                     cnt++;
//                     break;
//                 }
//             }
//             if(cnt==0){
//                 System.err.println("Is a prime number");
//             }
//             else{
//                 System.err.println("Is not a prime number");
//             }
//         }
//     }
// }



import java.util.Scanner;

public class practice{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime =false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
