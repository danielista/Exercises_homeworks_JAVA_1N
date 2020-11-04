package sk.kosickaakademia.daniel.martinek.novyprojekt.school;


import sk.kosickaakademia.daniel.martinek.novyprojekt.school.hobby.Book;
import sk.kosickaakademia.daniel.martinek.novyprojekt.school.hobby.Movie;
import sk.kosickaakademia.daniel.martinek.novyprojekt.school.hobby.Hobby;
import sk.kosickaakademia.daniel.martinek.novyprojekt.school.pets.Animal;
import sk.kosickaakademia.daniel.martinek.novyprojekt.school.pets.Dog;

import java.util.Date;

public class Student {
    // vlastnosti / properties:
    private String firstName;
    private String lastName;
    private ClassName className; // N1 N2 N3
    private int salary;
    private Date dob;
    private Grades grades;  // Grades ...trieda - data typ , grades ...variable/premenna
    private Hobby[] hobbies;  // pole hobby kde može byť len 5 najviac (pozri trochu nižšie)
    private int countHobbies;
    private Animal studentAnimal;


    // tuším že toto je konštruktor tiež
    public Student(String fname, String lastName, Grades grades, ClassName className ){
        firstName=fname;
        this.lastName=lastName;
        this.grades=grades;
        this.className=className;
        hobbies = new Hobby[5]; // max 5 hobby
        countHobbies=0;
        studentAnimal = null;
    }

    // a aj toto je konštruktor navyše s dátumovým parametrom ;)
    public Student(String fname, String lastName, Grades grades, ClassName className, Date dob ){
        this(fname,lastName,grades,className); // zavolam dalsi kontruktor
        this.dob=dob;
    }



    public void setStudentAnimal(Animal studentAnimal) {
        this.studentAnimal = studentAnimal;
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

    public Grades getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName+" "+getGrades().getAverage();
    }


    public void addHobby(Hobby newHobby){
        int len = hobbies.length;
        if(countHobbies==len){
            System.out.println("Chyba, nie je mozne pridat dalsie hobby");
            return;
        }
        // veľmi prakticky (efektívne a logicky) riešené pripočítavanie nových hobby do premenej
        hobbies[countHobbies++] = newHobby;
    }

    public void printHobbies(){
        System.out.println("Student's hobby:");

        for(int i=0;i<countHobbies;i++) {
            System.out.print(hobbies[i].getName() + " ");
            if (hobbies[i] instanceof Book)
                System.out.print(((Book) hobbies[i]).getAuthor() + " ");
            if(hobbies[i] instanceof Movie)
                System.out.print(((Movie)hobbies[i]).getYear() + " ");
        }
    }

    public void printStudentsAnimals() {
        System.out.println();
        System.out.println("Student 0's animals are: ");
        System.out.print( "k" );
    }
}