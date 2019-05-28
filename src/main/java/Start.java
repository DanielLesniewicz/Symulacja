/** Główna klasa odpowiedzialna za uruchomienie programu
 *
 * @author Daniel Leśniewicz (lider grupy), Patryk Fidrych
 * Program "Symulacja lotniska" został stworzony na potrzebę projektu związanego z kursem Programowanie Obiektowe w drugim semestrze studiów (2018/2019) na kierunku Informatyka
 *
 * */
public class Start {
    public static void main(String[] args) throws InterruptedException
    {
        /** Ilość samolotów, które wezmą udział w symulacji */
        final int ileSamolotow = 10 ;        // przechowuje dla ilu cykli samolotu mamy wykonac symulacje

        WiezaKontroliLotow wieza = new WiezaKontroliLotow();


        System.out.println("SYMULACJA ROZPOCZĘTA");

        for(int i = 0; i < ileSamolotow; i++)
        {
            System.out.println("");
            int pozycja = PozycjaSamolotu.podajPozycje();   // zmienna przechowuje gdzie znajduje sie samolot, 1- na ladzie, 2 - w powietrzu
            Thread.sleep(2000);

            if(pozycja == 1)                                // gdy samolot jest na ladzie
            {
                wieza.PrzygotowanieDoStartu();
            }
            else                                            // gdy samolot jest w powietrzu
                wieza.przygotowanieDoLadowania();
        }
    }
}
