public class Zad6 {

    // pierwszy wyraz ciągu, różnicę i numer wyrazu który ma wyliczyć

    public static void main(String[] args) {
        int pierwszyWyraz = 1;  // przykładowy pierwszy wyraz
        int roznica = 2;  // przykładowa różnica
        int n = 5;  // numer wyrazu, który ma być obliczony

        int wynik = obliczWyrazCiagu(pierwszyWyraz, roznica, n);

        System.out.println("Wyraz nr " + n + " ciągu arytmetycznego: " + wynik);
    }

    public static int obliczWyrazCiagu(int pierwszyWyraz, int roznica, int n) {
        if (n == 1) {
            return pierwszyWyraz;
        } else {
            return obliczWyrazCiagu(pierwszyWyraz, roznica, n - 1) + roznica;
        }
    }
}
