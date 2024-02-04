package Loops;

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Natural Number where to be Sum: ");
        int num = sc.nextInt();

        int i = 1, sum = 0;
        while (i <= num) {
            sum += i;
            i++;
        }

        System.out.print("Sum of " + num + " Natural Number: " + sum);
    }
}
