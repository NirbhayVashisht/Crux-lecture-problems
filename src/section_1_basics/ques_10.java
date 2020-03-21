package section_1_basics;

import java.util.Scanner;

public class ques_10 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int nst, nsp, cst, csp;
        nst = n;
        nsp = 0;
        while (nst>=1){
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

            System.out.println();
            nst--;
            nsp++;
        }
    }
}
