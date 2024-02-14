/*
 * recurssion Class 1
 * Prerequisites
 * ->iteration/loop
 * ->Function
 * Function that calls itself is called recurssion
 * ->recurssion store in the memory in the form of the stack
 */

import java.util.*;

// public class Recurssion {
// public static void printNumb(int n) {
// if (n == 6) {
// return;
// }
// System.out.println(n);
// printNumb(n+1);

// }

// public static void main(String args[]) {
// Scanner scan = new Scanner(System.in);
// int n = 1;
// printNumb(n);

// }

// }

// public class Recurssion {
// public static void printSum(int i, int n, int sum) {
// if (i == n) {
// sum += i;
// System.out.println(sum);
// return;
// }
// sum += i;
// printSum(i + 1, n, sum);
// System.out.println(i);

// }

// public static void main(String args[]) {
// Scanner scan = new Scanner(System.in);
// // int n = scan.nextInt();
// printSum(1, 5, 0);
// }
// }
// Factrial of this number
// public class Recurssion {
// public static int printFact(int n) {
// if (n == 1 || n == 0) {
// return 1;
// }
// int fact_nm1 = printFact(n - 1);
// int fact_n = n * fact_nm1;
// return fact_n;

// }

// public static void main(String args[]) {
// Scanner scan = new Scanner(System.in);
// System.out.print("Enter the number: ");
// int n = scan.nextInt();
// int ans = printFact(n);
// System.out.print("The factorial of the number is: ");
// System.out.println(ans);

// }
// }
// Fibonacci series
// public class Recurssion {
// public static void printFib(int a, int b, int n) {
// if (n == 0) {
// return;
// }
// int c = a + b;
// System.out.println(c);
// printFib(b, c, n - 1);
// }

// public static void main(String args[]) {
// Scanner scan = new Scanner(System.in);
// int n = scan.nextInt();

// int a = 0, b = 1;
// System.out.println(a);
// System.out.println(b);
// printFib(a, b, n - 2);

// }
// }

// Print the fibonacci sequence till nth term
// public class Recurssion {
// public static int stackHeight(int x, int n) {
// if (n == 0) { // base 1
// return 1;
// }
// if (x == 0) { // base 2
// return 0;
// }
// int a = stackHeight(x, n - 1);
// int b = x * a;
// return b;

// }

// public static void main(String args[]) {
// int x = 2, n = 5;
// int ans = stackHeight(x, n);
// System.out.println(ans);

// }
// }

// public class Recurssion {
// public static int calcPower(int x, int n){
// if(n==0){
// return 1;
// }
// if(x==0){
// return 0;
// }
// //if n is even
// if(n%2==0){
// return calcPower(x,n/2 )*calcPower(x, n/2);
// }
// else{ //n is odd
// return calcPower(x, n/2)*calcPower(x, n/2)*x;

// }

// }
// public static void main(String args[]){
// Scanner scan=new Scanner(System.in);
// int x=2, n=5;
// int ans=calcPower(x,n);
// System.out.println(ans);

// }
// }

//Reversse of the String:Time complexity of this is:O(n).
// public class Recurssion {

//     public static void printRev(String name, int idx) {
//         if (idx == 0) {
//             System.out.print(name.charAt(idx));
//             return;
//         }
//         System.out.print(name.charAt(idx) + " ");
//         printRev(name, idx - 1);
//     }

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         String name = scan.nextLine();
//         int idx = scan.nextInt();
//         System.out.print("The Reverse String is:");
//         printRev(name, idx - 1);

//     }
// }

//First the 1st and last occurane of an element in string
// public class Recurssion {
//     public static int first = -1;
//     public static int last = -1;

//     public static void findOccurance(String str, int idx, char element) {
//         if (idx == str.length()) {
//             System.out.println(first);
//             System.out.println(last);
//             return;

//         }
//         char currChar = str.charAt(idx);
//         if (currChar == element) {
//             if (first == -1) {
//                 first = idx;
//             } else {
//                 last = idx;
//             }
//         }
//         findOccurance(str, idx + 1, element);

//     }

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         String str = scan.nextLine();
//         findOccurance(str, 0, 'a');

//     }
// }
//check isSorted or not:Time complexity is O(n). 
// public class Recurssion {
//     public static boolean isSorted(int arr[], int idx) {
//         if (idx == arr.length - 1) {
//             return true;
//         }
//         if (arr[idx] < arr[idx + 1]) {
//             return isSorted(arr, idx + 1);

//         } else {
//             return false;
//         }

//     }

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n=scan.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=scan.nextInt();
//         }
//         System.out.println(isSorted(arr, 0));

//     }
// }

//Move all 'x' to the end of the string.:Time complexity of this is: O(n).
// public class Recurssion {
//     public static void moveAll(String str, int idx, int count, String newString) {
//         if (idx == str.length()) {
//             for (int i = 0; i < count; i++) {
//                 newString += 'x';
//             }
//             System.out.println(newString);
//             return;
//         }
//         char currChar = str.charAt(idx);

//         if (currChar == 'x') {
//             count++;
//             moveAll(str, idx + 1, count, newString);
//         } else {
//             newString += currChar;
//             moveAll(str, idx + 1, count, newString);
//         }

//     }

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         String str = "axbcxxd";
//         moveAll(str, 0, 0, "");

//     }
// }

//Remove duplicates in a string:Time Complexity isO(n).
// public class Recurssion {
//     public static boolean[] map = new boolean[26];

//     public static void checkDuplicate(String str, int idx, String newString) {
//         if (idx == str.length()) {
//             System.out.println(newString);
//             return;

//         }
//         char currChar = str.charAt(idx);
//         if (map[currChar - 'a']) {
//             checkDuplicate(str, idx + 1, newString);

//         } else {
//             newString += currChar;
//             map[currChar - 'a'] = true;
//             checkDuplicate(str, idx + 1, newString);
//         }

//     }

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         String str = "abbccda";

//         // checkDuplicate(str,0,"");
//         checkDuplicate(str, 0, "");

//     }
// }

//*****its a very important question....Print all the subsequences of a string:Time complexity is:O(2^n).
// public class Recurssion {
//     public static void subsequences(String str, int idx, String newString) {
//         if (idx == str.length()) {
//             System.out.println(newString);
//             return;
//         }

//         char currChar = str.charAt(idx);
//         // to be
//         subsequences(str, idx + 1, newString + currChar);
//         // or not to be
//         subsequences(str, idx + 1, newString);

//     }

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         String str = "aaa";
//         subsequences(str, 0, "");

//     }
// }

//Print all the unique subsequences of a string
// import java.util.HashSet;
// public class Recurssion {
//     public static void subsequences(String str, int idx, String newString,HashSet<String>set) {
//         if (idx == str.length()) {
//            if(set.contains(newString)){
//             return;
//            }
//            else{
//             System.out.println(newString);
//             set.add(newString);
//             return;
//            }
//         }

//         char currChar = str.charAt(idx);
//         // to be
//         subsequences(str, idx + 1, newString + currChar,set);
//         // or not to be
//         subsequences(str, idx + 1, newString,set);

//     }

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         String str = "aaa";
//         HashSet<String> set=new HashSet<>();
//         subsequences(str, 0, "",set);

//     }
// }

//Print keypad combination Time complexity is:O(4^n).
// public class Recurssion {
//     public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

//     public static void printComb(String str, int idx, String combination) {
//         if(idx==str.length()){
//             System.out.println(combination);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         String mapping = keypad[currChar - '0'];
//         for (int i = 0; i < mapping.length(); i++) {
//             printComb(str, idx + 1, combination + mapping.charAt(i));
//         }

//     }

//     public static void main(String args[]) {
// String str="23";
// printComb(str, 0, "");

//     }
// }

//Recurssion in advanced
//print all permutation of a string
// public class Recurssion {
//     public static void printPermutation(String str, String permutation) {
//         if (str.length() == 0) {
//             System.out.println("The permutation of the string is: "+permutation+" ");
//             return;
//         }
//         for (int i = 0; i < str.length(); i++) {
//             char currChar = str.charAt(i);
//             // "abc"->ab
//             String newStr = str.substring(0, i) + str.substring(i + 1);
//             // System.out.print("The permutation of the string is: ");
//             printPermutation(newStr, permutation + currChar);
//             // System.out.println();

//         }

//     }

//     public static void main(String args[]) {
//         Scanner scan=new Scanner(System.in);
//         String str=scan.nextLine();
//         printPermutation(str, "");
//     }
// }

//count total paths in a maze to move form (0,0) to (n,m)
// public class Recurssion {
//     public static int countPAth(int i, int j, int n, int m) {
//         if (i == n || j == m) {
//             return 0;
//         }
//         if (i == n - 1 && j == m - 1) {
//             return 1;
//         }
//         // move downwards
//         int downPath = countPAth(i + 1, j, n, m);
//         // move right
//         int rightPaths = countPAth(i, j + 1, n, m);
//         return downPath + rightPaths;
//     }

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int m = scan.nextInt();
//         int total = countPAth(0, 0, n, m);
//         System.out.println(total);
//     }
// }

//place tiles of size 1*m in a floor of size nxm
// public class Recurssion {
//     public static int placeTiles(int n, int m) {
//         if (n == m) {
//             return 2;
//         }
//         if (n < m) {
//             return 1;
//         }

//         // vertically
//         int vertPlacement = placeTiles(n - m, m);
//         // horizontally
//         int horPlacement = placeTiles(n - 1, m);
//         return vertPlacement + horPlacement;

//     }

//     public static void main(String args[]) {

//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int m = scan.nextInt();
//         System.out.println(placeTiles(n, m));

//     }
// }

//find the number of ways in which you can invite n people to jyour party, single or in pairs
//n=4

// public class Recurssion {
//     public static int callGuest(int n) {
//         if (n <= 1) {
//             return 1;
//         }
//         // single
//         int ways1 = callGuest(n - 1);
//         // pairs
//         int ways2 = (n - 1) * callGuest(n - 2);
//         return ways1 + ways2;

//     }

//     public static void main(String arga[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int ans = callGuest(n);
//         System.out.println(ans);

//     }
// }

//print all the subset of a set of first n natural number:Time Complexity is:O(n)

public class Recurssion {
    public static void  printSubsets( ArrayList<Integer> subset) {
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubsets(int n, ArrayList<Integer> subset) {
       
        if (n == 0) {
            printSubsets(subset);
            return;
        }
        // add hoga
        subset.add(n);
        findSubsets(n - 1, subset);
        // add nii hoga
        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);

    }
}