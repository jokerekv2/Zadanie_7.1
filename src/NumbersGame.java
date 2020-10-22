import java.util.Scanner;

public class NumbersGame {
    private Scanner sc = new Scanner(System.in);

    public void doesItBelongToCompartment() {
        while (true) {
            int x = setX();
            if ((x >= 100 && x <= 200) && (x % 3) == 0) {
                System.out.println("Udalo Ci się trafić!");
                break;
            } else if (x < 100) {
                System.out.print("Lipa... Podana liczba jest za mała. ");
            } else if ((x >= 100 && x <= 200) && (x % 3) != 0) {
                System.out.print("Lipa... Podana liczba jest w przedziale, ale nie jest podzielna przez 3. ");
            } else {
                System.out.println("Lipa... Podana liczba jest za duża. ");
            }
        }
    }

    private int setX() {
        System.out.print("Podaj liczbę: ");
        return sc.nextInt();
    }


}
