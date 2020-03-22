/*
 *
 ***
 *****
 ***
 *
 */
package section_1_basics;

import java.util.Scanner;

public class ques_13 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter an odd number >= 3 : ");
        int n = obj.nextInt();
        if (n % 2 == 0) {
            System.out.println("Are you a moron ?");
            System.exit(0);
        }

        int nsp, nst, row, csp, cst;
        nsp = n / 2;
        nst = 1;
        row = 1;
        while (row<=n){
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

            if (row<=n/2){
                nst+=2;
                nsp--;
            }else{
                nst-=2;
                nsp++;
            }
            System.out.println();
            row++;
        }

    }
}
