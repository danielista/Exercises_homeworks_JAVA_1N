package sk.kosickaakademia.danielmartinek.exercises.password;

import java.util.Random;

public class Password {
    public static void main(String[] args) {
        Random rnd = new Random();
        String pass="";

        for (int i=0; i<8; i++){
            char z ;
            z = (char)(rnd.nextInt((rnd.nextInt(26)+97)));
        pass+=z;
        }

    }

    public String randomPassword(){
        // male pismena velke a cislicce
        // A15dfRw8aS
        // 9fgT7R5hzW
        return randomPassword();
    }



}
