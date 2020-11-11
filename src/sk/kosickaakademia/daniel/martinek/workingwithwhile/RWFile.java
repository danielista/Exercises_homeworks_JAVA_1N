package sk.kosickaakademia.daniel.martinek.workingwithwhile;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RWFile {
    public void copyFileWithCapital(String fileName){
        BufferedReader reader;
        try{
            FileReader fr = new FileReader(fileName);
            File file = new File("outputs/"+getFileName());
            file.createNewFile(); // vytvorenie noveho filu na defaultnom mieste

            FileWriter fw = new FileWriter(file); // otvorenie filu pre zapisovanie
            reader = new BufferedReader(fr);
            String line;
            while((line = reader.readLine()) != null){
                line = line.toUpperCase();
                System.out.println(line);
                fw.write(line+'\n');
            }


            fr.close();
            fw.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    // vytvorí meno súboru s aktuálnym dátumom  (b_[time].txt)
    private String getFileName(){
        String name;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmmss");
        LocalDateTime now = LocalDateTime.now();

        name="b_"+dtf.format(now)+".txt";
        return name;
    }



}
