import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            int choice = getValidChoice(sc);

            if (choice == 5) {
                System.out.println("Exiting program.");
                break;
            }

            System.out.print("Enter any two numbers:\n ");
            double num1 = getValidDouble(sc, "Enter the first number: ");
            double num2 = getValidDouble(sc, "Enter the second number: ");
            double result;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Division by zero error / infinity.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            System.out.println("Result = " + result);
            System.out.println("-----------------------------------------");
        }
        sc.close();
    }

    private static int getValidChoice(Scanner sc) {
        while (true) {
            try {
                int choice = sc.nextInt();
                if (choice >= 1 && choice <= 5) {
                    return choice;
                } else {
                    System.out.print("Invalid choice. Please enter a valid choice (1-5): ");
                }
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a valid choice (1-5): ");
                sc.nextLine(); 
            }
        }
    }

    private static double getValidDouble(Scanner sc, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
                sc.nextLine(); 
            }
        }
    }
}
