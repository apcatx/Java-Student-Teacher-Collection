public class Teacher {

  private String firstName;
  private String lastName;
  private int id;
  private int grade;

  Teacher(String firstName, String lastName, int id, int grade) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
    this.grade = grade;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getId() {
    return id;
  }

  public int getGrade() {
    return grade;
  }

  @Override
  public String toString() {
    return "Teacher{" +
            "firstName = '" + firstName + '\'' +
            ", lastName = '" + lastName + '\'' +
            ", id = " + id +
            ", grade = " + grade +
            '}';
  }
}