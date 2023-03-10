import java.util.Scanner;

/**
 * This program will read the input and
 * print the amount as a combination of
 * miles, yards, feet, and inches
 *
 * @author Jalen Powell
 * @version 12/31/2022
 */
public class ImperialDistance {

    /**
     * The main method prompts the user
     * to input the inches for conversion
     * to other measurements.
     *
     * @param args Not Used
     */
    public static void main(String[] args){

        //Initializes the variables
        int inches = 0;
        int inchesIn = 0;
        int feet = 0;
        int yards = 0;
        int miles = 0;

        //Sets up the scanner
        Scanner userInput = new Scanner(System.in);

        //Prompts user to enter the amount of inches
        System.out.print("Enter the raw distance measure in inches: ");
        inchesIn = userInput.nextInt();

        //If Else to insure non-negative entries
        if (inchesIn < 0) {
            System.out.print("Measurement must be a non-negative!");
        }
        else {//Continues as normal

            //Conversions of the measurements
            miles = inchesIn / 63360;
            inches = inchesIn % 63360;
            yards = inches / 36;
            inches = inches % 36;
            feet = inches / 12;
            inches = inches % 12;

            //Prints out resulting statements
            System.out.println("\nMeasurement by combined miles, yards,"
            + " feet, inches: ");
            System.out.println("\tMiles: " + miles);
            System.out.println("\tYards: " + yards);
            System.out.println("\tFeet: " + feet);
            System.out.println("\tInches " + inches);
            System.out.println("\n" + inchesIn + " in = " + miles + " mi, "
            + yards + " yds, " + feet + " ft, " + inches + " in");
        }
    }
}
