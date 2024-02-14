// public class main {
//    public static void main(String[] args) {
//       System.out.println("Hello world");
//       System.out.println("Hello world");
//    }
// }
// public class main {
//    public static void main(String[] args) {
//       System.out.println("*");
//       System.out.println("**");
//       System.out.println("***");
//       System.out.println("****");

//    }
// }

// public class main{
//    public static void main(String[] args){
// //variables
// String name="Tony stark";
// int a=25;
// int b=10;
// int age=34;
// System.err.println(a+b);
//    }
// }
// import java.util.*; // for the packages into the output in the code statement and its usually used for the take input from the user

// public class main{
//    public static void main(String[] args){
// int a=10;
// int b=5;
// int sum=a+b;
// int dif=a-b;
// int mul=a*b;
// System.err.println(sum);
// System.err.println(dif);
// System.err.println(mul);
// // int ans=a*b/a-b;
// int ans=(a*b)/(a-b);
// System.err.println(ans);

//input

//    Scanner sc=new Scanner(System.in);
//    // String name=sc.nextLine(); //For the total line and for the single token we use only sc.next();
//    // System.out.print(name);
//    //nextInt()  for the integer value
//    //newxtFloat() //for the float value
//    int a=sc.nextInt();
//    int b=sc.nextInt();
//    int sum=a+b;
//    System.err.println(sum);

// }

// }

//Condtitonal Satement
// import java.util.*;

// public class main {

//    public static void main(String[] args) {
//       // System.err.print("Enter the Number: ");
//       Scanner sc = new Scanner(System.in);
//       System.err.print("Enter the button: ");
//       int button = sc.nextInt();
//       // if(button==1){
// System.err.println("Naroto Uzumaki");
// }
// else if(button==2){
// System.err.println("Itachi Uchia");
// }
// else if(button==3){
// System.err.println("Madara Uchia");
// }
// else{
// System.err.println("Invalid Button Pressed!");
// }
//       switch (button) {
//          case 1:
//             System.err.println("Naruto Uzumaki");

//             break;
//          case 2:
//             System.err.println("Itachi Uchiha");
//             break;
//          case 3:
//             System.err.println("Madara Uchiha");
//             break;
//          default:
//          System.err.println("Inavalid input");
//             break;
//       }
//    }
// }

//Loop in java

// import java.util.Scanner;

// public class main{
//    public static void main(String args[]){
//       Scanner sc=new Scanner(System.in);
//       int n=sc.nextInt();
//      int sum=0;
//      for(int i=1;i<=10;i++){
//       // System.err.println(i);
//       System.err.println(n*i);
//      }
//    //   System.err.println(sum);

//    }
// }


import java.util.Scanner;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;



public class main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n>=2 && n<=20 ){
        for(int i=1;i<11;i++){
            System.out.println(n+" x "+ i +" = "+n * i);
        }
        }
        else{
            System.out.println("Input number must be 2 and 20.");
        }
    }
}










