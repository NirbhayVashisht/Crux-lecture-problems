/*
  1
 222
33333
*/
package section_1_basics;

import java.util.Scanner;

public class ques_16 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int nst,cst,nsp,csp,num;
        nst=1;
        nsp=n-1;
        num=1;
        while (num<=n){
            csp=1;
            while (csp<=nsp){
                System.out.print(" ");
                csp++;
            }

            cst =1 ;
            while (cst<=nst){
                System.out.print(num);
                cst++;
            }

            System.out.println();
            nsp--;
            nst+=2;
            num++;
        }
    }
}
