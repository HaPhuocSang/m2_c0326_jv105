package case_study.entity;

import case_study.entity.enums.EducationLevel;
import case_study.entity.enums.Gender;
import case_study.entity.enums.Position;

public class Employee extends Person{
    private EducationLevel educationLevel;
    private Position position;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String fullName, String birthday, Gender gender, String identityCard, String phoneNumber, String email, EducationLevel educationLevel, Position position, double salary) {
        super(id, fullName, birthday, gender, identityCard, phoneNumber, email);
        this.educationLevel = educationLevel;
        this.position = position;
        this.salary = salary;
    }

    public EducationLevel getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(EducationLevel educationLevel) {
        this.educationLevel = educationLevel;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() + "educationLevel=" + educationLevel + ", position=" + position + ", salary=" + salary + '}';
    }
}
