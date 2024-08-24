public class UseeInfo {
   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   int age;
   int status;
   
   // constructer
   private static final int OFFLINE = 0, ONLINE = 1; 
   
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   
   }
   
   // methods
}