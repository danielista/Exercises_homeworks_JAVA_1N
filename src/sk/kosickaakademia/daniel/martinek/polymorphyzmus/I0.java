package sk.kosickaakademia.daniel.martinek.polymorphyzmus;

public interface I0 {
    public void animal();

    default public void wildAnimal(){
        System.out.println("Horse");
    }

}
