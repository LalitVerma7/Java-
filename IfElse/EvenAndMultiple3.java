package IfElse;

import java.util.Scanner;

public class EvenAndMultiple3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            if(num % 3 == 0){
                System.out.print(num + " is Even and Divisible by 3.");
            }else{
                System.out.print(num + " is Even but not Divisible by 3.");
            }
        }else{
            if(num % 3 == 0){
                System.out.print(num + " is Odd but Divisible by 3.");
            }else{
                System.out.print(num + " is Odd but not Divisible by 3.");
            }
        }
    }
}
