package sk.kosickaakademia.daniel.martinek.novyprojekt.school.pets;

public interface Animal {
    String name = null;


    public default String getName() {
        return name;
    }

}
