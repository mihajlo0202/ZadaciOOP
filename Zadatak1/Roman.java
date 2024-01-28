package Ispit.PrvaGrupa.Zadatak1;

import java.io.FileWriter;
import java.io.IOException;

public class Roman extends Knjiga{
    private String zanr;

    public Roman(String naslov, String autor, String tekst, String zanr) {
        super(naslov, autor, tekst);
        this.zanr = zanr;
    }

    public String getZanr() {
        return zanr;
    }

    @Override
    public void prikaziInformacije() {
        System.out.println(" "+super.toString()+", Zanr: " +zanr);
    }


    @Override
    public void iznajmi() {
       try{
           String fileName=getNaslov()+"-"+zanr+".txt";
           FileWriter writer = new FileWriter(fileName);
           writer.append(getTekst());

       }catch(IOException e){
           e.printStackTrace();
       }
    }
}
