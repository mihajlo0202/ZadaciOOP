package Ispit.PrvaGrupa.DrugaGrupa.Zadatak1;

public class Main {
    public static void main(String[] args) {
        Knjizara knjizara= new Knjizara();

        knjizara.dodajKnjigu(new Roman("Naslov1", "Autor1", 2, new String[]{"Komentar1", "Komentar2"},"roman"));
        knjizara.dodajKnjigu(new NaucnaKnjiga("Naslov2", "Autor2", 1, new String[]{"Komentar3", "Komentar4"},"Matematika"));

        knjizara.ispisiKomentare(0);
        knjizara.ispisiKomentare(1);
        knjizara.ispisiKomentare(2);
    }
}
