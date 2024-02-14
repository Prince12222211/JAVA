
/*Opertors are the help to take operation between two operands like adding multiplication, etc.
 * 1.Arithmatic Operator:its the two types Binary and unary 
 * =>Binary:(Add(+),sub(-),Mul(*),Divid(/),modulo(%)).
 * =>Unary:Increment(++),Decrement(--), In Increment=Pre increment(++a=First step to chnage value then use value),Post incrememnt(a++:First use value then chgange the value).
 * Relational Operators:==,!=,>,<,>=,<=.
 * Logical operator:&&(ANd),||(OR),!(not)
 * Bitwise Operator:&(Binary add),|(Binary Or),^(Binary XOR),~(Binary One's Compliment),<<(Binary left shift),>>(Bianry right shift).
 * &:means bitwise and &&:n means Logical and
 * Assignment Operator:+,+=,-=,*=,/=.
 */

/*
 * #Bit Manipulation:
 1.get
 2.set
 3.clear
 4.update


 */
import java.util.*;

public class Operators {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // int n = 5;
        // int pos = 1;
        // int bitMask = 1 << pos; // get bit

        // int newNumber = bitMask | n; // Set Bit
        // System.out.println(newNumber);
        /* In the clear bit we use the operation is the AND with NOt */
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1 << pos;
        // int notBitMask = ~(bitMask);
        // int newNumber = notBitMask & n;
        // System.out.println(newNumber); // Clear bit
        int oper = scan.nextInt();
        // oper=1:set oper=0;clear
        int n = 5; // 0101
        int pos = 1;
        int bitMask = 1 << pos;
        if (oper == 1) {
            // set
            int newNumber = bitMask | n;
            System.out.println(newNumber);

        } else {
            // clear

            int newBitmask = ~(bitMask);
            int newNumber = newBitmask & n;
            System.out.println(newNumber);
        }
    }

}
