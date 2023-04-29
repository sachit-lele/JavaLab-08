import java.util.InputMismatchException;
import java.util.Scanner;
//Here we import the necessary libraries

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 15: ");
        try {
            int num = sc.nextInt();
            int factorial = calculateFactorial(num);
            System.out.println("factorial of "+num+" is "+ factorial);
        } catch (InputMismatchException e) {
            System.out.println("Input must be an integer.");
        } catch (FactorialException e) {
            System.out.println(e.getMessage());
            //Here we complete the try catch method for the custom exception
        }
        sc.close();
    }
    public static int calculateFactorial(int num) throws FactorialException {
        if (num < 0 || num > 15) {
            throw new FactorialException("Input must be between 0 and 15.");

        }
        //Here we actually calculate the factorial
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
class FactorialException extends Exception {
    //Constructor for the exception
    public FactorialException(String message) {
        super(message);
    }
}
