package Ispit.PrvaGrupa.Premija;

import java.util.List;

public class IgreNaSrecu <T>{
    private List<List<T>> igre;

    public IgreNaSrecu(List<List<T>> igre) {
        this.igre = igre;
    }

    public List<List<T>> getIgre() {
        return igre;
    }

    public void setIgre(List<List<T>> igre) {
        this.igre = igre;
    }

}
