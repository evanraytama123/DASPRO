import java.util.Scanner;

public class TugasPemilihanIf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---Cetak KRS SIAKAD---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        System.out.println(uktLunas ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA" : "Registrasi Ditolak. Silahkan Lunasi UKT Terlebih Dahulu");

        // if (uktLunas) {
        //  System.out.println("Pembayaran UKT terverifikasi");
        //  System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        // } else {
        //  System.out.println("Registrasi Ditolak. Silahkan Lunasi UKT Terlebih Dahulu");
        // }
    }
}
