/**
  *This program calculates grades.
  *
  *@author Jalen Powell
  *@version 9/23/19
  */
public class Grade {
  /**
    *This also does the thing.
    *
    *@param args Command Lines not used
    */
   public static final int EXAM_1 = 1, EXAM_2 = 2, FINAL = 3;
   private double exam1, exam2, finalExam = 0;
   private double activityAvg = 0;
   private double quizAvg = 0;
   private double projectAvg = 0;
   private String studentName = "";
   /**
     *sets constant values.
     */
   private static final double EXAM_WEIGHT = 0.15,
                            FINAL_WEIGHT = 0.30, ACT_WEIGHT = 0.05,
                            QUIZ_WEIGHT = 0.10, PROJ_WEIGHT = 0.25;
                            
   /**
     *This sets the name.
     *@param studentNameIn used
     */
   public Grade(String studentNameIn) {
      studentName = studentNameIn;
   }
       /**
         *This sets the quiz and activity averages.
         *@param activityAvgIn used
         *@param quizAvgIn used
         */                     
   public void setLabAverages(double activityAvgIn, double quizAvgIn) {
      activityAvg = activityAvgIn;
      quizAvg = quizAvgIn;
   }
   /**
     *This sets the project average.
     *@param projectAvgIn used
     */
   public void setProjectAvg(double projectAvgIn) {
      projectAvg = projectAvgIn;
   }
   /**
     *This sets the exam scores.
     *@param examType used
     *@param examScoreIn used
     */
   public void setExamScore(int examType, double examScoreIn) {
      if (examType == EXAM_1) {
         exam1 = examScoreIn;
      }
      else if (examType == EXAM_2) {
         exam2 = examScoreIn;
      }
      else if (examType == FINAL) {
         finalExam = examScoreIn;
      }
   }
   /**
     *This calculates the grade.
     *@return grade 
     */
   public double calculateGrade() {
      double grade = exam1 * EXAM_WEIGHT + exam2 * EXAM_WEIGHT
            + finalExam * FINAL_WEIGHT
            + activityAvg * ACT_WEIGHT
            + quizAvg * QUIZ_WEIGHT
            + projectAvg * PROJ_WEIGHT;
   
      return grade;
   }
   /**
     *This will print out the output.
     *@return String
     */
   public String toString() {
      return "Name: " + studentName + "\n"
         + "Course Grade: " + calculateGrade();
   }
   
   
    
    
}