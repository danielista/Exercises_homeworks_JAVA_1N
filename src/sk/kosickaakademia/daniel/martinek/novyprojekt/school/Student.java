package sk.kosickaakademia.daniel.martinek.novyprojekt.school;


import sk.kosickaakademia.daniel.martinek.novyprojekt.school.hobby.Book;
import sk.kosickaakademia.daniel.martinek.novyprojekt.school.hobby.Movie;
import sk.kosickaakademia.daniel.martinek.novyprojekt.school.hobby.Hobby;
import sk.kosickaakademia.daniel.martinek.novyprojekt.school.pets.Animal;

import java.util.Date;

public class Student {
    // vlastnosti / properties:
    private String firstName;
    private String lastName;
    private ClassName className; // N1 N2 N3
    private int salary;
    private Date dob;
    private Grades grades;  // Grades ...trieda - data typ , grades ...variable/premenna
    private Hobby[] hobbies;
    private int countHobbies;
    private Animal myAnimal;

    // metody
    public Student(String fname, String lastName, Grades grades, ClassName className ){
        firstName=fname;
        this.lastName=lastName;
        this.grades=grades;
        this.className=className;
        hobbies = new Hobby[5];
        countHobbies=0;
        myAnimal = null;
    }

    public Student(String fname, String lastName, Grades grades, ClassName className, Date dob ){
        this(fname,lastName,grades,className); // zavolam dalsi kontruktor
        this.dob=dob;
    }


    public void setMyAnimal(Animal animal) {
        this.myAnimal = animal;
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
        hobbies[countHobbies++] = newHobby;
    }

    public void printHobbies(){
        System.out.println("Student's hobby:");
        int len = hobbies.length;
        for(int i=0;i<countHobbies;i++) {
            System.out.println(hobbies[i].getName());
            if (hobbies[i] instanceof Book)
                System.out.println(((Book) hobbies[i]).getAuthor());
            if(hobbies[i] instanceof Movie)
                System.out.println(((Movie)hobbies[i]).getYear() );
        }
    }
}