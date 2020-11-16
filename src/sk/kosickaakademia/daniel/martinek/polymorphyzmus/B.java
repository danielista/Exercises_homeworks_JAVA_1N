package sk.kosickaakademia.daniel.martinek.polymorphyzmus;

public class B extends A implements I2 {

    public B(){
        System.out.println("I am constructor B()");
    }

    @Override  // Anotacia - prekryly metodu print
    public void print(){
        System.out.println("Class B: print()");
    }

    @Override
    public void wildAnimal() {
        System.out.println("Cow");
    }

    public void programmingLanguage(){
        System.out.println("Class B love Java");
    }
}
