package Basics;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principal: ");
        float prin = sc.nextFloat();

        System.out.print("Enter the Rate: ");
        float rate = sc.nextFloat();

        System.out.print("Enter the Time(in years): ");
        float time = sc.nextFloat();

        float si = prin*rate*time/100;

        System.out.println("Simple Intrest: " + si);
    }
}