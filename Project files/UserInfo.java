/**
 *This program displays the user's info.
 *
 *@author Jalen Powell
 *@version 9/16/19
 */
public class UserInfo {
   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   
   // constructer
   private static final int OFFLINE = 0, ONLINE = 1; 
   /**
     *This method will enable the user's info to show.
     *@param firstNameIn for first name
     *@param lastNameIn for last name    
     */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;      
   }
   
   // methods
   /**
    *This will turn the string into a string.
    *@return output
    */     
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;            
   }
   //sets the location.
   /**
    *sets the location to locationIn.
    *@param locationIn for the location
    */
   public void setLocation(String locationIn) {
      location =  locationIn;
   }
   //sets the age.
   /**
    *sets  boolean for the age.
    *@param ageIn for the age 
    *@return isSet
    */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   //gets age.
   /**
    *gets the age.
    *@return age
    */
   public int getAge() {
      return age;
   }
   //gets location.
   /**
    *gets the location.
    *@return location
    */
   public String getLocation() {
      return location;
   }
   //views logoff
   /**
    *determines if user logOff.
    */
   public void logOff() {
      status = OFFLINE;
   }
   //views logon
   /**
    *determines if user logOn.
    */
   public void logOn() {
      status = ONLINE;
   }
}
