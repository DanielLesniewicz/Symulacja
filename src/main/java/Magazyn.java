import java.util.ArrayList;
/** Klasa odpowiedzialna za magazyn samolotów*/
public class Magazyn {

    /** Lista ArrayList na magazyn*/
    private ArrayList<Samolot> magazyn;

    /** Zainicjowanie nowych samolotów na start programu*/
    public Magazyn()
    {
        magazyn = new ArrayList<>();
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

    /** Wybór samolotu z magazynu
     * return null, gdy magazyn jest pusty, temp gdy wybrano konkretny samolot*/
    public Samolot wybierzZmagazynu()
    {
        if(magazyn.size() == 0)         // gdy magazyn jest pusty
        {
            return null;
        }
        else
        {
            int index = Generator.generuj(magazyn.size());      // wybranie jednego z samolotow w magazynie

            Samolot temp = magazyn.remove(index);

            System.out.println("Wybrano samolot: " + temp.podajNazwe());

            return temp;
        }
    }

    /** Wyświetlenie magazynu*/
    public void wyswietlMagazyn() throws InterruptedException
    {
        System.out.println("Samoloty dostepne w magazynie: ");
        int numer = 1;

        if(magazyn.size() == 0)
            System.out.println("Magazyn jest pusty");
        else
        {
            for (Samolot tmp : magazyn) {
                if (tmp != null) {
                    System.out.println(numer + ": " + tmp.podajNazwe());
                    numer++;
                    Thread.sleep(1000);
                }
            }
        }
    }

    /** Odstawienie do magazynu
     * @param samolot Obiekt samolotu, który ma być odstawiony do magazynu*/
    public void odstawDoMagazynu(Samolot samolot)
    {
        magazyn.add(samolot);
    }
}
