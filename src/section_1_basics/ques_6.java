/*  pattern
* * *
* * *
* * *
 */

package section_1_basics;

import java.util.Scanner;

public class ques_6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        for(int i = 0 ; i<n;i++){
            for(int j = 0 ; j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
