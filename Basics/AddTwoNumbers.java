import java.util.Scanner;

public class AddTwoNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the Second Number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        
        System.out.println("Sum: " + sum);
    }
}