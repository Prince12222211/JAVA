
/*=>Only one disk transferred in 1 step.
 * =>Smaller disks are always kept on top of larger disk.
 * Time complexity of this TOH is the O(2^n-1) apxO(2^n)
 * 
 */
import java.util.Scanner;

public class TOH {
    public static void TOH(int n, String src, String hlp, String dst) {
        if (n == 1) {
            // System.out.println("");
            System.out.println("Transfer disk " + n + " From " + src + " To " + dst);
            return;
        }
        TOH(n - 1, src, dst, hlp);
        System.out.println("Transfer disk " + n + " From " + src + " To " + dst);
        TOH(n - 1, hlp, src, dst);

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        TOH(n, "S", "H", "D");

    }
}
