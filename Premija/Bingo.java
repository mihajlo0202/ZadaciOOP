package Ispit.PrvaGrupa.Premija;


import java.util.List;
import java.util.Stack;

public class Bingo extends Listic{
    private int[][] bingoListic;
    private static List<Integer> izvuceniBroj;
    private static int redova=3, kolona=5;

    public Bingo(int premija, int[][] bingoListic) {
        super(premija);
        this.bingoListic = bingoListic;
    }

    public static List<Integer> getIzvuceniBroj() {
        return izvuceniBroj;
    }

    public static void setIzvuceniBroj(List<Integer> izvuceniBroj) {
        Bingo.izvuceniBroj = izvuceniBroj;
    }

    public boolean postignutBingo(){
        boolean[] kolone= new boolean[5];
        boolean bingo=true;

        for(int i =0;i<bingoListic.length;i++)
            for(int j=0;j<bingoListic[i].length;j++){
                if(!kolone[j] && izvuceniBroj.contains(bingoListic[i][j]))
                    kolone[j]=true;
            }

        for(int i=0;i<kolone.length;i++)
            bingo=bingo&&kolone[i];

        return bingo;
    }


    @Override
    public int odrediDobitak() {
        return postignutBingo() ? getPremija() : 0;
    }

    @Override
    public String proveriDobitak() {
       if(postignutBingo())
           return "Cestitamo! Osvojili ste +" +getPremija()+" RSD";
       else
            return "Nema dobitka";
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("B\tI\tN\tG\tO\n");
        for(int []red: bingoListic) {
            for (int broj : red)
                sb.append(broj).append("\t");
            sb.append("\n");
        }
        return sb.toString();
    }

}
