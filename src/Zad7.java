public class Zad7 {

    //program dostaje pierwszy wyraz ciągu, iloraz i numer wyrazu który ma wyliczyć

    public static double obliczWyraz(double pierwszyWyraz, double iloraz, int n) {
        if (n == 1) {
            return pierwszyWyraz;
        }
        return iloraz * obliczWyraz(pierwszyWyraz, iloraz, n - 1);
    }

    public static void main(String[] args) {

        double pierwszyWyraz = 2.0;
        double iloraz = 3.0;
        int n = 5;

        double wynik = obliczWyraz(pierwszyWyraz, iloraz, n);

        System.out.println("Wyraz " + n + " ciągu geometrycznego wynosi: " + wynik);
    }
}
