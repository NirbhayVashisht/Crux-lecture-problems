/*
  1
 121
12321
 121
  1
*/
package section_1_basics;

import java.util.Scanner;

public class ques_20 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter an odd number >= 3 :");
        int n = obj.nextInt();
        if (n%2==0){
            System.out.println("You Moron");
        }
        int nsp, csp, nst, cst, row,num;
        row = 1;
        nst=1;
        nsp=n/2;
        while (row<=n){
            csp=1;
            while (csp<=nsp){
                System.out.print(" ");
                csp++;
            }

            num=1;
            cst=1;
            while (cst<=nst){
                System.out.print(num);
                if (cst<=nst/2){
                    num++;
                }else{
                    num--;
                }
                cst++;
            }

            System.out.println();
            if (row<=n/2){
                nsp--;
                nst+=2;
            }else {
                nsp++;
                nst-=2;
            }
            row++;
        }
    }
}
