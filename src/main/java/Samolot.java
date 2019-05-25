public abstract class Samolot {
    /** Nazwa samolotu */
    private String nazwa;
    /** Czas załadunku samolotu*/
    private int czasZaladunku;
    /** Czas tankowania samolotu*/
    private int czasTankowania;
    /** Czas rozładunku samolotu*/
    private int czasRozladunku;
    Zbiornik zbiornik;

    //konstruktor
    public Samolot(String nazwa, int pojemnoscZbiornika, int czasZaladunku, int czasTankowania, int czasRozladunku)
    {
        this.nazwa = nazwa;
        zbiornik = new Zbiornik(pojemnoscZbiornika);
        this.czasZaladunku = czasZaladunku;
        this.czasTankowania = czasTankowania;
        this.czasRozladunku = czasRozladunku;
    }


    public Samolot()
    {}

    public abstract int iloscMiejscaPoklad();
    public abstract int iloscMiejscaPokladMax();

    public abstract void obecnyStanMiejscPoklad() throws InterruptedException;

    public abstract void zaladunek();

    public abstract void rozladunek();

    /** Nadanie nazwy samolotowi
     * @return Nazwa samolotu*/
    public String podajNazwe()
    {
        return nazwa;
    }

    /** Informuje i ilości paliwa w samolocie
     * @return Ilość paliwa w samolocie*/
    public int ilePaliwa()
    {
        return zbiornik.ilePaliwa();
    }

    /** Czas tankowania poszczególnego samolotu
     * @return Czas tankowania*/
    public int podajCzasTankowania()
    {
        return czasTankowania;
    }
    /** Czas załadunku poszczególnego samolotu
     * @return Czas załadunku*/
    public int podajCzasZaladunku()
    {
        return czasZaladunku;
    }
    /** Czas rozładunku dla poszczególnego samolotu
     * @return Czas rozładunku*/
    public int podajCzasRozladunku()
    {
        return czasRozladunku;
    }

    /** Zwraca pojemność zbiornika
     * @return Pojemność zbiornika*/
    public int podajPojemnoscZbiornika()
    {
        return zbiornik.ilePojemnosc();
    }

    /** Odpowiada za tankowanie samolotu */
    public void zatankuj()
    {
        zbiornik.zatankuj();
    }
}
