/*

 *
 **
 ***
 **
 *

 * */
package section_1_basics;

import java.util.Scanner;

public class ques_11 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int nst, cst, row, nr;
        nst = 1;
        nr = 2 * n - 1;
        row = 1;
        while (row<=nr){
            cst=1;
            while (cst<=nst){
                System.out.print("* ");
                cst++;
            }

            if (row<=nr/2){
                nst++;
            }else{
                nst--;
            }
            System.out.println();
            row++;

        }
    }
}
