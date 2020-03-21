/*
 *
 **
 ***
 */
package section_1_basics;

import java.util.Scanner;

public class ques_9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int nst, nsp, cst, csp;
        nst = 1;
        nsp = n - 1;
        while (nst <= n) {
            csp = 1;
            while (csp<=nsp){
                System.out.print("  ");
                csp++;
            }

            cst = 1;
            while (cst<=nst){
                System.out.print("* ");
                cst++;
            }

            nst++;
            nsp--;
            System.out.println();
        }
    }
}
