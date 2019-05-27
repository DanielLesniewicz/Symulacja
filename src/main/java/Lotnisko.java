public class Lotnisko {

    private PasyStartowe pasy;
    private Magazyn magazyn;

    /** Tworzy instancje, czyli konkretne samoloty*/
    public Lotnisko()
    {
        pasy = new PasyStartowe();
        magazyn = new Magazyn();
    }

    /**
     * Wybieranie samolotu z magazynu
     * @return null gdy magazyn pusty, w przeciwnym wypadku zmienną "temp"
     */
    public Samolot wybierzZmagazynu()
    {
        return magazyn.wybierzZmagazynu();
    }


    /** Wyświetla stan magazynu */
    public void wyswietlMagazyn() throws InterruptedException
    {
        magazyn.wyswietlMagazyn();
    }

    /**
     * @return bool - czy pasy są dostępne
     */
    public boolean dostepnoscPasow() throws InterruptedException
    {
        return pasy.dostepnoscPasow();
    }

    /**
     * Odstawia do magazynu
     * @param samolot Obiekt samolotu
     */
    public void odstawDoMagazynu(Samolot samolot)
    {
        magazyn.odstawDoMagazynu(samolot);
    }
}
