package sk.kosickaakademia.dynamicarrays;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;

public class homework {

    public static void main(String[] args) throws Exception{


        Set<String> names = new HashSet<>();
        try{
            FileReader fr = new FileReader("resource/names.txt");
            BufferedReader br = new BufferedReader(fr);
            String thisLine = null;
            int help =0, ee=0;
            while ((thisLine= br.readLine())!= null){
                System.out.print(thisLine + " ");
                ee++;
                if (names.contains(thisLine)==false){
                    names.add(thisLine);
                    help++;
                }
            }

            br.close();

            for (String aa: names){
                System.out.println(aa);
            }
            System.out.println("!!!! Všetkých mien bolo: " + ee +
                    ", ale tých čo sa neopakujú je len: " + help);

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
