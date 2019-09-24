/* convert temprature into Fahrenheit to Celsius  */

package question3;

import java.util.*;

public class solution3 {
    public static void main(String[] args) {
        Double f;
        Scanner scan=new Scanner(System.in);
        f=scan.nextDouble();
        Double c=(f-32)/1.8;
        System.out.println(c);
        scan.close();

    }

}
