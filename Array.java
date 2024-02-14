import java.util.*;

// public class Array {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         // int marks []=new int[3];
//         // marks[0]=97;
//         // marks[1]=98;
//         // marks[2]=95;
//         // for(int i=0;i<3;i++){
//         // System.out.println(marks[i]);
//         // }
//         int size = scan.nextInt();
//         int num[] = new int[size];
//         //For input
//         for(int i=0;i<size;i++){
//             num[i]=scan.nextInt();
//         }
//         //output
//         for (int i = 0; i < size; i++) {
//             System.out.println(num[i]);
//         }
//     }
// }
/*
 * =>In java deafualt value of the dataypes are like int=0, float=0.0,
 * boolean=false string=" "
 * =>In c++ the default value is garbage value
 */

//Serching a element in the Array(Linear Search)
// public class Array {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int num[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             num[i] = scan.nextInt();

//         }
//         System.out.print("Enter the number for searching in the array");
//         int x = scan.nextInt();
//         for (int i = 0; i < n; i++) {
//             if (num[i] == x) {
//                 System.out.println("Element is found in the index " + i);
//             }

//         }
//         // System.out.println("Element is not found");
//     }
// }

//2D Arrays Linear Search
public class Array {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int num[][] = new int[n][m];
        for (int i = 0; i < n; i++) { // To control the rows
            for (int j = 0; j < m; j++) { // To control the columns
                num[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter a number to search in the array: ");
        int x = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (num[i][j] == x) {
                    System.out.println("The element is found in the Array ["+i+", "+j+"]");
                }
            }
        }
}
}