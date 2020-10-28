package sk.kosickaakademia.daniel.martinek.novyprojekt.school;

public class Main {
    public static void main(String[] args) {
        Grades gradeS1 = new Grades(3,2,1);
        Student s1 = new Student("Marek","Ščurka",gradeS1,ClassName.N1);
       // zistiť ako vytvoriť dátum 17.1.1995


        Student s2 = new Student("Vilo","Vozár",null, ClassName.N2);

    }
}
