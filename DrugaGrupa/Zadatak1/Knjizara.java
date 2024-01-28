package Ispit.PrvaGrupa.DrugaGrupa.Zadatak1;

import java.util.ArrayList;
import java.util.List;

public class Knjizara {
    private List<Knjiga> listaKnjiga= new ArrayList<>();

    public Knjizara(List<Knjiga> listaKnjiga) {
        this.listaKnjiga = new ArrayList<>();
    }

    public Knjizara(){

    }

    public void dodajKnjigu(Knjiga knjiga){
        listaKnjiga.add(knjiga);
    }
    public  void ispisiKomentare(int indeks){
        if(indeks>=0 && indeks<listaKnjiga.size()){
            Knjiga knjiga= listaKnjiga.get(indeks);
            String komentari=knjiga.vratiKomentare();
            System.out.println("Komentari za knjigu na indeksu " + indeks + ":\n" + komentari);
        }
        else {
            System.out.println("Indeks van  opsega");
        }
    }
}
