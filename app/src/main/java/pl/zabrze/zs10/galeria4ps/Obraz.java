package pl.zabrze.zs10.galeria4ps;

import java.util.ArrayList;

public class Obraz {
    private int idObrazka;
    private String opis;
    private ArrayList<Double> oceny;

    public Obraz(int idObrazka, String opis) {
        this.idObrazka = idObrazka;
        this.opis = opis;
        oceny = new ArrayList<>();

    }

    public void setOceny(double ocena) {
       oceny.add(ocena);
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public String getOpis() {
        return opis;
    }

    public double obliczSredniaOcen(){
        double srednia = 0;
        if(oceny.size()>0) {
            for (int i = 0; i < oceny.size(); i++) {
                srednia = srednia + oceny.get(i);
            }
            srednia = srednia / oceny.size();
        }
        return srednia;
    }
}
