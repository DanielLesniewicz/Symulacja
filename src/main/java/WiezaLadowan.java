public class WiezaLadowan extends WiezaKontroliLotow{
    private Wpowietrzu wpowietrzu = new Wpowietrzu();


    /** Przygotowuje lądowanie poprzez wybor samolotu, który ma podejść do lądowania */
    public void  przygotowanieDoLadowania() throws InterruptedException
    {
        System.out.println("Dostepnosc pasow do wyladowania: ");
        while(!(lotnisko.dostepnoscPasow()))
        {
            System.out.println("Wszystkie pasy sa zajete.");
            System.out.println("Sytuacja na lotnisku po 50 min");
            Odliczanie.odliczaj(5);
        }
        Thread.sleep(2000);
        System.out.println("Sa pasy dostepne. Samolot moze wyladowac!");
        Thread.sleep(2000);

        Samolot samolot = wpowietrzu.ladujeSamolot();
        System.out.println("Przygotowywanie samolotu: " + samolot.podajNazwe() + " do ladowania");
        Thread.sleep(2000);
        ladowanieSamolotu(samolot);
    }


    public void ladowanieSamolotu(Samolot samolot) throws InterruptedException {

        System.out.println("Samolot laduje");
        Odliczanie.odliczaj(3);
        System.out.println("Samolot wyladowal pomyslnie!");
        Thread.sleep(2000);

        System.out.println("Rozpakowywanie samolotu: ");
        samolot.rozladunek();
        Odliczanie.odliczaj(samolot.podajCzasRozladunku());
        Thread.sleep(2000);

        System.out.println("Odstawienie samolotu do magazynu: ");
        Odliczanie.odliczaj(4);
        lotnisko.odstawDoMagazynu(samolot);
        Thread.sleep(2000);
        System.out.println("Obecne samoloty w magazynie: ");
        lotnisko.wyswietlMagazyn();
        Thread.sleep(2000);
    }
}
