/*
 *** ***
 **   **
 *     *
 **   **
 *** ***
*/
package section_1_basics;

import java.util.Scanner;

public class ques_12 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int nst, cst, row, nr, nsp, csp;
        nst = n;
        nr = 2 * n - 1;
        row = 1;
        nsp=1;
        while (row<=nr){
            cst=1;
            while (cst<=nst){
                System.out.print("*");
                cst++;
            }
            csp=1;
            while (csp<=nsp){
                System.out.print(" ");
                csp++;
            }
            cst=1;
            while (cst<=nst){
                System.out.print("*");
                cst++;
            }
            if (row<=nr/2){
                nst--;
                nsp+=2;
            }else{
                nst++;
                nsp-=2;
            }
            System.out.println();
            row++;

        }
    }
}
