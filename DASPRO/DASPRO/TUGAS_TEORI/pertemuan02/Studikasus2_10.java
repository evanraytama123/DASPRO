import java.util.Scanner;

public class Studikasus2_10 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah tabungan awal : ");
    double tabunganAwal = input.nextDouble();

    System.out.print("Masukkan lama menabung (tahun) : ");
    int lamaMenabung = input.nextInt();

    System.out.print("Masukkan bunga per tahun (dalam persen) : ");
    double presentaseBungaPerTahun = input.nextDouble(); // Misalnya 2% per tahun
    presentaseBungaPerTahun /= 100;

    //Rumus Bunga Majemuk: A = P*(1 + r)^(t)
    double tabunganAkhir = tabunganAwal * Math.pow(1 + presentaseBungaPerTahun, lamaMenabung);
    double totalBunga = tabunganAkhir - tabunganAwal;

    System.out.printf("Total Bunga Didapat : Rp%.0f\n", totalBunga);
    System.out.printf("Total Tabungan Akhir : Rp%.0f\n", tabunganAkhir);
    input.close();
    }
}
