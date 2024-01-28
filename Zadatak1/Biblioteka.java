package Ispit.PrvaGrupa.Zadatak1;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
    List<Knjiga> listaKnjiga= new ArrayList<>();

    public  void dodajKnjigu(Knjiga knjiga){
        listaKnjiga.add(knjiga);
    }

    public  void prikaziInforamcije(){
        for(Knjiga knjiga:listaKnjiga){
            knjiga.prikaziInformacije();
        }
    }

    public void iznajmiKnjigu(int indeks){
        if(indeks>=0 && indeks<=listaKnjiga.size()){
            Knjiga knjiga= listaKnjiga.get(indeks);
            if(knjiga instanceof Iznajmljivanje){
                ((Iznajmljivanje) knjiga).iznajmi();
                System.out.println("Uspesno iznajmljena knjiga");
            }else{
                System.out.println("Ova knjiga ne može biti iznajmljena");
            }
        } else{
            System.out.println("Indeks van dosega");
        }
    }
}
