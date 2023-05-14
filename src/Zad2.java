public class Zad2 {

    public static void main(String[] args) {

        int wynik = count7(1771717395);

        System.out.println(wynik);

    }

    public static int count7(int n) {
        if (n < 1) {
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + count7(n/10);
        }

	    else return count7(n/10);
    }

}
