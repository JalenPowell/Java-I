import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * This program will compute a value
 * generated from a specific expression
 *
 * @author Jalen Powell
 * @version 1/2/2023
 */
public class ExpressionEvaluator {

    /**
     * The main method will
     *
     * @param args not used
     */
    public static void main(String[] args) {

        double x = 0;
        double result;
        double firstTerm;
        double secondTerm;
        double numer;
        double denom;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        x = userInput.nextDouble();

        firstTerm = (1.2 * Math.pow(x, 3) - (10 * x) +1);
        secondTerm = (5 * Math.pow(x, 4) - (7 * Math.pow(x, 3)) );
        



    }
}
