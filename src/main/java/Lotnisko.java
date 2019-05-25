import java.util.Iterator;
import java.util.LinkedList;

public class Lotnisko {

    private LinkedList<Samolot> magazyn = new LinkedList<>();
    private Iterator<Samolot> iter = magazyn.iterator();

    private PasyStartowe pasy = new PasyStartowe();

    /** Tworzy instancje, czyli konkretne samoloty*/
    public Lotnisko()
    {
        // poczatkowe samoloty pasazerskie w magazynie
        magazyn.add(new Pasazerski("Pasazerski1"));
        magazyn.add(new Pasazerski("Pasazerski2"));

        //poczatkowe samoloty towarowe w magazynie
        magazyn.add(new Towarowy("Towarowy1"));
        magazyn.add(new Towarowy("Towarowy2"));

        //poczatkowe awionetki w magazynie
        magazyn.add(new Awionetka("Awionetka1"));
        magazyn.add(new Awionetka("Awionetka2"));
    }


    public Samolot wybierzZmagazynu()
    {
        if(magazyn.size() == 0)         // gyd magazyn jest pusty
        {
            return null;
        }
        else
        {
            int index = Generator.generuj(magazyn.size()) - 1;      // wybranie jednego z samolotow w magazynie

            Samolot temp = magazyn.remove(index);

            System.out.println("Wybrano samolot: " + temp.podajNazwe());

            return temp;
        }
    }


    /** Wyświetla stan magazynu */
    public void wyswietlMagazyn() throws InterruptedException {
        System.out.println("Samoloty dostepne w magazynie: ");

        int numer = 1;
        for(Samolot tmp: magazyn)
        {
            System.out.println(numer + ": " + tmp.podajNazwe());
            numer++;
            Thread.sleep(1000);
        }
    }

    public boolean dostepnoscPasow() throws InterruptedException
    {
        return pasy.dostepnoscPasow();
    }

    public void odstawDoMagazynu(Samolot samolot)
    {
        magazyn.add(samolot);
    }
}
