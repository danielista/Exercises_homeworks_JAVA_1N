package sk.kosickaakademia.daniel.martinek.novyprojekt.school;

import sk.kosickaakademia.daniel.martinek.novyprojekt.school.hobby.Book;
import sk.kosickaakademia.daniel.martinek.novyprojekt.school.hobby.Sport;
import sk.kosickaakademia.daniel.martinek.novyprojekt.school.hobby.Movie;
import sk.kosickaakademia.daniel.martinek.novyprojekt.school.pets.Cat;
import sk.kosickaakademia.daniel.martinek.novyprojekt.school.pets.Dog;
import sk.kosickaakademia.daniel.martinek.novyprojekt.school.pets.Fish;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Main {
    public static void main(String[] args) {

        Student[] students ;
        students = initStudents();


        Book b1 = new Book("Hlava XXII","J. Heller");
        students[0].addHobby(b1);
        Sport s1=new Sport("Hockey");
        students[0].addHobby(s1);
        Book b2 = new Book("Marina","A. Sladkovic");
        students[0].addHobby(b2);

        Movie m1=new Movie("Aladin",2019);
        students[0].addHobby(m1);

        students[0].printHobbies();


        students[0].setStudentAnimal( new Dog("Rex","Nemecky ovciak") );
        students[0].setStudentAnimal( new Fish("Danielkaaaa","červenkastá") );
        students[0].setStudentAnimal( new Cat("sivko",3) );

        students[0].printStudentsAnimals();
    }



    private static void sortByAverage(Student[] students) {
        int len=students.length;
        for(int i = 0;i<=len-1;i++){
            for(int j=0; j< len-1-i;j++){
                if(students[j].getGrades().getAverage()>students[j+1].getGrades().getAverage()){
                    // ak podmienka plati, je potrebne vymenit A[j] <-> A[j+1]
                    Student temp = students[j];
                    students[j]=students[j+1];
                    students[j+1] = temp;

                }
            }
        }
    }

    private static void printStudentsWhereAverageLE2(Student[] students) {
        int i;
        int len=students.length;
        System.out.println("List of students - where AVG <=2 :");
        for(i=0;i<len;i++) {

            double avg = students[i].getGrades().getAverage();
            if(avg<=2)
                System.out.println("   "+students[i].getFirstName()+" "+students[i].getLastName() + " "+avg);
        }
    }

    private static void printN1Students(Student[] students) {
        int i;
        int len=students.length;
        System.out.println("List of students - 1N :");
        for(i=0;i<len;i++){
            if(students[i].getClassName()==ClassName.N1)
                System.out.println(students[i].toString());
            //System.out.println("   "+students[i].getFirstName()+" "+students[i].getLastName());
        }
        System.out.println();
    }

    private static void printAllStudents(Student[] students) {
        int i;
        int len=students.length;
        System.out.println("List of students - 1N :");
        for(i=0;i<len;i++){

            System.out.println(students[i].toString());
            //System.out.println("   "+students[i].getFirstName()+" "+students[i].getLastName());
        }
        System.out.println();
    }

    private static Student[] initStudents() {
        Student[] s= new Student[10];

        Grades z1 = new Grades(3, 2, 3);
        Student s1 = new Student("Ivana", "Hornyakova",
                z1, ClassName.N1, createDob("2003-11-04")  );
        s[0] = s1;

        Student s2 = new Student("Peter", "Baran",
                new Grades(1, 2, 1), ClassName.N2,createDob("2010-05-30"));
        s[1] = s2;

        Student s3 = new Student("Tomas", "Novak",
                new Grades(3, 2, 1), ClassName.N1, createDob("1997-06-18"));
        s[2] = s3;

        Student s4 = new Student("Marian", "Miezga",
                new Grades(2, 1, 1), ClassName.N3, createDob("1984-12-22"));
        s[3] = s4;

        Student s5 = new Student("Daniela", "Pekna", new Grades(1, 1, 1), ClassName.N1);
        s[4] = s5;

        Student s6 = new Student("David", "Andrejkovic", new Grades(3, 4, 4), ClassName.N2);
        s[5] = s6;

        Student s7 = new Student("Ema", "Majlatova", new Grades(1, 1, 3), ClassName.N2);
        s[6] = s7;

        Student s8 = new Student("Damian", "Kollar", new Grades(2, 2, 2), ClassName.N3);
        s[7] = s8;

        Student s9 = new Student("Leo", "Hornyak", new Grades(3, 1, 1), ClassName.N1);
        s[8] = s9;

        Student s10 = new Student("Filip", "Balaz", new Grades(3, 3, 4), ClassName.N1);
        s[9] = s10;

        // pole študentov
        return s;
    }

    private static  Date createDob(String dateS){
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(dateS);
        }catch(ParseException e){
            e.printStackTrace();
        }
        return null;
    }

    private static void printAge(Student[] students){
        /* Homework
           Jan Novak    18
           Filip Fedor  28
           option 1easy     2020-2005 = 15
                  2skills   dnes je 29.10.2020
                            28.10.2010 10 rokov
                            29.10.2010 10 rokov
                            30.10.2010 9 rokov
                            1.12.2010 9 rokov
         */
    }

}
