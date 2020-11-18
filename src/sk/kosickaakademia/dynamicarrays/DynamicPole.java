package sk.kosickaakademia.dynamicarrays;

import java.util.ArrayList;

public class DynamicPole {
    public static void main(String[] args) {
        ArrayList<String> pole = new ArrayList<>();
        pole.add("Danko");
        pole.add("Janko");
        pole.add("Samko");

        try{
            System.out.println("prvkov v poli je:" + pole.size());
            System.out.println(pole.get(1));
            pole.remove(0);
            System.out.println(pole.get(1));
            System.out.println(pole.get(2));
        }catch (IndexOutOfBoundsException ex){
            System.out.println("Error: " + ex);
        }
    }
}
