import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter command (add, subtract, multiply, divide) : ");
        String command = input.nextLine();
        System.out.print("Enter first num: ");
        int num1 = input.nextInt();
        System.out.print("Enter second num: ");
        int num2 = input.nextInt();

        int result = 0;

        if (command.equals("add")) {
            result = num1 + num2;
        } else if (command.equals("subtract")) {
            result = num1 - num2;
        } else if (command.equals("multiply")) {
            result = num1 * num2;
        } else if (command.equals("divide")) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
        } else {
            System.out.println("Invalid command. Please enter add, subtract, multiply, or divide.");
            return;
        }

        System.out.println("Result: " + result);
    }
}