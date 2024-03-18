import java.util.Scanner;

public class TemperatureClassifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature value in Celsius : ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("Freezing");
        } else if (num > 0 && num <= 15) {
            System.out.println("Cold");
        } else if (num >= 16 && num <= 25) {
            System.out.println("Mild");
        } else if (num >= 26 && num <= 35) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }
    }
}