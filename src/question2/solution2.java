/* split decimal value into integer and decimal part */

package question2;

import java.util.Scanner;
import  java.lang.Math;

public class solution2 {
    public static void main(String[] args) {

        Double n;
        double x,y;
        Scanner scan=new Scanner(System.in);
        n=scan.nextDouble();
        x=Math.floor(n);
        y=n-x;
        System.out.println(x+" Rupees "+"and "+y+" paisa");
    }

}
