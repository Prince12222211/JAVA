// public class practice{
// public static void main(String[] args){
// String name="Madara Uchia";
// int age=34;
// System.err.println(name);
// System.err.println(age);
// }
// }.

// import java.util.Scanner;

// public class practice {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.err.println("Enter the radius of the circle");
// double radius = sc.nextInt();
// // System.err.println(radius);
// double area=3.14*radius*radius;
// System.err.println("The area of the circle is "+area);

// }
// }

// Calculator
// import java.util.*;

// public class practice {
// public static void main(String[] args) {
// System.err.print("Enter two numebr for the calculate the numbers:");
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// System.err.println("Enter the options:(1,2,3,4,5): ");
// char options = sc.next().charAt(0);
// // double result = 0;
// switch (options) {
// case '1':
// System.err.println(a+b);
// // result = a + b;
// break;
// case '2':
// // result = a - b;
// System.err.println(a-b);
// break;
// case '3':
// // result = a * b;
// System.err.println(a*b);
// break;
// case '4':
// // result = a / b;
// System.err.println(a/b);
// break;
// case '5':
// // result = a % b;
// System.err.println(a%b);
// break;
// default:
// System.err.println("Invalid Input");
// break;
// }
// }
// }

import java.util.*;
// public class practice {

// public static void main(String[] args){
// System.err.println("Enter the number: ");
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// switch (n) {
// case 1:
// System.err.println("January");
// break;
// case 2:
// System.err.println("February");
// break;
// case 3:
// System.err.println("March");
// break;
// case 4:
// System.err.println("April");
// break;
// case 5:
// System.err.println("May");
// break;
// case 6:
// System.err.println("June");
// break;
// case 7:
// System.err.println("July");
// break;
// case 8:
// System.err.println("August");
// break;
// case 9:
// System.err.println("September");
// break;
// case 10:
// System.err.println("October");
// break;
// case 11:
// System.err.println("November");
// break;
// case 12:
// System.err.println("December");
// break;

// default:
// System.err.println("Invalid");
// break;
// }
// }
// }
// public class practice{
// public static void main(String args[]){
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// for(int i=0;i<=n;i++){
// if(i%2!=0){
// System.err.println(i);
// }
// }

// }
// }

// public class practice {
// public static void main(String args[]){
// Scanner sc=new Scanner(System.in);
// int choice;
// int marks;
// do{
// System.err.println("\n Menu");
// System.err.println("1. Enter Student's marks");
// System.err.println("0. Exit");
// System.err.println("Enter your choice(1 or 0)");
// choice =sc.nextInt();
// switch (choice) {
// case 1:
// System.err.println("Enter students mrtks(out of 100)");
// marks=sc.nextInt();
// if(marks>=90){
// System.err.println("This is Good");

// }
// else if(marks>=60&&marks<=89){
// System.err.println("This is alse good");

// }

// else if(marks>=59&&marks<=0){
// System.err.println("This is good as well");
// }
// }
// break;
// case 0:
// System.err.println("Exiting Program. GoodBye");
// }
// }
// }

// import java.util.Scanner;

// import javax.print.DocFlavor.STRING;
// import javax.swing.text.html.StyleSheet;

// import javax.swing.plaf.synth.SynthStyle;

// public class practice {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// int choice;
// int marks;

// do {
// System.out.println("\nMenu:");
// System.out.println("1. Enter student's marks");
// System.out.println("0. Exit");
// System.out.print("Enter your choice (1 or 0): ");
// choice = scanner.nextInt();

// switch (choice) {
// case 1:
// System.out.print("Enter student's marks (out of 100): ");
// marks = scanner.nextInt();

// if (marks >= 90) {
// System.out.println("This is Good");
// } else if (marks >= 60 && marks <= 89) {
// System.out.println("This is also Good");
// } else if (marks >= 0 && marks <= 59) {
// System.out.println("This is Good as well\nBecause marks don’t matter but our
// effort does.");
// } else {
// System.out.println("Invalid marks entered!");
// }
// break;
// case 0:
// System.out.println("Exiting program. Goodbye!");
// break;
// default:
// System.out.println("Invalid choice. Please enter 1 or 0.");
// }
// } while (choice != 0);
// }
// }

// public class practice {

// public static void main(String args[]){
// Scanner sc=new Scanner(System.in);
// int marks;
// int choice;
// do{
// System.err.println("Menu");
// System.err.println("1.Enter your marks");
// System.err.println("0. for exit the program");
// System.err.println("Choose either 1 or 0");
// choice = sc.nextInt();
// switch (choice) {
// case 1:
// System.err.println("Enter your marks out of 100");
// marks =sc.nextInt();
// if(marks>=90){
// System.err.println("This is Good");

// }
// else if(marks>=60 && marks<=89){
// System.err.println("This is also good "+
// "Because marks dont't matter but our efforts does.");
// }
// else if(marks>=0&&marks<=59){
// System.err.println("This is Good as well " + //
// "Because marks dont't matter but our efforts does.");
// }
// else{
// System.err.println("Invalid Input");
// }

// break;
// case 0:
// System.err.println("Exiting program.Goodbye!");
// break;

// default:System.err.println("give me the correct input either 0 or 1");

// }
// }
// while(choice!=0);

// }
// }

// public class practice{
// public static void main(String args[]){
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// boolean isPrime=true;
// if(n<=1){
// isPrime=false;
// }
// else{
// for(int i=2;i<n;i++){
// if(n%i==0){
// isPrime=false;
// break;
// }
// }
// }
// if(isPrime){
// System.err.println("Is a prime Number");
// }
// else{
// System.err.println("Is not a prime number");
// }
// }
// }

// public class practice{

// public static void main(String args[]){
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// if(n<=1){
// System.err.println("Is not a prime number");
// }
// else{
// int cnt=0;
// for(int i=2;i<=n/2;i++){
// if(n%i==0){
// cnt++;
// break;
// }
// }
// if(cnt==0){
// System.err.println("Is a prime number");
// }
// else{
// System.err.println("Is not a prime number");
// }
// }
// }
// }

import java.util.Scanner;

// public class practice{
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter a number to check if it's prime: ");
// int number = scanner.nextInt();

// boolean isPrime = true;

// if (number <= 1) {
// isPrime = false;
// } else {
// for (int i = 2; i < number; i++) {
// if (number % i == 0) {
// isPrime =false;
// break;
// }
// }
// }

// if (isPrime) {
// System.out.println(number + " is a prime number.");
// } else {
// System.out.println(number + " is not a prime number.");
// }
// }
// }

// public class practice {
// public static double printAvg(double a, double b, double c) {
// double avg = (a + b + c) / 3;
// return avg;
// }

// public static void main(String args[]) {
// Scanner scan = new Scanner(System.in);
// double a = scan.nextDouble();
// double b = scan.nextDouble();
// double c = scan.nextDouble();
// double avg = printAvg(a, b, c);
// System.out.println("The Average of the three number is: " + avg);

// }
// }

// Write a function to print the sum of all odd numbers from 1 to n.
// public class practice {
// public static void printSum(int n) {
// int count = 0;

// for (int i = 1; i <= n; i++) {
// if (i % 2 != 0) {
// count = count + i;

// }

// }
// System.out.println(count);

// return;
// }

// public static void main(String args[]) {
// Scanner scan = new Scanner(System.in);
// int n = scan.nextInt();
// // int sum=printSum(n);
// // System.out.println(printSum(n));
// // System.out.print(printSum(n));
// printSum(n);

// }
// }

// Write a function which takes in 2 numbers and returns the greater of those
// two.
// public class practice{
// public static void printGreatest(int a, int b){
// if(a>b){
// System.out.println(a);
// }
// else if(b>a){
// System.out.println(b);
// }
// else{
// System.out.println("Invalid number");
// }
// }
// public static void main(String args[]){
// Scanner scan=new Scanner(System.in);
// int a=scan.nextInt();

// int b=scan.nextInt();
// System.out.print("The gratest of the two number is: ");
// printGreatest(a, b);
// }
// }

// 4. Write a function that takes in the radius as input and returns the
// circumference of a circle
// public class practice {
// public static double calculateCircum(double r) {
// double a = (2 * 3.14) * r;
// // return a;
// System.out.print(a);
// return a;
// }

// public static void main(String args[]) {
// Scanner scan = new Scanner(System.in);
// double r = scan.nextDouble();
// System.out.print("The circumference of the circle is: ");
// calculateCircum(r);

// }
// }

// 5. Write a function that takes in age as input and returns if that person is
// eligible
// to vote or not. A person of age > 18 is eligible to vote.
// public class practice{
// public static void eligible(int n){
// if(n>18){
// System.out.println("You are eligible for vote");
// }
// else{
// System.out.println("You are not eligible for vote");

// }
// return ;
// }
// public static void main(String args[]){
// Scanner scan=new Scanner(System.in);
// int n=scan.nextInt();
// eligible(n);
// }
// }

// 6. Write an infinite loop using do while condition.
// public class practice {
// public static void infinite(int a) {
// do {
// // System.err.println("The infinite loop is");
// } while (a > 0);
// }

// public static void main(String args[]) {
// Scanner scan = new Scanner(System.in);
// int n=scan.nextInt();
// infinite(n);

// }
// }

// 7. Write a program to enter the numbers till the user wants and at the end it
// should display the count of positive, negative and zeros entered.
// public class practice {
// public static void countNumber() {
// Scanner scan = new Scanner(System.in);

// int countPositive = 0;
// int countNegative = 0;
// int countZeroes = 0;

// char choice;
// do {
// System.out.println("Enter a number");

// int n = scan.nextInt();
// if (n > 0) {
// countPositive++;
// } else if (n < 0) {
// countNegative++;

// } else {
// countZeroes++;
// }
// System.out.println("Enter the choice(y/n):");

// choice = scan.next().charAt(0);

// } while (choice == 'Y' || choice == 'y');
// System.out.println("Count positive number" + countPositive);
// System.out.println("Counnt negative number" + countNegative);
// System.out.println("Count zeroes number" + countZeroes);

// return;
// }

// public static void main(String args[]) {

// // countNumber(n);
// countNumber();

// }
// }

// Two numbers are entered by the user, x and n. Write a function to find
// the value of one number raised to the power of another i.e. .𝑥𝑛

// public class practice {
// public static double calculatepow(double x, int n) {
// if (n < 0) {
// return 1;
// }
// else if(n==0){
// return 1;
// }
// else{
// double result=1;
// for(int i=0;i<n;i++){
// result*=x;
// }
// return result;
// }
// }
// public static void main(String args[]){
// Scanner scan=new Scanner(System.in);
// double x=scan.nextDouble();
// int n=scan.nextInt();
// System.out.print("The power of the number is: ");
// // calculatepow(x, n);
// // calculatepow(x, b)
// // calculatepow(a, b);
// double result= calculatepow(x, n);
// System.err.println(result);
// }
// }

// public class practice{
// public static void main(String args[]){
// Scanner scan=new Scanner(System.in);
// int n=scan.nextInt();
// String name[]= new String[n];
// for(int i=0;i<n;i++){
// name[i]=scan.nextLine();
// }
// for(int i=0;i<=name.length;i++){
// // System.out.print(name[i]);
// System.out.println("name " + i +" is : " + name[i]);
// }

// }
// }

// Find the maximum & minimum number in an array of integers
// public class practice {
// public static void main(String args[]) {
// Scanner scan = new Scanner(System.in);
// System.out.print("Enter the number of the array: ");
// int n = scan.nextInt();
// int num[] = new int[n];
// for (int i = 0; i < n; i++) {
// num[i] = scan.nextInt();
// }
// int min = Integer.MAX_VALUE;
// int max = Integer.MIN_VALUE;

// // int min = Integer.MAX_VALUE;
// // int max = Integer.MIN_VALUE;

// for (int i = 0; i < n; i++) {
// if (num[i] > max) {
// max = num[i];
// // System.out.print(max);
// }
// if (num[i] < min) {
// min = num[i];
// // System.out.print(min);

// }
// }
// System.out.println("The minumum value of the array is: " + min);
// System.out.println("The maximum value of the array is: " + max);
// }
// }

// Take an array of numbers as input and check if it is an array sorted in
// ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
// {3, 4, 6, 2} is not sorted in ascending order.
// public class practice{
// public static void main(String args[]){
// Scanner scan=new Scanner(System.in);
// int n=scan.nextInt();
// int num[]=new int [n];
// for(int i=0;i<n;i++){
// num[i]=scan.nextInt();
// }
// boolean isAscending=true;
// for(int i=0;i<n-1;i++){
// if(num[i]>num[i+1]){
// isAscending=false;
// }

// }
// if(isAscending){
// System.out.println("The number in the ascening oreder");
// }
// else{
// System.out.println("The array is not in the ascending order");
// }
// }
// }

// Print the spiral order matrix as output for a given matrix of numbers
// public class practice {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int m = scan.nextInt();
//         int num[][] = new int[n][m];
//         for (int i = 0; i < n; i++) {
//             // num[n][m] = scan.nextInt();
//             for(int j=0;j<m;j++){
//                 num[i][j]=scan.nextInt();
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 // System.out.println(num[i][j]);
//                 // num[i][j];
//                 // System.out.println(i+" "+j);
//                 System.out.print(num[i][j]+" ");
//             }
//             // System.out.println();
//         }

//     }
// }

//Tranpose of the matrix
// public class practice {
//     public static void main(String args[]) {

//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int m = scan.nextInt();
//         int num[][] = new int[n][m];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 num[i][j] = scan.nextInt();
//             }

//         }
//         System.out.println("The Transpose of the matrix is: ");
//         for (int j = 0; j < m; j++) {
//             for (int i = 0; i < n; i++) {
//                 System.out.print(num[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// //String 
// Take an array of Strings input from the user & find the cumulative (combined)
// // length of all those strings.
// public class practice {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         // String name=scan.nextLine();
//         String name[] = new String[n];
//         int totLength = 0;
//         for (int i = 0; i < n; i++) {
//             name[i] = scan.next();
//              totLength += name.length;

//         }

//         System.out.println(totLength);

//     }

// }

// import java.util.*;
// public class practice {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         String name[] = new String[n];
//         int totLength = 0;
//         for(int i=0;i<n;i++){
//             name[i]=scan.next();
//             totLength+=name[i].length();
//         }

//         System.out.println("The total length of the String name is: "+totLength);
//     }
// }

// public class practice {

//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         String name=scan.next();
//         String result="";
//         for(int i=0;i<name.length();i++){
//             if(name.charAt(i)=='e'){
//                 result+='i';
//             }
//             else{
//                 result+=name.charAt(i);
//             }

//         }
//         System.out.println("The result of the name is "+result);
//     }
// }

// Input an email from the user. You have to create a username from the email
// by deleting the part that comes after ‘@’. Display that username to the user.
// Example :
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
// email = “helloWorld123@gmail.com”; username = “helloWorld123”
// public class practice {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter your Email: ");
//         String Email = scan.next();
//         String result = "";
//         for (int i = 0; i < Email.length(); i++) {
//             if (Email.charAt(i) == '@') {
//                 break;

//             } else {
//                 result += Email.charAt(i);
//             }
//         }

//         System.out.println("The username is: " + result);
//     }
// }

// public class practice {

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int m = scan.nextInt();
//         int arr[][] = new int[n][m];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 arr[i][j] = scan.nextInt();
//             }
//         }
//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 count += arr[i][j];
//             }
//         }
//         System.out.print(count);

//     }
// }
// public class practice {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int m = scan.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= m; j++) {
//                 if (i == 1 || j == 1 || j == m || i == n) {
//                     System.err.print("*");
//                 }
//                 else{
//                     System.err.print(" ");
//                 }
//             }
//             System.err.println();

//         }

//     }
// }

// public class practice {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         for (int i = n; i >= 1; i--) {
//             for (int j = i; j < n; j++) {
//                 System.out.print(" ");
//             }

//             for (int j = 1; j <= (2*i-1); j++) {
//                 System.out.print("*");
//             }

//             System.err.println();
//         }
//     }
// }

//Print Prime number 
// public class practice {

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         for (int i = 2; i <= n; i++) {
//             boolean isPrime = true;
//             for (int j = 2; j * j <= i; j++) {
//                 if (i % j == 0) {
//                     isPrime = false;
//                     break;
//                 }

//             }
//             if (isPrime) {
//                 System.out.print(i + " ");
//             }
//         }

//     }
// }

// public class practice {
//     public static int calcFact(int n){
//         if(n==0||n==1){
//             return 1;
//         }
//         int num=calcFact(n-1);
//         int num2=n*num;
//         return num2;
//     }

//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n=scan.nextInt();
//         int ans=calcFact(n);
//         System.out.print("The factorial of the number is:");
//         System.out.println(ans);

//     }
// }
//Calculate power of the any number in the code 
// public class practice {
//     public static int calPower(int x, int n){
//     if(x==0){
//         return 0;
//     }
//     if(n==0){
//         return 1;
//     }
//     int num=calPower(x, n-1);
//     int num2=x*num;
//     return num2;
// }

//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         int x=scan.nextInt();
//         int n=scan.nextInt();
//         int ans=calPower(x, n);
// System.out.println(ans);
// }
// }

// public class practice {
//     public static void TOH(int n, String src, String hlp, String dest) {
//         if (n == 1) {
//             System.out.println("Disk starts " + n + " From " + "Src " + "To " + "Destination ");
//             return;

//         }
//         TOH(n - 1, src, dest, hlp);
//         // System.out.println();
//         System.out.println("Disk starts " + n + " From " + "Src " + "To " + "Destination ");
//         TOH(n - 1, hlp, src, dest);
//     }

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();

//         TOH(n, "S", "H", "D");
//     }
// }
// public class practice {

//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         int n=scan.nextInt();
//         int m=scan.nextInt();
//         for(int i=1;i<=n;i++){
//             // System.out.print(" ");
//             for(int j=m;j>=i;j--){
//                 System.out.print("*");
//             }
//             // System.out.println();
//             for(int j=0;j<2*i-1;j++){
//                 System.out.println(" ");
//             }
//         }
//     }
// }
// Create a pattern that forms a right-angled triangle made of stars, with the base having 5 stars.
// public class practice {
//     public static void main(String args[]){
//         Scanner scan =new Scanner(System.in);
//         int n=scan.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

// }
// Generate a pattern that forms a diamond shape using stars, with the widest part having 7 stars.
// public class practice {

//     public static void main(String args[]){
//         Scanner scan =new Scanner(System.in);
//         int n=scan.nextInt();
//         // int m=scan.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
// System.out.println();
//         }
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
// System.out.println();
//         }

//     }
// }

// Construct a pattern of an equilateral triangle using stars with a base length of 9 stars.
// public class practice {

//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         int n=scan.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// Create a square pattern using stars, with each side having 6 stars.
// public class practice {

//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         int n=scan.nextInt();
//         for(int i=1;i<=n;i++){
//             System.out.print("*");
//             for(int j=1;j<=n;j++){
//                 System.err.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Form a pyramid pattern using stars, with the base layer having 9 stars.
// public class practice {

//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         int n=scan.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class practice {
//     public static int calcFact(int n) {
//         if (n == 0) {
//             return 1;
//         }
//         if (n == 1) {
//             return 1;
//         }
//         int num1 = calcFact(n - 1);
//         int num2 = n * num1;
//         return num2;
//     }

//     public static void  main(String args[]){

// Scanner scan=new Scanner(System.in);
// int n=scan.nextInt();
// int ans=calcFact(n);
// System.out.println(ans);
//     }
// }

// public class practice {
//     public static void calcAverage(int n,int arr[]){
//         int count=0;
//         for(int i=0;i<n;i++){
//             count+=arr[i];
//         }
//         int ans=count/n;
//         System.out.println(ans);

//         // return;

//     }

//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         int n=scan.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=scan.nextInt();

//         }
//         // int ans=calcAverage(n, arr);
//         calcAverage(n, arr);

//     }
// }

// public class practice {

//     public static boolean checkPalindrome(String name){
//         if(name.length()==0){
//             return false;
//         }
//         int left=0;
//         int right=name.length()-1;
//         while(left<right){
//             if(name.charAt(left)!=name.charAt(right)){
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;

//     }
//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         String name=scan.nextLine();
//         System.out.println(checkPalindrome(name));

//     }
// }

// public class practice {
//     public static boolean checkPrime(int n) {
//                 boolean isPrime = true;

//         if(n==1){
//             return true;
//         }
//         if(n==0){
//             return false;
//         }
//         for (int i = 2; i <n; i++) {
//             if (n % i == 0) {
//                 return false;
//             }

//         }
//         return true;
//     }

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);

//         int n = scan.nextInt();
//         System.out.println(checkPrime(n));

//     }
// }

// public class practice {
//     public static void modifyArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             // System.out.print(arr[i]*2+" ");
//             arr[i] *= 2;
//         }

//     }

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scan.nextInt();
//             // System.out.print(modifyArray(arr));
//             // int ans=modifyArray(arr);
//             // printArray(arr);

//         }
//         modifyArray(arr);
// System.out.print("Modify array is:");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }

//     }
// }

// public class practice {
//     public static double printTemp(double n){
//         double a=32;
//         double f=(9*n)/5;
//         double g=f+a;
//         return g;

//     }

//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         System.out.print("Enter the temperature in the form of the celsius(∘C):");
//         double n=scan.nextDouble();
//        double ans= printTemp(n);
//        System.out.print("The temperature in ferehenite is "+ans+" ∘F ");

//     }
// }

// public class practice {

//     public static void countVowel(String name) {
//         int count = 0;

//         for (int i = 0; i < name.length(); i++) {
//             if (name.charAt(i) == 'a' | name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
//                     || name.charAt(i) == 'u') {
//                 // count+=name.charAt(i);
//                 count++;
//             }
//         }
//         System.out.println("The number of vowel is: " + count);

//     }

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         String str = scan.nextLine();
//         countVowel(str);

//     }
// }

// public class practice {
//     public static void findMax(int arr[]){
//         int max=Integer.MIN_VALUE;
//         int min=Integer.MAX_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];

//             }

//             }
//             System.out.println("The maximum element is"+max);
//         }

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scan.nextInt();
//         }
//         // System.out.print(findMax(arr));
//         findMax(arr);

//     }
// }
// Count the number of words in the sentence.
// public class practice {
//     public static void countString(String str){
//         int count=0;
//         for(int i=0;i<str.length();i++){
//             count++;
//         }
//         System.out.println(count);

//     }

//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         String str=scan.nextLine();
//         countString(str);

//     }
// }

// import java.util.Scanner;

// public class practice {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input a sentence
//         System.out.print("Enter a sentence: ");
//         String sentence = scanner.nextLine();

//         // Find and print the longest word
//         String longestWord = findLongestWord(sentence);
//         System.out.println("Longest word in the sentence: " + longestWord);
//     }

//     // Function to find the longest word in a sentence
//     private static String findLongestWord(String sentence) {
//         String[] words = sentence.split("\\s+"); // Split sentence into words
//         String longestWord = "";

//         for (String word : words) {
//             // Remove any non-alphabetic characters
//             word = word.replaceAll("[^a-zA-Z]", "");

//             // Check if the current word is longer than the previous longest word
//             if (word.length() > longestWord.length()) {
//                 longestWord = word;
//             }
//         }

//         return longestWord;
//     }
// }

// Replace all occurrences of the letter 'a' with '*' in the sentence
// public class practice {
//     public static void replacement(String str){

//   String modifString=str.replace('a','*' );
//   System.out.println(modifString);

//     }

//      public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         String str=scan.nextLine();
//         replacement(str);
//      }
// }

// public class practice {
//     public static boolean checkPalindrome(String str){
//         if(str.length()==0){
//             return false;
//         }
//         int left=0;
//         int right=str.length()-1;
//         while(left<right){
// if(str.charAt(right)!=str.charAt(left)){
//     return false;
// }
// left++;
// right--;
//         }
//         return true;

//     }

//      public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         String str=scan.nextLine();
//         //  String arr=checkPalindrome(str);.
//         System.err.println(checkPalindrome(str));

//      }
// }

//reverse string
// public class practice {
//     public static void reverseString(String str){
//         StringBuilder reversed = new StringBuilder(str);
//         for(int i=0;i<str.length()/2;i++){
//             int front=i;
//             int back=str.length()-1-i;
//             char frontChar=str.charAt(front);
//             char backChar=str.charAt(back);
//             reversed.setCharAt(front,backChar);
//             reversed.setCharAt(back,frontChar);

//         }
//         System.out.println(reversed);
//     }

//      public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         String str=scan.nextLine();
//         reverseString(str);
//      }
// }

// public class practice {
//     public static void countVowels(String str) {
//         int count = 0;
//         int consonant = 0;
//         for (int i = 0; i < str.length(); i++) {

//             if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
//                     || str.charAt(i) == 'u') {
//                 count++;

//             } else {
//                 consonant++;
//             }

//         }
//         System.out.println("The number of the vowels are:" + count);
//         System.out.println("The number of the vowels are:" + consonant);
//     }

//     public static void main(String args[]) {

//         Scanner scan = new Scanner(System.in);
//         String str = scan.nextLine();
//         // System.err.println(countVowels(str));
//         countVowels(str);
//     }
// }

// public class practice {

//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);

//     }

// }

// import java.util.Scanner;

// public class practice {
//     public static String generateVowelName(int length) {
//         StringBuilder vowelName = new StringBuilder();
//         String vowels = "aeiouAEIOU"; // Include both lowercase and uppercase vowels

//         for (int i = 0; i < length; i++) {
//             int randomIndex = (int) (Math.random() * vowels.length());
//             vowelName.append(vowels.charAt(randomIndex));
//         }

//         return vowelName.toString();
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input the desired length of the vowel name
//         System.out.print("Enter the length of the vowel name: ");
//         int length = scanner.nextInt();

//         // Generate and print the vowel name
//         String vowelName = generateVowelName(length);
//         System.out.println("Generated Vowel Name: " + vowelName);
//     }
// }

// java.util.Arrays;

//This is the code for the check anagarm or not??
// import java.util.Arrays;
// public class practice {
//     public static boolean checkAnagram(String str1,String str2){
//         // str1 = str1.replaceAll("\\s", "").toLowerCase();
//         // str2 = str2.replaceAll("\\s", "").toLowerCase();
//         // boolean anagram=true;
//     if(str1.length()!=str2.length()){
//         return false;
//     }
//     else{
//         char[] chars1=str1.toCharArray();
//         char[] chars2=str2.toCharArray();

//      Arrays.sort(chars1);
//      Arrays.sort(chars2);
//      return Arrays.equals(chars1,chars2);

//     }

//     }

//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         String str1=scan.nextLine();
//         String str2=scan.nextLine();

//         if(checkAnagram(str1, str2)){
//             System.out.println("This is the anagram");
//         }
//         else{
//             System.out.println("This is not the anagram");
//         }
//     }
// }

// public class practice {
//     public static int printFact(int n) {
//         if (n == 0) {
//             return 1;
//         }
//         if (n == 1) {
//             return 1;
//         }
//         int x = printFact(n - 1);
//         int a = n * x;
//         return a;
//     }

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int ans = printFact(n);
//         System.out.println(ans);

//     }
// }

// public class practice {
//     public static void fibonacci(int a, int b, int n) {
//         if (n == 0) {
//             return;
//         }
//         int c = a + b;
//         System.out.print(c);
//         fibonacci(b, c, n - 1);

//     }

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//        int a=0;
//        int b=1;
//        System.out.print(a);
//        System.out.print(b);
// fibonacci(a, b, n-2);
//     }
// }

// public class practice {
//     public static void printRevers(String str) {
//         StringBuilder sb = new StringBuilder(str);
//         int n = sb.length();
//         for (int i = 0; i < n / 2; i++) {
//             int front = i;
//             int back = sb.length() - 1 - i;
//             char frontChar = sb.charAt(front);
//             char backChar = sb.charAt(back);
//             // sb.setCharAt(n, backChar);charAt(front,backChar);
//             // sb.charAt(back,frontChar);
//             sb.setCharAt(front, backChar);
//             sb.setCharAt(back, frontChar);

//         }
//         System.out.print(sb);
//     }

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         String str = scan.nextLine();
//         printRevers(str);

//     }
// }

// public class practice {
//     public static int printFact(int n) {
//         if (n == 0 || n == 1) {
//             return 1;
//         }
//         int x = printFact(n - 1);
//         int a = n * x;
//         return a;

//     }

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         // System.out.println(printFact(n));
//         int ans = printFact(n);
//         System.out.println(ans);

//     }
// public class practice {

//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         int n=scan.nextInt();
//         String str[]=new String[n];
//         for(int i=0;i<str.length;i++){
//             str[n]=scan.nextLine();

//         }
//         for(int i=0;i<str.length;i++){
//             System.out.println(str[i]);
//         }
//     }
// }

// public class practice {

//      public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         System.out.println(args[0]);
//         System.out.println(args[1]);
//      }
// }

public class practice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        
            System.err.println("Is a prime Number");
        } else {
            System.err.println("Is not a prime number");
        }
    }
}