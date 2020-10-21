import java.util.Scanner;

public class NumbersGame {
    private int x;
    private Scanner sc = new Scanner(System.in);

    public void doesItBelongToCompartment() {
        while (true) {
            setX();
            if ((x >= 100 && x <= 200) && (x % 3) == 0) {
                printInfo(true);
                break;
            } else {
                printInfo(false);
            }
        }
    }

    private void setX() {
        System.out.print("Podaj liczbę: ");
        x = sc.nextInt();
    }

    private void printInfo(boolean yesOrNo) {
        if (yesOrNo)
            System.out.println("Udalo Ci się trafić!");
        else
            System.out.print("Lipa... ");
    }
}
