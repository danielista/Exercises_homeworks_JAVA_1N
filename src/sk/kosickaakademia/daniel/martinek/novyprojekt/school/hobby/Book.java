package sk.kosickaakademia.daniel.martinek.novyprojekt.school.hobby;

public class Book extends Hobby{
    private String author;


    public Book(String name, String author) {
        super(name);  // volam rodicovsky konstruktor
        this.author=author;
    }

    public String getAuthor() {
        return author;
    }
}