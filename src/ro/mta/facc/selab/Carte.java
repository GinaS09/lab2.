package ro.mta.facc.selab;

import java.util.Collections;

public class Carte implements Comparable<Carte> {

    private String titlu;
    private String autor;
    private int anAp;
    private int nrPag;


    @Override
    public int compareTo(Carte o) {
        if (this.nrPag< o.nrPag)
            return -1;
        if (this.nrPag > o.nrPag)
            return 1;
        return 0;
    }


    public Carte(String titlu, String autor, int anAp, int nrPag) {
        this.titlu = titlu;
        this.autor = autor;
        this.anAp = anAp;
        this.nrPag = nrPag;
    }

    @Override
    public String toString() {
        return this.titlu + " " + this.autor + "Aparuta in anul :" + this.anAp;
    }
}
