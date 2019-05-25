import java.util.ArrayList;
import java.util.List;

public class PasyStartowe {
    /** Zmienna wykorzystywana do nazw samolotów*/
    private int numer = 9550;

    private int liczbaPasow = 10;

    List<Samolot> pasy = new ArrayList<>(liczbaPasow);

    public boolean dostepnoscPasow() throws InterruptedException
    {
        int ile = Generator.generuj(liczbaPasow);

        pasy.removeAll(pasy);

        for(int i = 0; i < ile; i++)
        {
            if(i >= 1 && i <=3) {
                String str = "Pasazerki" + numer;
                pasy.add(new Pasazerski(str));
                numer += 50;
            }
            else if(i > 3 && i <= 7)
            {
                String str = "Towarowry" + numer;
                pasy.add(new Towarowy(str));
                numer += 50;
            }
            else
            {
                String str = "Awionetka" + numer;
                pasy.add(new Awionetka(str));
                numer+= 50;
            }
        }

        //wypisanie stanu pasow startowych:
        for(int i = 0; i < ile; i++)
        {
            System.out.println((i +1) + ": " + pasy.get(i).podajNazwe());
            Thread.sleep(1000);
        }
        Thread.sleep(2000);

        System.out.println("Liczba dostepnych pasow: " + (liczbaPasow - ile));

        if(ile == liczbaPasow)          // brak dostepnych pasow, metoda zwraca falsce
            return false;
        else
            return true;                // sa dostepne pasy, metoda zwraca true
    }
}
