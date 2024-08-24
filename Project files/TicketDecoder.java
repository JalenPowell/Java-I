import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
  *This thing gonna decode tickets.
  *
  *@author Jalen Powell
  *@version 9/13/2019
  */
public class TicketDecoder {
 /**
   *This otther doing the same as the first thing.
   *
   *@param args Command Lines arguments (not used)
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
   
      String ticketCode;
      String price, discount, time, date, section, row, seat, game;
   
      System.out.print("Enter your ticket code: ");
      ticketCode = userInput.nextLine();
      System.out.println();
      ticketCode = ticketCode.trim();
   
      if  (ticketCode.length()  <= 26) {
         System.out.println("Invalid Ticket Code.");
         System.out.println("Ticket code must have at least 26 characters.");
      }
      else {
         game = ticketCode.substring(25);
         System.out.print("Game: " + game);            
         date = ticketCode.substring(11, 13);
         System.out.print("   Date: " + date + "/");
         date = ticketCode.substring(13, 15);
         System.out.print(date + "/");
         date = ticketCode.substring(15, 19);
         System.out.print(date);             
         time = ticketCode.substring(7, 9);
         System.out.print("   Time: " + time + ":");
         time = ticketCode.substring(9, 11);
         System.out.print(time);   
         section = ticketCode.substring(19, 21);
         System.out.print("\nSection: " + section);
         row = ticketCode.substring(21, 23);
         System.out.print("   Row: " + row);
         seat = ticketCode.substring(23, 25);
         System.out.print("   Seat: " + seat);
                                 
         DecimalFormat dfPrice = new DecimalFormat("$#,##0.00");
         price = ticketCode.substring(0, 5);
         double price2 = Double.parseDouble(price);
         price2 = price2 / 100;
         System.out.print("\nPrice: " + dfPrice.format(price2));
         
         DecimalFormat dfDiscount = new DecimalFormat("0%");
         discount = ticketCode.substring(5, 6);
         double discount2 = Double.parseDouble(discount);
         discount2 = discount2 / 10;
         System.out.print("   Discount: " + dfDiscount.format(discount2));
         
         DecimalFormat dfCost = new DecimalFormat("$#,##0.00");
         double cost = price2 - (price2 * discount2);
         System.out.print("   Cost: "  +  dfCost.format(cost));
         DecimalFormat dfPrizeNumber = new DecimalFormat("0000000");
         Random generator = new Random();
         int prize = generator.nextInt(9999999 + 1); 
         System.out.print("\nPrize Number: " + dfPrizeNumber.format(prize));
         
      
      
      }
   
   
   
   }
}