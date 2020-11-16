package sk.kosickaakademia.daniel.martinek.polymorphyzmus;

public class Main {
    public static void main(String[] args) {
        B p1 = new B();   // zavola sa kontruktor A, potom B
        p1.print();   // zavola sa metoda print() z triedy B

        A p2=new C();   // zavola sa kontruktor A, potom B, potom C
        p2.print();     // zavola sa print z triedy C
        ((B)p2).print(); // vypise print z triedy C
        p2.wildAnimal(); // vypise cow
        ((C)p2).programmingLanguage();  // metodu mozem volat len po pretypovani na B alebo C

        A p3 = new A();  // vola sa konstruktor A
        p3.wildAnimal();  // vypise horse

        I1 p4 = new B(); // vypise sa kontruktor A,B
        p4.wildAnimal(); // vypise cow
        ((A)p4).print(); // metoda print nie je sucastou I1, a preto je mozne ju volat len po pretypovani na A alebo B

        C p5 = new C(); // vila sa kontruktor A,B a nakoniec C
        p5.print(); // vypise C

        A p6 = new A("mobil phone");


    }
}
