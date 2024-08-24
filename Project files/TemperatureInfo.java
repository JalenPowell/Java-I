import java.util.Scanner;
import java.util.ArrayList;
/**
  *This program does the thing.
  *Jalen Powell
  *10/7/19
  */
public class TemperatureInfo {
 /**
   *This also does the thing.
   *@param args Command Lines not used
   *
   */
   public static void main(String[] args) {
      String tempInput = "";
      ArrayList<Integer> tempList = new ArrayList<Integer>();
      Scanner userInput = new Scanner(System.in);
      
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         
         if (!tempInput.equals("")) {
            tempList.add(Integer.parseInt(tempInput));
         }
         
      } while (!tempInput.equals(""));
      Temperatures temp = new Temperatures(tempList);
      char choice = 'E';
      
      do {
         System.out.print("Enter choice - [L]ow temp, [H]igh temp,"
                  + "  [P]rint, [E]nds: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
         
            case 'L':
               System.out.println("\tLow is " + temp.getLowTemp());
               break;
               
            case 'H':
               System.out.println("\tHigh is " + temp.getHighTemp());
               break;
               
            case 'P':
               System.out.println(temp);
               break;
               
            case 'E':
               System.out.println("\tDone");
               break;
               
            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
   }
}