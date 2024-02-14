
//Solid Triangle
import java.util.*;

// import javax.sound.midi.SysexMessage;

// public class pattern {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int m = scan.nextInt();

//         for (int i = 1; i <= n; i++) {
//             // System.err.println("*");
//             for (int j = 1; j <= m; j++) {
//                 System.err.print("*");
//             }
//             System.err.print("\n");

//         }
//     }
// }

//Hollow Triangle

// public class pattern {
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

// Half pyramaid
// public class pattern{
//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         // int n=scan.nextLine();
//         int n=scan.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.err.print("*");
//             }
//             System.err.println();
//         }
//     }
// }

// Inverted Half pyramid
// public class pattern{
//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         // int n=scan.nextLine();
//         int n=scan.nextInt();
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.err.print("*");
//             }
//             System.err.println();
//         }
//     }
// }

//Inverted Half Pyramid(Rotated by 180 degree)
// public class pattern {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         // int m=scan.nextInt();
//         // Outer loop
//         for (int i = 1; i <= n; i++) {
//             // inner loop->Space Print
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             // inner loop->star print
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();

//         }

//     }

// }

//Half pyramid with Number
// public class pattern {
//     public static void main(String[] args) {
// Scanner scan=new Scanner(System.in);
// int n=scan.nextInt();
// // int m=scan.nextInt();
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.err.print(j+" ");
//     }
//     System.err.println();
// }
//     }
// }

// Inverted half pyramid with numbers
// public class pattern {
//     public static void main(String[] args) {
// Scanner scan=new Scanner(System.in);
// int n=scan.nextInt();
// // int m=scan.nextInt();
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i+1;j++){
//         System.err.print(j+" ");
//     }
//     System.err.println();
// }
//     }
// }

//Flody's Triangle
// public class pattern{
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);
//         int n=scan.nextInt();
//         int count=1;
//         for(int i=1;i<=n;i++){

//             for(int j=1;j<=i;j++){
//                 System.err.print(count+" ");
//                 count++;
//             }
//             System.err.println();
//         }
//     }
// }

//0-1 Triangle
// public class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//      for(int i=1;i<=n;i++){

//         for(int j=1;j<=i;j++){
//              int sum=i+j;
//              if(sum%2==0){
//                 System.err.print("1 ");
//              }
//              else{
//                 System.out.print("0 ");
//              }

//         }
//         System.err.println();
//      }   
//     }
// }

//Butterfly pattern
// public class pattern {
//    public static void main(String args[]) {
//       Scanner scan = new Scanner(System.in);
//       int n = scan.nextInt();
//       //upper half
//       for (int i = 1; i <= n; i++) {
//          //1st part
//          for (int j = 1; j <= i; j++) {
//             System.out.print("*");

//          }
//          //space
//          int space = 2 * (n - i);
//          for (int j = 1; j <= space; j++) {
//             System.out.print(" ");
//          }
//          //2nd part
//          for (int j = 1; j <= i; j++) {
//             System.out.print("*");
//          }
//          System.out.println();
//       }
//       //lower half
//       for (int i = n; i >= 1; i--) {
//          for (int j = 1; j <= i; j++) {
//             System.out.print("*");

//          }
//          int space = 2 * (n - i);
//          for (int j = 1; j <= space; j++) {
//             System.out.print(" ");
//          }
//          for (int j = 1; j <= i; j++) {
//             System.out.print("*");
//          }
//          System.out.println();
//       }

//    }
// }

// Solid Rhombus
// public class pattern {
//    public static void main(String arg[]) {
//       Scanner scan = new Scanner(System.in);
//       int n = scan.nextInt();

//       for (int i = 1; i <= n; i++) {
//          // spaces
//          for (int j = 1; j <= n - i; j++) {
//             System.out.print(" ");
//          }
//          // stars
//          for (int j = 1; j <= n; j++) {
//             System.out.print("*");
//          }
//          System.err.println();
//       }
//    }
// }

// Number pyramid
// public class pattern {
//    public static void main(String args[]) {
//       Scanner scan = new Scanner(System.in);
//       int n = scan.nextInt();
//       for (int i = 1; i <= n; i++) {
//          for (int j = 1; j <= n - i; j++) {
//             System.out.print(" ");
//          }
//          // For the numbers ->print row no, row no times
//          for (int j = 1; j <= i; j++) {
//             System.out.print(i + " ");
//          }
//          System.err.println();
//       }
//    }
// }

//Palindromic number pattern
// public class pattern {
//    public static void main(String args[]) {
//       Scanner scan = new Scanner(System.in);
//       int n = scan.nextInt();
//       for (int i = 1; i <= n; i++) {
//          //space
//          for (int j = 1; j <= n - i; j++) {
//             System.out.print(" ");
//          }
//          // 1st half number
//          for (int j = i; j >= 1; j--) {
//             System.out.print(j);
//          } 
//          //2nd half number
//          for(int j=2;j<=i;j++){
//             System.out.print(j);
//          }
//          System.out.println();

//       }
//    }
// }

//Diamond pattern
// public class pattern {
//    public static void main(String args[]) {
//       Scanner scan = new Scanner(System.in);
//       int n = scan.nextInt();
//       for (int i = 1; i <= n; i++) {
//          for (int j = 1; j <= n - i; j++) {
//             System.out.print(" ");
//          }
//          for(int j=1;j<=2*i-1;j++){
//             System.out.print("*");
//          }
//          System.out.println();
//       }
//       //Lower half
//       for (int i = n; i >=1; i--) {
//          for (int j = 1; j <= n - i; j++) {
//             System.out.print(" ");
//          }
//          for(int j=1;j<=2*i-1;j++){
//             System.out.print("*");
//          }
//          System.out.println();
//       }

//    }
// }

