/**
 *Customer program.
*@author Jalen Powell
*@version 10/27/19
 */
public class Customer implements Comparable<Customer> {
   private String name;
   private String location;
   private double balance;
   /**
    *Customer program.
    * @param nameIn used
    */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   /**
    *Gets the label.
    *@return returns name
    */
   public String getName() {
      return name;
   }
   /**
    *Sets the location.
    *@param locationIn takes location in
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**
    *Changes the balance.
    *@param amount takes balance in
    */
   public void changeBalance(double amount) {
      balance = amount;
   }
   /**
    *Get the location.
    * @return returns location
    */
   public String getLocation() {
      return location;
   }
   /**
    *Gets the balance.
    * @return returns the balance
    */
   public double getBalance() {
      return balance;
   }
   /**
    *Sets the location.
    * @param city takes city in
    * @param state takes state in
    */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   /**
    *Prints oyt the toString.
    * @return returns the toString 
    */
   public String toString() {
      return getName() + "\n" + getLocation() + "\n$" + getBalance();
   }
   /**
    * Compares to something.
    * @param obj takes in an object
    * @return returns if it is less, greater, or equal
    */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
         
      } else if (this.balance < obj.getBalance()) {
         return -1;
      } else {
         return 1;
      }
   }
}