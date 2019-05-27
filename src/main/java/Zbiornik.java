/** Klasa zajmująca się zbiornikiem i jego funkcjonalnością */
public class Zbiornik {

    /** Zmienna zawierajaca dane o pojemnosci zbiornika */
    private int pojemnosc;
    /** Przechowuje obecną ilosc paliwa w zbiorniku */
    private int iloscPaliwa;


    /**
     * Tworzy obiekt zbiorika .
     *
     * @param pojemnosc Pojemność zbiornika
     */
    public Zbiornik(int pojemnosc)
    {
        this.pojemnosc = pojemnosc;
        iloscPaliwa = Generator.generuj(pojemnosc);         // losowa ilosc paliwa w samolocie
    }

    /**
     * Ilość paliwa w zbiorniku
     * @return Ilość paliwa w zbiorniku
     */
    public int ilePaliwa()
    {
        return iloscPaliwa;
    }

    /**
     * Ilość całkowitego miejsca w zbiorniku
     * @return Całkowita pojemność zbiornika
     */
    public int ilePojemnosc()
    {
        return pojemnosc;
    }

    /**
     * Odpowiada za tankowanie samolotu
     */
    public void zatankuj()
    {
        iloscPaliwa = pojemnosc;
        System.out.println("Zatankowano samolot!");
    }
}
