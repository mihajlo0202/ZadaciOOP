package Ispit.PrvaGrupa.DrugaGrupa.Zadatak1;

public class Roman extends Knjiga{
    private String zanr;

    public Roman(String naslov, String autor, int brNaStanju, String[] komentari, String zanr) {
        super(naslov, autor, brNaStanju, komentari);
        this.zanr = zanr;
    }

    public String getZanr() {
        return zanr;
    }

    @Override
    public void prikaziInformacije() {
        System.out.println(getNaslov()+", "+getAutor()+" "+getBrNaStanju()+" "+getKomentari()+" "+zanr+"\n");
    }

    @Override
    public String vratiKomentare() {
        StringBuilder sb = new StringBuilder(" ");
        if (getKomentari() != null) {
            for (String komentar : getKomentari()) {
                sb.append(komentar).append("\n");
            }
        }
        return sb.toString();
    }
}
