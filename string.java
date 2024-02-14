import java.util.*;
//String is immutable in java

// public class string {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         String firstName="Tony";
//         String lastName="Stark";
//         String fullName=firstName+" "+lastName; //concatation=adding of the two string
//         System.out.println(fullName);
//         System.out.println(fullName.length()); //For the length of the string
//         //charAt
//         for(int i=0;i<fullName.length();i++){
//             System.out.println(fullName.charAt(i));
//         }

//     }

// }

//comparison of the two string
// public class string {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);

//         String name1 = "Tony";
//         String name2 = "Stark";

//         // 1 s1>s2: +ve value
//         // 1 s1==s2: 0
//         // 1 s1<s2: -ve value

//         if (name1.compareTo(name2) == 0) {
//             System.out.println("String are equal;");

//         } else {
//             System.out.println("String are not equal");
//         }
//     }
// }

// public class string {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         String sentence="My name is Tony";
//         //substring(beg index, end index)
//         String name=sentence.substring(11,sentence.length());
//         System.out.println(name);
//     }
// }

//String Builder
// public class string {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         StringBuilder sb = new StringBuilder("Tony");
//         System.out.println(sb);
//         // set char at index 0
//         // System.out.println(sb.charAt(0));
//         // set char at index 0
//         // sb.setCharAt(0, 'p'); //Replace the char value
//         // System.out.println(sb);
//         sb.insert(0, 'S');// for adding the character
//         System.err.println(sb);
//         sb.delete(0, 1);
//         System.out.println(sb); // sTony=Tony
//         sb.delete(2, 3);
//         System.out.println(sb);

//         StringBuilder string = new StringBuilder("h");
//         string.append("e"); // append function
//         string.append("l"); // append function
//         string.append("l"); // append function
//         string.append("o"); // append function
//         System.out.println(string);
//         System.out.println(string.length());

//     }
// }

//Reverse String
public class string {
    public static void main(String args[]) {
        // Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("prince");
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);


        }
        System.out.println(sb);

    }
}