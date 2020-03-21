/* pattern
 ***
 **
 *
 */
package section_1_basics;

import java.util.Scanner;

public class ques_8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int nst, cst;
        nst = n;
        while (nst >= 1) {
            cst = 1;
            while (cst<=nst){
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            nst--;
        }
    }
}
