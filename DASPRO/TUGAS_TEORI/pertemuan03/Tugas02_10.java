import java.util.Scanner;

public class Tugas02_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahLembar;
        double hargaPerLembar = 500;
        double biayaPenjilidan = 5000;
        double totalBiaya;
        
        System.out.print("Masukkan jumlah lembar dokumen yang dicetak: ");
        jumlahLembar = sc.nextInt();
        
        // Menghitung total biaya (jumlah lembar * 500 + biaya penjilidan 5000)
        totalBiaya = (jumlahLembar * hargaPerLembar) + biayaPenjilidan;
        
        System.out.println("\n--- Rincian Biaya ---");
        System.out.println("Biaya cetak (" + jumlahLembar + " lembar) : Rp. " + (jumlahLembar * hargaPerLembar));
        System.out.println("Biaya penjilidan               : Rp. " + biayaPenjilidan);
        System.out.println("Total biaya yang harus dibayar adalah: Rp. " + totalBiaya);
        sc.close();
    }
}