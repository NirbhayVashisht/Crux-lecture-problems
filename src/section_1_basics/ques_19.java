/*
1
2*2
3*3*3
4*4*4*4
*/
package section_1_basics;

import java.util.Scanner;

public class ques_19 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int nst,cst,num;
        nst=1;
        num=1;
        while (num<=n){
            cst=1;
            while (cst<=nst){
                if (cst%2==0){
                    System.out.print("*");
                }else {
                    System.out.print(num);
                }
                cst++;
            }

            System.out.println();
            nst+=2;
            num++;
        }
    }
}
