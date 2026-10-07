import java.util.Scanner;

public class Tugas05_2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Layanan;
        System.out.println("Masukkan Layanan");
        Layanan = input.nextInt();

        switch (Layanan) {
            case 1:
                System.out.println("Legalisir Ijazah");
                System.out.println("Loket A");
                break;
            case 2:
                System.out.println("Surat Keterangan Aktif Kuliah");
                System.out.println("Loket B");
                break;
            case 3:
                System.out.println("Pembayaran UKT");
                System.out.println("Loket C");
                break;
            case 4:
                System.out.println("Pengajuan Cuti Akademik");
                System.out.println("Loket D");
                break;
            default:
                System.out.println("Layanan tidak valid");
                break;
        }
    }
}
