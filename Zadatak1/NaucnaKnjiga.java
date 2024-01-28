package Ispit.PrvaGrupa.Zadatak1;

import java.io.FileWriter;
import java.io.IOException;

public class NaucnaKnjiga extends Knjiga {

    private String naucnaOblast;

    public NaucnaKnjiga(String naslov, String autor, String tekst, String naucnaOblast) {
        super(naslov, autor, tekst);
        this.naucnaOblast = naucnaOblast;
    }

    public String getNaucnaOblast() {
        return naucnaOblast;
    }

    @Override
    public void prikaziInformacije() {
        System.out.println(" "+super.toString()+", Naucna oblast: " +naucnaOblast);
    }

    @Override
    public void iznajmi() {
        try{
            String fileName=getNaslov()+"-"+naucnaOblast+".txt";
            FileWriter writer = new FileWriter(fileName);
            writer.append(getTekst());

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
