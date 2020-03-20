//print fibonacci series upto n terms
package section_1_basics;

import java.util.Scanner;

public class ques_3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        printFib(n);

    }

    public static void printFib(int n){
        int a = 0;
        int b = 1;
        int c = 0;
        int i = 1;
        while (i<=n){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
            i++;
        }
    }
}
