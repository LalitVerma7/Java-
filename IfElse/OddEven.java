package IfElse;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.print(num + " is a Even Number.");
        }else{
            System.out.print(num + " is a Odd Number.");
        }
    }
}
