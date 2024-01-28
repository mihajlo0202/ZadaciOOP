package Ispit.PrvaGrupa.Zadatak1;

public abstract class Knjiga implements Iznajmljivanje {
    private String naslov;
    private String autor;
    private String tekst;

    public Knjiga(String naslov, String autor, String tekst) {
        this.naslov = naslov;
        this.autor = autor;
        this.tekst = tekst;
    }

    public String getNaslov() {
        return naslov;
    }

    public String getAutor() {
        return autor;
    }

    public String getTekst() {
        return tekst;
    }

    public abstract void prikaziInformacije();

    @Override
    public String toString() {
        return "Naslov: "+ naslov+", Autor: "+autor+", tekst: "+tekst;
    }
}
