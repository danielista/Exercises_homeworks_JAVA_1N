package sk.kosickaakademia.danielmartinek.exercises.novyrok;
/*
██╗   ██╗ █████╗ ██╗     ██╗██████╗  █████╗ ████████╗██╗ ██████╗ ███╗   ██╗
██║   ██║██╔══██╗██║     ██║██╔══██╗██╔══██╗╚══██╔══╝██║██╔═══██╗████╗  ██║
██║   ██║███████║██║     ██║██║  ██║███████║   ██║   ██║██║   ██║██╔██╗ ██║
╚██╗ ██╔╝██╔══██║██║     ██║██║  ██║██╔══██║   ██║   ██║██║   ██║██║╚██╗██║
 ╚████╔╝ ██║  ██║███████╗██║██████╔╝██║  ██║   ██║   ██║╚██████╔╝██║ ╚████║
  ╚═══╝  ╚═╝  ╚═╝╚══════╝╚═╝╚═════╝ ╚═╝  ╚═╝   ╚═╝   ╚═╝ ╚═════╝ ╚═╝  ╚═══╝
                                                                           rodného čísla
 */
import java.util.Calendar;

public class PersonalID {
   public boolean checkId(String id){
        if(id.length()<9||id.length()>11)
            return false;
        int cDigits = 0;
        for(int i=0;i<id.length();i++){
            if( Character.isDigit(id.charAt(i)))
                cDigits++;
        }
        if(cDigits<9 || cDigits>10)
            return false;
        if(id.length()==11 && ( cDigits!=10 || id.charAt(6)!='/'))
            return false;
        if(id.length()==10 && cDigits==9 && id.charAt(6)!='/')
            return false;
        // Muž: 1;0 a žena: 5;6.
        if(id.charAt(2)!='0' && id.charAt(2)!='1' && id.charAt(2)!='5' && id.charAt(2)!='6')   return false;

        // VALIDATION DAY:
       if((id.charAt(4)=='3' ) && (id.charAt(5)!='0' || id.charAt(5)!='1'))   return false;
       if(id.charAt(4)!='3' && id.charAt(4)!='2' && id.charAt(4)!='1' && id.charAt(4)!='0' )   return false;
       if(id.charAt(4)=='0' && id.charAt(5)=='0')   return false;

       // VALID FEBRUARY:
       if(id.charAt(3)=='2' && (id.charAt(2)=='0' || id.charAt(2)=='5') &&
               (id.charAt(4)!='2'|| id.charAt(4)!='1' || id.charAt(4)!='0'))   return false;
       // I REALLY DONT WANT TO DO IT FOR LEAP YEARS TODAY:D

       // VALID MONTH HOMEWORK:
       if(id.charAt(2)=='0' && id.charAt(3)=='0')   return false;
       if(id.charAt(2)=='1' && id.charAt(3)!='0' && id.charAt(3)!='1' && id.charAt(3)!='2')   return false;
       if(id.charAt(2)=='5' && id.charAt(3)!='0')   return false;
       if(id.charAt(2)=='6' && id.charAt(3)!='0' && id.charAt(3)!='1' && id.charAt(3)!='2')   return false;
       if(  id.charAt(2)=='3' || id.charAt(2)=='4'
               || id.charAt(2)=='8' || id.charAt(2)=='9' )   return false;
/*
id.charAt(2)=='2' || id.charAt(2)=='7'  ked sa vyčerpu všetky ostatne tak sa može použiť aj toto: 2 pre muža, 7 pre ženu
 */
        if(cDigits==9)
            id=id+'0';

        if(id.charAt(6)=='/')
            // id = id.substring(0,6)+id.substring(7,11);
               id = id.replaceAll("/",""); // elegantnejšie
        long num = Long.parseLong(id);

        // VALID YEAR JUST FOR PRINTLN METHOD ;)
        if((id.charAt(0)=='0' && id.charAt(1)=='0'&& id.charAt(2)!='0')){
            System.out.println("Rodné číslo bezo zlomku: 00"+num);
        }else if((id.charAt(0)=='0' && id.charAt(1)=='0'&& id.charAt(2)=='0')){
            System.out.println("Rodné číslo bezo zlomku: 000"+num);
        }else if((id.charAt(0)=='0' && id.charAt(1)!='0')){
            System.out.println("Rodné číslo bezo zlomku: 0"+num);
        } else System.out.println("Rodné číslo bezo zlomku: "+num);

        if(num%11!=0){
            System.out.println("Chyba, rodne cislo nie je delitelne 11");
            return false;
        }
/**/
        int day , month, year;
        day=Integer.parseInt(id.substring(4,6));
        month=Integer.parseInt(id.substring(2,4));
        year=Integer.parseInt(id.substring(0,2));
        if(id.charAt(2)=='5' || id.charAt(2)=='6' || id.charAt(2)=='7'){
            if(id.charAt(2)=='5')month=month-50;
            if(id.charAt(2)=='6')month=month-60;
            if(id.charAt(2)=='7')month=month-70;
            System.out.println("Ide o nežné pohlavie ;)"); //doplnok
        }else{
            if(id.charAt(2)=='2')month=month-10;
            System.out.println("Ide o muža.");
        }


       year=2000+year;
       int currYear = Calendar.getInstance().get(Calendar.YEAR);
       if(year>currYear)
           year=year-100;
       System.out.println("Dátum narodenia: "+day+"-"+month+"-"+year);

       return true;
   }
}
