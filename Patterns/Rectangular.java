package Patterns;

import java.util.Scanner;

public class Rectangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows: ");
        int r = sc.nextInt();

        System.out.print("Enter Number of Columns: ");
        int c = sc.nextInt();

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
