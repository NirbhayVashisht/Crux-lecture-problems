//Find if n is prime or not
// for efficient method https://www.geeksforgeeks.org/primality-test-set-2-fermet-method/?ref=rp
package section_1_basics;

import java.util.Scanner;

public class ques_2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        if (check(n)){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }

    public static boolean check(int n) {
        boolean flag = true;
        for(int i = 2 ; i<=n/2;i++){
            if (n%i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
