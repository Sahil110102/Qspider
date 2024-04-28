public class encapsulation {
  
    public static void main(String[] args) {
      Student student1 = new Student(1, "Alice");
      student1.setPercentage(85.5);
  
      Student student2 = new Student(2, "Bob");
      student2.setPercentage(92.0);
  
      System.out.println(student1.rollNo);
      System.out.println(student1.name);
      System.out.println(student1.getPercentage());
      
      System.out.println(student2.rollNo);
      System.out.println(student2.name);
      System.out.println(student2.getPercentage());
    }
  }
  