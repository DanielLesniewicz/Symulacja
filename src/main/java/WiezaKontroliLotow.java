public class WiezaKontroliLotow {

    private Lotnisko lotnisko;

    private Wpowietrzu wpowietrzu = new Wpowietrzu();

    public WiezaKontroliLotow()
    {
        lotnisko = new Lotnisko();
    }

    public void PrzygotowanieDoStartu() throws InterruptedException
    {
        Thread.sleep(2000);

        lotnisko.wyswietlMagazyn();
        Samolot tmp = lotnisko.wybierzZmagazynu();  // wybieramy samolot z magazynu
        Thread.sleep(2000);

        if(tmp == null)
            System.out.println("Magazyn jest pusty. Jeden z samolotow musi zostac odstawiony do magazynu.");
        else
            startSamolotu(tmp);
    }


    public void startSamolotu(Samolot tmp) throws InterruptedException
    {
        System.out.println("Przygotowywanie samolotu: " + tmp.podajNazwe() + " do startu");
        Thread.sleep(2000);

        System.out.println("Ilosc paliwa w zbiorniku: " + tmp.ilePaliwa());
        System.out.println("Maksymalnie: " + tmp.podajPojemnoscZbiornika());
        Thread.sleep(2000);

        //sprawdzenie ilosci paliwa
        if(tmp.ilePaliwa() < 0.75 * tmp.podajPojemnoscZbiornika())
        {
            System.out.println("Zbiornik nie jest zapelniony w 75%. Nalezy zatankowac samolot");
            Thread.sleep(2000);
            System.out.println("Tankowanie: ");
            Odliczanie.odliczaj(tmp.podajCzasTankowania());
            tmp.zatankuj();
        }
        else
        {
            System.out.println("Zbiornik jest zapelniony w powyzej 75%, a wiec samolot moze odleciec");
        }
        Thread.sleep(3000);


        //sprawdzenie ilosci miejsca na pokladzie
        tmp.obecnyStanMiejscPoklad();
        if(tmp.iloscMiejscaPoklad() < 0.5 * tmp.iloscMiejscaPokladMax())
        {
            System.out.println("Samolot nie jest zapelniony w 50%");
            tmp.zaladunek();
        }
        else
            System.out.println("Samolot jest zapelniony w przynajmniej 50% a wiec moze odleciec");
        Thread.sleep(3000);


        System.out.println("Samolot odlatuje: ");
        Odliczanie.odliczaj(4);
        System.out.println("Samolot odlecial!");
        Thread.sleep(2000);
    }

    public void  przygotowanieDoLadowania() throws InterruptedException
    {
        System.out.println("Pasy na lotnisku: ");
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
