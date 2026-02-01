# MDASCALCU
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();

        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            double ans = num1 / num2;
            System.out.println("COMPUTATION: " + num1 + " / " + num2);
            System.out.println("Result: " + ans);
        }
    }
}