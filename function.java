import java.util.*;

// public class function {
//     public static int calculateMul(int a, int b) {
//         int mul = a * b;
//         return mul;
//     }

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int a = scan.nextInt();
//         int b = scan.nextInt();
//         int sum = calculateMul(a, b);
//         System.out.println("The mul of the two number is " + sum);
//     }

// }

public class function {
    public static void printFact(int n) {
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
         printFact(n);
        // System.err.println("The factorial of the number is: " + m);

    }
}
/*
 * => void function name means no anytype return like null main function
 * =>returnType functionName(type arg1,type2 arg2){
 * =>upper case and lower case coitain function name is called camel case
 * }
 * =>what happens in memory for use the function:we use function because of the
 * stack organisation
 * 
 */
