/* Write a program in Java , to determine the sum of the following harmonic series for a given
value of n ; */


package question1;

import java.util.Scanner;

public class solution1 {
    public static void main(String[] args) {
        int n, i;
        Double s = 0.0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for (i = 1; i <= n; i++) {
            s = s +  1.0 / i;
        }
        System.out.println(s);
        scan.close();
    }
}
