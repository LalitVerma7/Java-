package Loops;

import java.util.Scanner;

public class PrintNumbersExceptMultipleOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number upto Print: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            if(i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}   
