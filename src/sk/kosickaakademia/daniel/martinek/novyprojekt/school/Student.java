package sk.kosickaakademia.daniel.martinek.novyprojekt.school;


import java.util.Date;

public class Student {
    // vlastnosti / properties:
    private String firstName;
    private String lastName;
    private ClassName className; // N1 N2 N3
    private int salary;
    private Date dob;
    private Grades grades;  // Grades ...trieda - data typ , grades ...variable/premenna

    // metody
    public Student(String fname, String lastName, Grades grades, ClassName className ){
        firstName=fname;
        this.lastName=lastName;
        this.grades=grades;
        this.className=className;
    }

    public Student(String fname, String lastName, Grades grades, ClassName className, Date dob ){
        this(fname,lastName,grades,className); // zavolam dalsi kontruktor
        this.dob=dob;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ClassName getClassName() {
        return className;
    }

    public int getSalary() {
        return salary;
    }

    public Date getDob() {
        return dob;
    }

    public Grades getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName;
    }
}