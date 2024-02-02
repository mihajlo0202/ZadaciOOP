package Ispit.PrvaGrupa.Premija;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public abstract class Listic {
    private int premija;
    private static Random random=new Random();
    public Listic(int premija) {
        this.premija = premija;
    }

    public int getPremija() {
        return premija;
    }

    public  abstract int odrediDobitak();
    public abstract String proveriDobitak();

    public static  List<Integer> izvlacenje(int brojLoptica, int gornjaGranica){
        List<Integer> izvuceniBrojevi = new ArrayList<>();

        for(int i =0;i<brojLoptica;i++){
            int noviBroj=random.nextInt(gornjaGranica)+1;
            while(izvuceniBrojevi.contains(noviBroj)){
                noviBroj=random.nextInt(gornjaGranica)+1;
            }
            izvuceniBrojevi.add(noviBroj);
        }
        return izvuceniBrojevi;
    }
}
