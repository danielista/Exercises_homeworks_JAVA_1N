package sk.kosickaakademia.danielmartinek.exercises.guestcity;

import java.util.Random;

public class City {
    public String getRandomCity(){
        String[] array = new String[]{"Zvolen" ,"Bardejov"};

        Random rnd = new Random();
        int num = rnd.nextInt(array.length);
        return  array[num];
    }
    public void play(){
        String city=getRandomCity().toUpperCase();
        String tip="";

        if (city.compareToIgnoreCase(tip)==0){
            ;
        }
    }

}
