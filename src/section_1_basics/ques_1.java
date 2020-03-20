//Find the sum of first n natural numbers

package section_1_basics;

import java.util.Scanner;

public class ques_1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println("sum = "+sum(n));

        //formula for sum of n natural numbers sum = n(n+1)/2

        System.out.println("sum = "+(n*(n+1))/2);
    }

    public static int sum(int n){
        int sum = 0;
        for(int i=1; i<n+1;i++){
            sum = sum+i;
        }
        return sum;
    }
}
