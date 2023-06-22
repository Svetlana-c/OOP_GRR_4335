package Model;

public class Student1 extends Person1  {
    public Student1(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
  
}
