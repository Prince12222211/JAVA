// Bubble short
// import java.util.Scanner;

// public class sorting {
// // Bubble short, The time complexity of this short is=O(n^2), but its not the
// best timme complexity of the shorting
// //we can not take this shorting method in the compititon level

// public static void printArray(int arr[]) {
// System.out.print("The sorted array is: ");

// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }

// public static void main(String args[]) {

// Scanner scan = new Scanner(System.in);
// System.out.print("Enter the the size of the array: ");
// int n = scan.nextInt();
// int arr[] = new int[n];
// System.out.print("Enter the elements of the array is: ");

// for (int i = 0; i < n; i++) {
// arr[i] = scan.nextInt();
// }

// for (int i = 0; i < arr.length - 1; i++) {
// for (int j = 0; j < arr.length - i - 1; j++) {
// if (arr[j] > arr[j + 1]) {

// // swap
// int temp = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = temp;
// }
// }

// }
// printArray(arr);

// }
// }

//Selection short, time complexity of this shrting is O(n^2).
// public class sorting {
//     public static void printArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");

//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = scan.nextInt();

//         }
//         for (int i = 0; i < arr.length - 1; i++) {
//             int smallest = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[smallest] > arr[j]) {
//                     smallest = j;

//                 }
//             }
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i] = temp;
//         }
//         printArray(arr);
//     }
// }

//Insertion Short, the time complexity of this shorting is O(n^2)

import java.util.Scanner;

public class sorting {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && curr < arr[j]) {
                arr[j + 1] = arr[j];
                j--;

            }
            // placement
            arr[j + 1] = curr;
        }
        printArray(arr);
    }

}
