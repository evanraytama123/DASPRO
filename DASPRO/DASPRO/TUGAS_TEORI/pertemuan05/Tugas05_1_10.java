import java.util.Scanner;
public class Tugas05_1_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Lamaparkir;
        int tarif;

        System.out.println("Masukkan lama parkir (Jam):");
        Lamaparkir = input.nextInt();

        if (Lamaparkir <= 2){
            tarif = 2000;
        } else {
            tarif = 2000 + (Lamaparkir - 2) * 1000;

        }
        System.out.println("Tarif parkir: " + tarif);
        input.close();
    }
}