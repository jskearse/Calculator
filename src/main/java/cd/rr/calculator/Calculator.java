package cd.rr.calculator;
import java.util.Scanner;

public class Calculator {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Welcome to the CLI Calculator");
            System.out.println("-----------------------------\n");
            System.out.println("Operations: \n");
            System.out.println("1: Addition\n2: Subtration\n3: Multiplication\n" +
                    "4: Division\n5: Exit\n");
            System.out.println("Choose your operation: ");
            int operations = scanner.nextInt();

            if (operations == 5) {
                continueProgram = false;
                System.out.println("Goodbye!");
            } else if (operations == 1) {
                addition();
            } else if (operations == 2) {
                int results = subtraction();
                System.out.println("Results: " + results);
            } else if (operations == 3) {
                multiplication();
            } else if (operations == 4) {
                division();
            } else {
                System.out.println("You have selected an incorrect option. Please select a number between 1 - 5.");
            }
        }

    }

    public static void addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Second Number: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("Result: " + sum + "\n");

    }

    public static int subtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Second Number: ");
        int secondNumber = scanner.nextInt();
        int difference = firstNumber - secondNumber;
        return difference;

    }

    public static void multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Second Number: ");
        int secondNumber = scanner.nextInt();
        int product = firstNumber * secondNumber;
        System.out.println("Result: " + product + "\n");

    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number: ");
        double firstNumber = scanner.nextInt();
        System.out.println("Second Number: ");
        double secondNumber = scanner.nextInt();
        if (secondNumber == 0) {
            System.out.println("Results:  Cannot divide by 0\n");
        } else if (secondNumber != 0) {
            double quotient = Math.round((firstNumber / secondNumber) * 100);
            quotient = quotient / 100;
            System.out.println("Result: " + quotient + "\n");

        }
    }
        public static void main (String[]args){
            menu();
        }

}