public class Awionetka extends Samolot {

    /** Maksymalna liczba pasażerów na pokładzie */
    private int iloscPasazerowMax;
    /** Obecna ilość pasażerów na pokładzie */
    private int iloscPasazerowPoklad;

    /** Inicjalizuje samolot typu awionetka
     * @param nazwa Nazwa samolotu*/
    public Awionetka(String nazwa)
    {
        super(nazwa, 200, 4,3,3);
        iloscPasazerowMax = 4;
        iloscPasazerowPoklad = Generator.generuj(iloscPasazerowMax);
    }

    @Override
    public void obecnyStanMiejscPoklad() throws InterruptedException
    {
        System.out.println("Ilosc zajetych miejsc: " + iloscPasazerowPoklad );
        Thread.sleep(1500);
        System.out.println("Mkasymalna ilosc osob w samolocie: " + iloscPasazerowMax);
        Thread.sleep(1000);
    }

    @Override
    public int iloscMiejscaPoklad()
    {
        return iloscPasazerowPoklad;
    }

    @Override
    public int iloscMiejscaPokladMax()
    {
        return iloscPasazerowMax;
    }

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
        System.out.println("Wyjscie osob z pokladu");
        iloscPasazerowPoklad = 0;
    }
}
