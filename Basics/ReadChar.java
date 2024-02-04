package Basics;

import java.util.Scanner;

public class ReadChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        char ch = sc.next().charAt(0);
        System.out.println("First Character: " + ch);
    } 
}
