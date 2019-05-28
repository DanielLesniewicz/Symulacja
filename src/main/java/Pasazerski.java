/** Klasa zajmująca się funkcjonalnością samolotu pasażerskiego  */
public class Pasazerski extends Samolot{


    /** Maksymalna liczba pasażerów na pokładzie */
    private int iloscPasazerowMax;
    /** Obecna ilość pasażerów na pokładzie */
    private int iloscPasazerowPoklad;

    /** Inicjalizuje samolot pasażerski
     * @param nazwa Nazwa samolotu*/
    public Pasazerski(String nazwa)
    {
        super(nazwa, 1000, 5,3,4);
        iloscPasazerowMax = 120;
        iloscPasazerowPoklad = Generator.generuj(iloscPasazerowMax);           // generuje liczbe pasazerow obecna na pokladzie
    }

    /**
     * Wyświetla stan miejsc na pokładzie
     */
    @Override
    public void obecnyStanMiejscPoklad() throws InterruptedException
    {
        System.out.println("Ilosc zajetych miejsc: " + iloscPasazerowPoklad );
        Thread.sleep(1500);
        System.out.println("Mkasymalna ilosc osob w samolocie: " + iloscPasazerowMax);
        Thread.sleep(1000);
    }

    /**
     * @return Ilość zajętego miejsca na pokładzie
     */
    @Override
    public int iloscMiejscaPoklad()
    {
        return iloscPasazerowPoklad;
    }

    /**
     * @return Maksmalna ilość miejsca na pokładzie
     */
    @Override
    public int iloscMiejscaPokladMax()
    {
        return iloscPasazerowMax;
    }


    /** Odpowiada za wejście pasażerów */
    @Override
    public void zaladunek()
    {
        System.out.println("Wejscie pasazaerow na poklad: ");
        Odliczanie.odliczaj(podajCzasZaladunku());
        iloscPasazerowPoklad = iloscPasazerowMax;
        System.out.println("Wejscie pasazerow na poklad pomyslne.");
    }

    /** Odpowiada za wyjście pasażerów */
    public void rozladunek()
    {
        System.out.println("Wyjscie pasazerow z samolotu: ");
        iloscPasazerowPoklad = 0;
    }
}
