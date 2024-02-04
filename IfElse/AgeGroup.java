package IfElse;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Age: ");
        int age = sc.nextInt();

        if(age <= 12){
            System.out.print("Child");
        }else if(age <= 18){
            System.out.print("Teenager");
        }else{
            System.out.print("Adult");
        }
    }
}
