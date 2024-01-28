package Ispit.PrvaGrupa.Zadatak1;

public class Main {
    public static void main(String[] args) {
        Biblioteka biblioteka= new Biblioteka();
        biblioteka.dodajKnjigu(new Roman("Romeo i Julija", "Marko","Ovo je ljubavni roman","ljubavni roman"));
        biblioteka.dodajKnjigu(new NaucnaKnjiga("C++ za pocetnike", "Denis Alicic",
                "Ovo je knjiga u kojoj se prica o osnovama jezika C++","Informatika"));


        biblioteka.prikaziInforamcije();
        biblioteka.iznajmiKnjigu(0);
        biblioteka.iznajmiKnjigu(5);

        biblioteka.prikaziInforamcije();
    }
}
