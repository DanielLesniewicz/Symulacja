/** Klasa zajmująca się funkcjonalnością samolotu towarowego */
public class Towarowy extends Samolot{

    /** Maksymalna liczba towaru na pokładzie */
    private int ladownoscMax;
    /** Obecna ilość towaru na pokładzie */
    private int iloscTowaru;

    /** Inicjalizuje samolot towarowy
     * @param nazwa Nazwa samolotu*/
    public Towarowy(String nazwa)
    {
        super(nazwa, 1000, 4,5,3);
        ladownoscMax = 1000;
        iloscTowaru = Generator.generuj(ladownoscMax);
    }

    /** Metoda odpowiedzilana za załadunek*/
    public void zaladunek()
    {
        iloscTowaru = ladownoscMax;
        System.out.println("Samolot zostal zaladowany!");
    }

    /** Mówi o iloci towaru na pokładzie
     * @return Ilość towaru znajdującego się na pokładzie */
    @Override
    public int iloscMiejscaPoklad()
    {
        return iloscTowaru;
    }

    /** Zwraca maksymalną ładowność
     * @return  Ładowność samolotu towarowego*/
    @Override
    public int iloscMiejscaPokladMax()
    {
        return ladownoscMax;
    }
    /** Rozładowuje towar */
    public void rozladunek()
    {
        System.out.println("Rozladunek towaru: ");
        iloscTowaru = 0;
    }

    /**
     * Sprawdza obecny stan miejsc w samolocie
     */
    @Override
    public void obecnyStanMiejscPoklad() throws InterruptedException
    {
        System.out.println("Ilosc zajetego miejsca: " + iloscTowaru );
        Thread.sleep(1500);
        System.out.println("Maksymalna ladownosc towaru w samolocie: " + ladownoscMax);
        Thread.sleep(1000);
    }
}
