import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite iznos koji treba vratiti: ");
        double iznos = Double.parseDouble(sc.nextLine());
        double[] novcanice = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        int brojNovcanica;

        System.out.println("Morate uzvratiti: ");
        for (double v : novcanice) {
            if ((iznos / v) >= 1) {
                brojNovcanica = (int) (iznos / v);
                iznos -= brojNovcanica * v;
                System.out.println(brojNovcanica + "*" + v);
            }
        }
    }
}