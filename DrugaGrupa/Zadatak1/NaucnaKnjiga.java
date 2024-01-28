package Ispit.PrvaGrupa.DrugaGrupa.Zadatak1;

public class NaucnaKnjiga extends Knjiga{
    private String naucnaOblast;

    public NaucnaKnjiga(String naslov, String autor, int brNaStanju, String[] komentari, String naucnaOblast) {
        super(naslov, autor, brNaStanju, komentari);
        this.naucnaOblast = naucnaOblast;
    }

    public String getNaucnaOblast() {
        return naucnaOblast;
    }
    public String vratiKomentare() {
        StringBuilder sb = new StringBuilder(" ");
        if (getKomentari() != null) {
            for (String komentar : getKomentari()) {
                sb.append(komentar).append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public void prikaziInformacije() {
        System.out.println(getNaslov()+", "+getAutor()+" "+getBrNaStanju()+" "+getKomentari()+" "+naucnaOblast+"\n");
    }
}
