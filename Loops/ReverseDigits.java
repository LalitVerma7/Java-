package Loops;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        int rev = 0, orginalNum = num;
        while (num != 0) {
            rev = rev*10 + num % 10;
            num /= 10;
        }
        System.out.print("Reverse of " + orginalNum + ": " + rev);
    }
}
