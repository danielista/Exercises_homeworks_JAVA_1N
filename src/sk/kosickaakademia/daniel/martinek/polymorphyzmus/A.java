package sk.kosickaakademia.daniel.martinek.polymorphyzmus;

public class A implements I1 {
    private int number;
    public A(){
        System.out.println("I am constructor A()");
        number = 40;
    }

    public A(String text){
        this(); // zavola sa konstruktor A();
        System.out.println("I am constructor A() and I got a text: "+text);

    }

    @Override
    public void animal() {
        System.out.println("Dog");
    }

    public void print(){
        System.out.println("Class A : print()");
    }
}
