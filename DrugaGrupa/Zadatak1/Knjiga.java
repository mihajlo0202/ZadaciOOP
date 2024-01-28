package Ispit.PrvaGrupa.DrugaGrupa.Zadatak1;

public abstract class Knjiga implements PrikazKomentara{
    private String naslov;
    private String autor;
    private int  brNaStanju;
    private String[] komentari;

    public Knjiga(String naslov, String autor, int brNaStanju, String[] komentari) {
        this.naslov = naslov;
        this.autor = autor;
        this.brNaStanju = brNaStanju;
        this.komentari = komentari;
    }

    public String getNaslov() {
        return naslov;
    }

    public String getAutor() {
        return autor;
    }

    public int getBrNaStanju() {
        return brNaStanju;
    }

    public String[] getKomentari() {
        return komentari;
    }

    public abstract void prikaziInformacije();
}
