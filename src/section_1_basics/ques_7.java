/*
*
**
***
 */
package section_1_basics;

import java.util.Scanner;

public class ques_7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        int nst,ist;
        nst = 1;
        while (nst<=n){
            ist =1 ;
            while (ist<=nst){
                System.out.print("* ");
                ist++;
            }
            System.out.println();
            nst++;
        }
    }
}
