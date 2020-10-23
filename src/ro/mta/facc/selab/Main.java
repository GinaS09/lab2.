package ro.mta.facc.selab;

public class Main {
    public static  void main(String[] args)
    {
        Carte c = new Carte ( "gina" ,"aSS",324,3243);
        Biblioteca b= new Biblioteca();

        b.add(c);
        b.add(new Carte("marina","aut",3232,3232));

        b.sort();
        b.add(c);
        b.add(new Carte("ion","aut",32,232));
        b.add(c);
        b.add(new Carte("mar","aut",3232,3232));

        Biblioteca bib =new Biblioteca();
        bib.add(c);
        bib.add(new Carte("a","eu",231,34));

        b.add(bib);
        bib.add(b);



        Mythread mythread= new Mythread();
        mythread.start();
        try {
            mythread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(b);
        System.out.println(bib);
    }
}
