package HW2;

public class Student {

  private int id;
  private String name;
  private double grade;
    
  public Student() {
  }

  // Contructor
  public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

  @Override
  public String toString() {
    return "Student{" +
           "id=" + id +
           ", name='" + name + '\'' +
           ", grade=" + grade +
           '}';
    }


}
