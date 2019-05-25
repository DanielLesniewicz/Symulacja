public class Odliczanie {

    /** Wyświetla odliczanie
     * @param sekundy Ilość sekund do wyświetlenia*/
    public static void odliczaj(int sekundy)
    {
        long current = System.currentTimeMillis();
        int i = sekundy;
        while (i > 0) {
            if (System.currentTimeMillis() - current > 1000) {
                System.out.println(i--);
                current = System.currentTimeMillis();
            }
        }
    }
}
