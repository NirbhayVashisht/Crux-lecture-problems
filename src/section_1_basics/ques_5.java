//Find the reverse of a number
package section_1_basics;

import java.util.Scanner;

public class ques_5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        reverse(n);
    }

    public static void reverse(int n){
        int rev = 0;
        int orginalNumber = n;
        int num ;
        while (n>0){
            num = n % 10 ;
            rev = (rev*10)+num;
            n/=10;
        }
        System.out.println("Reverse of "+ orginalNumber + " is " + rev);
    }
}
