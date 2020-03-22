/*
 *    *
 **  **
 ******
 */
package section_1_basics;

import java.util.Scanner;

public class ques_15 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int nst, nsp, cst, csp;
        nst = 1;
        nsp = n + 1;
        while (n >= 1) {
            if (n==1){
                cst=2;
            }
            cst = 1;
            while (cst<=nst){
                System.out.print("*");
                cst++;
            }

            csp = 1;
            while (csp<=nsp){
                System.out.print(" ");
                csp++;
            }

            cst = 1;
            while (cst<=nst){
                System.out.print("*");
                cst++;
            }

            System.out.println();
            nst++;
            nsp-=2;
            n--;
        }
    }
}
