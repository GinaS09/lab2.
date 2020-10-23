package ro.mta.facc.selab;

public class Carte implements Comparable<Carte> {

    private String titlu;
    private String autor;
    private int anPublicatie;
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
        this.anPublicatie = anAp;
        this.nrPag = nrPag;
    }

    @Override
    public String toString() {
        return this.titlu + " " + this.autor + "Aparuta in anul :" + this.anPublicatie;
    }
}
