package Loops;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        int ch = 0;
        while(num != 0){
            num /= 10;
            ch++;
        }
        System.out.print("Number of Digits: " + ch);
    }
}
