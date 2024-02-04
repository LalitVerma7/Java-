package Patterns;

import java.util.Scanner;

public class NumericalPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Rows: ");
        int r = sc.nextInt();

        for(int i = 1; i <= r; i++){
            for(int j = r - i; j >= 1; j--){
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(k + " ");
            }
            for(int l = i - 1; l >= 1; l--){
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
