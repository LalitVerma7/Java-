package Patterns;

import java.util.Scanner;

public class NumericalTriangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Rows: ");
        int r = sc.nextInt();
        
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
