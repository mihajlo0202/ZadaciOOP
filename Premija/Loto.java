package Ispit.PrvaGrupa.Premija;

import java.util.List;

public class Loto extends Listic{
    private List<Integer> lotoListic;
    private static List<Integer> dobitnaKombinacija;

    public Loto(int premija, List<Integer> lotoListic) {
        super(premija);
        this.lotoListic = lotoListic;
    }

    public List<Integer> getLotoListic() {
        return lotoListic;
    }

    public static List<Integer> getDobitnaKombinacija() {
        return dobitnaKombinacija;
    }

    public void setLotoListic(List<Integer> lotoListic) {
        this.lotoListic = lotoListic;
    }

    public static void setDobitnaKombinacija(List<Integer> dobitnaKombinacija) {
        Loto.dobitnaKombinacija = dobitnaKombinacija;
    }


    public int odrediBrojPogodaka(){
        int brojPogodaka=0;

        for(int e:lotoListic){
            if(dobitnaKombinacija.contains(e))
                brojPogodaka++;
        }
        return brojPogodaka;
    }


    @Override
    public int odrediDobitak() {
        int brojPogodaka=odrediBrojPogodaka();

        if(brojPogodaka<3){
            return 0;
        }
        else
            return (int) (getPremija()/Math.pow(10,7-brojPogodaka));
    }

    @Override
    public String proveriDobitak() {
        int brojPogodaka=odrediBrojPogodaka();

       if(brojPogodaka<3)
           return "Nema nagrade";
       else
           return "Imate "+brojPogodaka+ " pogodaka. Osvojili ste" +odrediDobitak()+" RSD!";

    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        for(int broj : lotoListic){
            sb.append(broj).append(" ");
        }
        sb.append("\n");
        return sb.toString();
    }
}
