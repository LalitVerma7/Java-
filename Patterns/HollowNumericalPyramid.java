package Patterns;

import java.util.Scanner;

public class HollowNumericalPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Rows: ");
        int r = sc.nextInt();

        for(int i = 1; i <= r; i++){
            for(int j = r - i; j >= 1; j--){
                System.out.print("  ");
            }
            for(int k = 1; k <= 2*i - 1; k++){
                if(k == 1 || k == 2*i - 1 || i == r){
                    System.out.print(i + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
