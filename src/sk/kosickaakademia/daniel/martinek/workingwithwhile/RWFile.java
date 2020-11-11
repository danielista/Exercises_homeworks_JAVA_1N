package sk.kosickaakademia.daniel.martinek.workingwithwhile;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RWFile {

    public void copyFileWithCapital(String fileName){
        BufferedReader reader;
        try{
            if(new File(fileName).exists() == false){ // vytvoril novu triedu s názvom
                System.out.println("problem: file "+ fileName + " does not exist!!");
                return;
            }
            FileReader fr = new FileReader(fileName);
            File file = new File("outputs/"+getFileName("B_"));
            file.createNewFile(); // vytvorenie noveho filu na defaultnom mieste

            FileWriter fw = new FileWriter(file); // otvorenie filu pre zapisovanie
            reader = new BufferedReader(fr);
            String line;
            while((line = reader.readLine()) != null){
                line = line.toUpperCase();
                //System.out.println(line);
                fw.write(line+'\n'); // pridava enter do suboru kde píše :D
            }
            fr.close();
            fw.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    // vytvorí meno súboru s aktuálnym dátumom  (b_[time].txt)
    private String getFileName(String prefix){
        String name;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmmss");
        LocalDateTime now = LocalDateTime.now();

        name=prefix+dtf.format(now)+".txt";
        return name;
    }

    public void copyAndEncryptFile (String fileName, int offset){ // tu daj druhý argument offset

        BufferedReader reader;
        try{
            if(!new File(fileName).exists()){ // vytvoril novu triedu s názvom
                System.out.println("problem: file "+ fileName + " does not exist!!");
                return;
            }
            FileReader fr = new FileReader(fileName);
            File file = new File("outputs/"+getFileName("C_"));
            file.createNewFile(); // vytvorenie noveho filu na defaultnom mieste

            FileWriter fw = new FileWriter(file); // otvorenie filu pre zapisovanie
            reader = new BufferedReader(fr);
            int c = 0;
            while((c = reader.read()) != -1)         //Read char by Char
            {
                char character = (char) c;          //converting integer to char

                // digit shifting
                if(character > 47 && character < 58 ){ //tak toto sú cifry
                    int help = (character+(offset%10));
                        if (help>57) character = (char) (47 + (help - 57));
                            else character=(char)help;
                }

                // uppercase letters shifting
                if(character > 64 && character < 91){
                    int help = (character+(offset%26));
                    if (help>90) character = (char) (64 + (help - 90));
                    else character=(char)help;
                }

                // lowercase letters shifting
                if(character > 96 && character < 123){
                    int help = (character+(offset%26));
                    if (help>122) character = (char) (96 + (help - 122));
                    else character=(char)help;
                }
                //System.out.print(character);      // výpis znaku
                fw.write(character);
            }
            fr.close();
            fw.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }



    // creating new file D_"currenttime".txt which contain text from file a.txt withouts i and yota signs
    public void makeDiktat (String fileName){
        BufferedReader reader;
        try{
            if(!new File(fileName).exists()){ // vytvoril novu triedu s názvom
                System.out.println("problem: file "+ fileName + " does not exist!!");
                return;
            }
            FileReader fr = new FileReader(fileName);
            File file = new File("outputs/"+getFileName("D_"));
            file.createNewFile(); // vytvorenie noveho filu na defaultnom mieste

            FileWriter fw = new FileWriter(file); // otvorenie filu pre zapisovanie
            reader = new BufferedReader(fr);
            int c ;
            while((c = reader.read()) != -1)         //Read char by Char
            {
                char character = (char) c;          //converting integer to char

                // looking for i,I,y,Y,í,Í,Ý,ý
                if(character == 73 ||  character == 105 || character == 89 || character == 121 || character==236
                        || character==221 || character==161 || character==205 || character==237|| character==253  ) character = (char) 95;

               // System.out.print(character);      // v_p_s znaku
                fw.write(character);
            }
            fr.close();
            fw.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }


}
        /*
          ▄████████  ▄█   ▄█          ▄████████    ▄████████           ▄█    ▄████████  ▄█    █▄     ▄████████
           ███    ███ ███  ███         ███    ███   ███    ███          ███   ███    ███ ███    ███   ███    ███
           ███    █▀  ███▌ ███         ███    █▀    ███    █▀           ███   ███    ███ ███    ███   ███    ███
          ▄███▄▄▄     ███▌ ███        ▄███▄▄▄       ███                 ███   ███    ███ ███    ███   ███    ███
         ▀▀███▀▀▀     ███▌ ███       ▀▀███▀▀▀     ▀███████████          ███ ▀███████████ ███    ███ ▀███████████
           ███        ███  ███         ███    █▄           ███          ███   ███    ███ ███    ███   ███    ███
           ███        ███  ███▌    ▄   ███    ███    ▄█    ███          ███   ███    ███ ███    ███   ███    ███
           ███        █▀   █████▄▄██   ██████████  ▄████████▀       █▄ ▄███   ███    █▀   ▀██████▀    ███    █▀
           ▀                                        ▀▀▀▀▀▀
         */











