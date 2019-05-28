/** Klasa odpowiedzialna za funkcjonalność lotniska*/
public class Lotnisko {

    private PasyStartowe pasy;
    private Magazyn magazyn;

    /** Tworzy instancje*/
    public Lotnisko()
    {
        pasy = new PasyStartowe();
        magazyn = new Magazyn();
    }

    /**
     * Wybieranie samolotu z magazynu
     * @return Konkretny samolot
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
     * @return bool - true jeśli pasy są dostępne
     */
    public boolean dostepnoscPasow() throws InterruptedException
    {
        return pasy.dostepnoscPasow();
    }

    /**
     * Odstawia do magazynu
     * @param samolot Obiekt samolotu do odstawienia do magazynu
     */
    public void odstawDoMagazynu(Samolot samolot)
    {
        magazyn.odstawDoMagazynu(samolot);
    }
}
