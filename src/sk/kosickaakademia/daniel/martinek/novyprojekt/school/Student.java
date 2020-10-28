package sk.kosickaakademia.daniel.martinek.novyprojekt.school;


import java.util.Date;

public class Student {
    // properties
    private String firstName;
    private String lastName;
    private ClassName className; // N1 N2 N3
    private int salary;
    private Date dob;
    private Grades grades; // Grades .. trieda - data typ , grades ...variable/premena

    // methods
    public Student(String firstName, String lastName, Grades grades, ClassName className ){
        this.firstName=firstName;
        this.lastName=lastName;
        this.grades=grades;
        this.className = className;
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

}
