// Given 2 numbers n1 and n2, find the HCF/GCD
package section_1_basics;

import java.util.Scanner;

public class ques_4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n1 = obj.nextInt();
        int n2 = obj.nextInt();
        GCD(n1,n2);
    }

    public static void GCD(int a, int b) {
        int rem, dev, div;
        div = Math.max(a, b);
        dev = Math.min(a, b);
        rem = 1;
        while (rem != 0) {
            rem = div % dev;
            div = dev;
            dev = rem;
        }
        System.out.printf("GCD of %d and %d is %d", a, b, div);
    }
}
