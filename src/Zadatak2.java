import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        System.out.println("Koliko visina zelite unijeti?");
        Scanner sc = new Scanner(System.in);
        int brojStudenata = Integer.parseInt(sc.nextLine());
        double[] visine = new double[brojStudenata];
        double prosjecnaVisina, sumaVisina = 0, najvisaVisina = 0, najnizaVisina = 5;
        int niziOdX = 0, studentiIznadProsjeka = 0;

        for (int i = 0; i < brojStudenata; i++) {
            System.out.println("Unesite visinu sljedeceg studenta: ");
            visine[i] = Double.parseDouble(sc.nextLine());
            sumaVisina += visine[i];

            if (visine[i] < najnizaVisina) {
                najnizaVisina = visine[i];
            }

            if (visine[i] > najvisaVisina) {
                najvisaVisina = visine[i];
            }

            if (visine[i] < 1.75) {
                niziOdX++;
            }
        }

        prosjecnaVisina = sumaVisina / brojStudenata;

        for (double v : visine) {
            if (v > prosjecnaVisina) {
                studentiIznadProsjeka++;
            }
        }

        System.out.printf("Prosjecna visina: %.2f metara%n", prosjecnaVisina);
        System.out.println("Najniza visina: " + najnizaVisina + " metara");
        System.out.println("Najvisa visina: " + najvisaVisina + " metara");
        System.out.printf("Broj studenata iznad prosjeka (%.2f): %d%n", prosjecnaVisina, studentiIznadProsjeka);
        System.out.println("Broj studenata ispod 1.75m: " + niziOdX);
    }
}
