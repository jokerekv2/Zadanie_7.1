import java.util.Scanner;

public class Numbers {
    private int x;
    private Scanner sc = new Scanner(System.in);

    public void doesItBelongToCompartment() {
        while (true) {
            setX();
            if (x >= 100 && x <= 200) {
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
            System.out.println("Udalo Ci się trafić w przedział!");
        else
            System.out.print("Lipa... ");
    }
}
