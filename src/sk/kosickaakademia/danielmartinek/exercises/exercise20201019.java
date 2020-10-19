package sk.kosickaakademia.danielmartinek.exercises;

public class exercise20201019 {
    public static void main(String[] args) {


        System.out.println(Csesarov("Dnes je PONDelok 19.10.2020 ##!?+"));
        System.out.println("Dnes je PONDelok 19.10.2020 ##!?+");
        textAnalyzer("Dnes je PONDelok 19.10.2020 ##!?+");


/*
for (int i=65; i<257; i++){ //197 --> 222 malé
            System.out.println("ASCII char" + i + ". " + (char)i + " ");
        }

        String r="kosice2021z";
        char[] pole = r.toCharArray();
        int len = pole.length;
        for(int i=0; i<len; i++){
            pole[i] = (char)(pole[i]+5);
        }
        String newR = String.valueOf(pole);
        System.out.println(newR);
 */


    }
/*
 ██████╗ █████╗ ███████╗███████╗ █████╗ ██████╗      ██████╗██╗   ██╗██████╗ ██╗  ██╗███████╗██████╗
██╔════╝██╔══██╗██╔════╝██╔════╝██╔══██╗██╔══██╗    ██╔════╝╚██╗ ██╔╝██╔══██╗██║  ██║██╔════╝██╔══██╗
██║     ███████║█████╗  ███████╗███████║██████╔╝    ██║      ╚████╔╝ ██████╔╝███████║█████╗  ██████╔╝
██║     ██╔══██║██╔══╝  ╚════██║██╔══██║██╔══██╗    ██║       ╚██╔╝  ██╔═══╝ ██╔══██║██╔══╝  ██╔══██╗
╚██████╗██║  ██║███████╗███████║██║  ██║██║  ██║    ╚██████╗   ██║   ██║     ██║  ██║███████╗██║  ██║
 ╚═════╝╚═╝  ╚═╝╚══════╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝     ╚═════╝   ╚═╝   ╚═╝     ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝

 */
    public static String Csesarov( String text){
        int len = text.length();
        String sifra="";
        for (int i=0; i<len; i++){
            char z=text.charAt(i);
            if(z>='A' && z<='Z'){
                z=(char)(z+3);
                if(z> 'Z')
                    z=(char)(z-26);
            }else if(z>='a' && z<='z'){
                z= (char) (z+3);
                if(z>'z')
                    z=(char)(z-26);

            }else if (z>='0' && z<='9'){
                z= (char) (z+3);
                if(z>'9')
                    z=(char)(z-10);
            }
            sifra = sifra+z;
        }
        return sifra;
    }

/*
████████╗███████╗██╗  ██╗████████╗     █████╗ ███╗   ██╗ █████╗ ██╗  ██╗   ██╗███████╗███████╗██████╗
╚══██╔══╝██╔════╝╚██╗██╔╝╚══██╔══╝    ██╔══██╗████╗  ██║██╔══██╗██║  ╚██╗ ██╔╝╚══███╔╝██╔════╝██╔══██╗
   ██║   █████╗   ╚███╔╝    ██║       ███████║██╔██╗ ██║███████║██║   ╚████╔╝   ███╔╝ █████╗  ██████╔╝
   ██║   ██╔══╝   ██╔██╗    ██║       ██╔══██║██║╚██╗██║██╔══██║██║    ╚██╔╝   ███╔╝  ██╔══╝  ██╔══██╗
   ██║   ███████╗██╔╝ ██╗   ██║       ██║  ██║██║ ╚████║██║  ██║███████╗██║   ███████╗███████╗██║  ██║
   ╚═╝   ╚══════╝╚═╝  ╚═╝   ╚═╝       ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚══════╝╚═╝   ╚══════╝╚══════╝╚═╝  ╚═╝
                                                                                                       */

    // text analyzer ...count all capitals or lowercase letters.. spaces, sentences, words ..etc
    public static void textAnalyzer (String text){
        int len = text.length();
        int pMedzier=0, pMalych=0, pVelkych=0, pCisel=0, pSlov=0, pViet=1;


        for (int i=0; i<len; i++) {
            char z = text.charAt(i);
            if (z >= 'A' && z <= 'Z') pVelkych++;
            if (z >= 'a' && z <= 'z') pMalych++;
            if (z >= '0' && z <= '9') pCisel++;
            if (z == '.' && text.charAt(i+1) == ' ') pViet++;
            if (z == ' ') pMedzier++;

                pSlov = pMedzier+1;

        }
        System.out.println("pocet Medzier je: " + pMedzier );
        System.out.println("pocet Slov je: " + pSlov );
        System.out.println("pocet velkych písmen je: " + pVelkych  );
        System.out.println("pocet malych písmen je: " + pMalych  );
        System.out.println("pocet číslic je: " + pCisel  );
        System.out.println("pocet viet je: " + pViet  );
    }


}
