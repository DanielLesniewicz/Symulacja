/**
 * Klasa zajmująca się pozycjonowaniem samolotu
 */
public class PozycjaSamolotu {
    /** Metoda generująca pozycję i związane z nią działania
     * @return Pozycja samolotu: 1- ląd, 2- w powietrzu*/
    public static int podajPozycje()
    {
        int pozycja = Generator.generuj(2);
        if(pozycja == 1)
        {
            System.out.println("____________________________");
            System.out.println("Pozycja samolotu: na ladzie");
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            System.out.println("Cel: start");
            return 1;
        }
        else
        {
            System.out.println("_____________________________");
            System.out.println("Pozycja samolotu: w powietrzu");
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            System.out.println("Cel: ladowanie");
            return 2;
        }
    }
}
