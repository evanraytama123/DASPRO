import java.util.Scanner;

public class GajiKaryawan10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int gajiPokok;
        double bonus, totalGaji;
        double tunjTransp = 600000;
        double tunjMkn = 400000;

        System.out.println("Masukkan gaji pokok: ");
        gajiPokok = sc.nextInt();

        bonus = 0.05 * gajiPokok;
        totalGaji = gajiPokok + bonus + tunjTransp + tunjMkn - 0.1 * gajiPokok;

        System.out.println("Bonus Bulanan anda adalah Rp. " + bonus);
        System.out.println("Gaji yang diterima adalah Rp. " + (int) totalGaji);
        sc.close();
    }
}