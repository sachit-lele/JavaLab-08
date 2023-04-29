import java.util.Scanner;
//Here we import the necessary libraries
public class CountryMatcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a country name: ");
        //Here we ask the user for input

        try {
            String country = sc.nextLine();
            matchCountry(country);
            System.out.println("Input matched.");
        } catch (NoMatchException e) {
            System.out.println(e.getMessage());
        }
        //Here we complete the try catch method for the custom exception
    }
    public static void matchCountry(String country) throws NoMatchException {
        if (!country.equals("India")) {
            throw new NoMatchException("Input does not match expected value 'India'.");
            //Actually give the command to actually throw the exception
        }
    }
}
class NoMatchException extends Exception {
    //Constructor for the exception
    public NoMatchException(String message) {
        super(message);
    }
}
