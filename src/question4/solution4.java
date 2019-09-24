/* To print pattern */

package question4;

import java.util.Scanner;

public class solution4 {
    public static void main(String[] args) {
        int i,j;
        int n;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        scan.close();
    }


}
