import java.util.Scanner;

/**
 * This activity will display someone's
 * name, age, and age-based statistics
 *
 * @author Jalen Powell
 * @version 12/30/2022
 */
public class AgeStatistics {

    /**
     * This will print out the prompts for
     * name, age, and gender.
     * @param args
     */
    public static void main(String[] args){
        String name;
        int ageInYears;
        int gender; //1 is for female
        double maxHeartRate;

        Scanner userInput = new Scanner(System.in);

        //Prompt the user to type in their name
        System.out.print("Enter your name: ");
        name = userInput.nextLine();

        //Prompt the user to type in their age
        System.out.print("Enter your age in years: ");
        ageInYears = userInput.nextInt();

        //Prompt user to type in their gender
        System.out.print("Enter your gender (1 for female " +
                "and 0 for male): ");
        gender = userInput.nextInt();

        //Convert age
        System.out.println("\t Your age in minutes is "
                + ageInYears * 525600 + " minutes.");
        System.out.println("\t Your age in centuries is "
                + (double) ageInYears / 100 + " centuries.");

        //Displays the heart rates
        System.out.print("Your heart rate is ");

        //Convert heart rates
        if (gender == 1)  { // Calculates the female M.H.R.
            maxHeartRate = 209 - (0.7 * ageInYears);
        }
        else { // Calculates the male M.H.R.
            maxHeartRate = 214 - (0.8 * ageInYears);

        }
        System.out.println(maxHeartRate + " beats per minute.");

    }

}
