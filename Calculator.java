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
            System.out.print("Enter your choice(1-5): ");
            int choice = sc.nextInt();
            if (choice == 5) {
            	System.out.println("Exiting program.");
               break;
            }
            System.out.print("Enter any two numbers: ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double result;
            switch (choice) {
                case 1:
                    result=num1+num2;
                    break;
                case 2:
                    result=num1-num2;
                    break;
                case 3:
                    result=num1*num2;
                    break;
                case 4:
//                    if (num2!=0) {
                        result=num1/num2;
//                    } else {
//                        System.out.println("Division by zero error /infinity.");
//                        continue;
//                    }
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }
            System.out.println("Result =  " +result);
            System.out.println("-----------------------------------------");
        }
        sc.close();
    }
}
