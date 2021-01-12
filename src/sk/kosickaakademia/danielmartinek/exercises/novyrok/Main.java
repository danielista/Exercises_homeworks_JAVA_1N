package sk.kosickaakademia.danielmartinek.exercises.novyrok;

public class Main {
    public static void main(String[] args) {
        PersonalID p = new PersonalID();
        System.out.println(p.checkId("000814/0011"));
        System.out.println(p.checkId("976231/1240"));
    }
}
