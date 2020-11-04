package sk.kosickaakademia.daniel.martinek.novyprojekt.school.pets;

import java.util.Date;

public class Dog implements Animal {
    private String name;
    private String rasa;
    private Date dob;

    // konštruktor s dvoma parametrami
    public Dog(String name, String rasa) {
        this.name = name;
        this.rasa = rasa;
    }
}