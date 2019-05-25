public class PozycjaSamolotu {
    /** Metoda generująca pozycję i związane z nią działania */
    public static int podajPozycje()
    {
        int pozycja = Generator.generuj(2);
        if(pozycja == 1)
        {
            System.out.println("Pozycja samolotu: na ladzie");
            System.out.println("Cel: start");
            return 1;
        }
        else
        {
            System.out.println("Pozycja samolotu: w powietrzu");
            System.out.println("Cel: ladowanie");
            return 2;
        }
    }
}
