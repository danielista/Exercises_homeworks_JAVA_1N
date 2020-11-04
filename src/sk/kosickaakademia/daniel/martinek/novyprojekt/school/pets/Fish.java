package sk.kosickaakademia.daniel.martinek.novyprojekt.school.pets;

public class Fish implements Animal {
    private String name;
    private String farba;

    // konštruktor s dvoma parametrami
    public Fish(String name, String farba){
        this.name = name;
        this.farba = farba;
    }
}