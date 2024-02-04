package Loops;

import java.util.Scanner;

public class APowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("To Find a raise to power b.");

        System.out.print("Enter the Value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the Value of b: ");
        int b = sc.nextInt();

        int ans = 1, i = b;
        if(b > 0){
            for(;i > 0; i--){
                ans *= a;
            }
        }
        System.out.print(a + " raise to power " + b + ": " + ans);
    }
}
