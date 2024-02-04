package Patterns;

import java.util.Scanner;

public class InverseTrigangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows: ");
        int r = sc.nextInt();

        for(int i = 1; i <= r; i++){
            for(int j = r - i + 1; j >= 1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
