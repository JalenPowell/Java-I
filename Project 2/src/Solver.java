import java.util.Scanner;

/**
 * This program will solve for a result
 * after reading the inputs for x, y, and z.
 *
 * @author Jalen Powell
 * @version 12/31/2022
 */
public class Solver {

    /**
     * The main method will initialize the values
     * of x, y, and z
     * @param args Command lines were not used
     */
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        double x = 0;
        double y = 0;
        double z = 0;
        double result = 0;

        //Prints out the formula
        System.out.println("The result is (10x + 4.1)" +
                "(5y + 8.7)/ z");

        //Prompts user to input x, y, and z values
        System.out.print("\t Enter value for x: ");
        x = userInput.nextDouble();

        System.out.print("\t Enter value for y: ");
        y = userInput.nextDouble();

        System.out.print("\t Enter value for z: ");
        z = userInput.nextDouble();

        //Prints out results
        if (z == 0)
        {
            System.out.println("The result is 0.0.");
        }
        else
        {
            result = (10 * x + 4.1) * (5 * y + 8.7)
            / z;

            System.out.println("The result is " + result);
        }
    }
}
