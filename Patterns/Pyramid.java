package Patterns;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows: ");
        int r = sc.nextInt();

        for(int i = 1; i <= r; i++){
            for(int j = r - i; j >= 1; j--){
                System.out.print("  ");
            }
            for(int j = 1; j <= 2*i - 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
