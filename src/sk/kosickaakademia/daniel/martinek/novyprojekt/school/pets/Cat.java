package sk.kosickaakademia.daniel.martinek.novyprojekt.school.pets;

public class Cat implements Animal {
    public String name;
    public int cislo;

    // konštruktor s dvoma parametrami
    public Cat(String name, int cislo) {
        this.name = name;
        this.cislo = cislo;
    }
}
