// Series: 1-2+3-4+5...

package Loops;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number to be Sum: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum -= i;
            }else{
                sum += i;
            }
        }
        System.out.print("Answer: " + sum);
    }
}
