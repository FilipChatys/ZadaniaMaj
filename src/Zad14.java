public class Zad14 {

//We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and
// big bars (5 kilos each). Return the number of small bars to use, assuming we always use
// big bars before small bars. Return -1 if it can't be done.

    public static int makeChocolate(int small, int big, int goal) {

        int bigBar = 5;
        int smallBar = 1;
        int roznica = 0;
        int wynik = 0;

        if (goal - big * bigBar < 0 || goal - big * bigBar - small * small > 0) {
            return -1;
        } else if (goal - big * bigBar > 0) {
            roznica = goal - big * bigBar;
        }
        if (roznica - small * smallBar > 0) {
            return -1;
        } else if (roznica - small * smallBar <= 0) {
            wynik = roznica;
        }
        return wynik;
    }

        public static void main(String[] args) {

        int wynik = makeChocolate(4,1,9);

        System.out.println(wynik);
    }
}

