import java.util.Scanner;

public class NumbersGame {
    private Scanner sc = new Scanner(System.in);

    public void doesItBelongToCompartment() {
        int x;
        do {
            x = getXFromUser();
            if (x < 100) {
                System.out.println("Podana liczba jest za mała... ");
            } else if (x > 200) {
                System.out.println("Podana liczba jest za duża... ");
            } else if (x % 3 != 0) {
                System.out.println("Przedział dobry, ale liczba jest niepodzielna przez trzy... ");
            }
        } while (!((x >= 100 && x <= 200) && (x % 3) == 0));
        System.out.println("Udało Ci się! Liczba mieści się w przedziałe i jest podzielna przez trzy! ");
    }

    private int getXFromUser() {
        System.out.print("Podaj liczbę: ");
        return sc.nextInt();
    }
}
