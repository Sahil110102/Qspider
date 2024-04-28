
public class Student {

    public static char[] id;
    static int rollNo;
    String name;
    private double percentage;  // Not private for easier access in this example
  
    public  Student(int rollNo, String name) {
      this.rollNo = rollNo;
      this.name = name;
      // Consider adding validation for percentage in the constructor if needed
    }
  
    public void setPercentage(double percentage) {
      if (percentage >= 0 && percentage <= 100) {
        this.percentage = percentage;
      } else {
        System.out.println("Invalid percentage. Please enter a value between 0 and 100.");
      }
    }
  
    public double getPercentage() {
      return percentage;
    }
  
    // @Override
    // public String toString() {
    //   return "Student: Roll No - " + rollNo + ", Name - " + name + " (Percentage: " + percentage + "%)";
    // }
  }