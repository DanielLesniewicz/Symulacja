/** Klasa zajmująca się obiektem samolotu, który jest w powietrzu */
public class Wpowietrzu {

    /** Zmienna wykorzystywana przy nazwach samolotów */
    private int numerSamolotu;

    /** Nadaje numer samolotowi */
    public Wpowietrzu()
    {
        numerSamolotu = 1250;
    }

    /**
     * Generacja rodzaju samolotu
     * @return Rodzaj samolotu
     */
    public Samolot ladujeSamolot()
    {
        int rodzaj = Generator.generuj(3);          // generacja rodzaju samolotu

        if(rodzaj == 1)
        {
            String str = "Pasazerski" + numerSamolotu;
            numerSamolotu += 54;
            return new Pasazerski(str);
        }
        else if(rodzaj == 2)
        {
            String str = "Towarowy" + numerSamolotu;
            numerSamolotu += 54;
            return new Towarowy(str);
        }
        else
        {
            String str = "Awionetka" + numerSamolotu;
            numerSamolotu += 54;
            return new Awionetka(str);
        }
    }

}
