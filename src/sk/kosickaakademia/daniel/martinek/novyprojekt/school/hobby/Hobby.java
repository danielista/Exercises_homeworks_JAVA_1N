package sk.kosickaakademia.daniel.martinek.novyprojekt.school.hobby;

public abstract class Hobby {  //abstract ...neda sa vytvorit instancia new Hobby("Sleeping");
    private String name;

    public Hobby(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
