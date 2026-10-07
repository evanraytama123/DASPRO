import java.util.Scanner;

public class Tugas01_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double hargaLaptop, uangMuka, sisaHarga, totalBunga, totalHutang, cicilanPerBulan;
        int jumlahBulan;
        double bungaPerBulan = 0.02; // Bunga tetap 2% per bulan dari sisa harga setelah uang muka
        
        System.out.print("Masukkan harga laptop (Rp): ");
        hargaLaptop = sc.nextDouble();
        
        System.out.print("Masukkan uang muka (Rp): ");
        uangMuka = sc.nextDouble();
        
        System.out.print("Masukkan lama cicilan (dalam bulan): ");
        jumlahBulan = sc.nextInt();
        
        // Sisa harga setelah dipotong uang muka
        sisaHarga = hargaLaptop - uangMuka;
        
        // Total bunga selama masa cicilan (bunga 2% per bulan dihitung dari sisa harga dikali jumlah bulan)
        totalBunga = sisaHarga * bungaPerBulan * jumlahBulan;
        
        // Total yang harus dicicil (sisa harga ditambah total bunga)
        totalHutang = sisaHarga + totalBunga;
        
        // Besar cicilan per bulan
        cicilanPerBulan = totalHutang / jumlahBulan;
        
        System.out.println("\n--- Rincian Cicilan ---");
        System.out.println("Sisa harga setelah DP : Rp. " + sisaHarga);
        System.out.println("Total bunga           : Rp. " + totalBunga);
        System.out.println("Cicilan yang harus dibayar Rina setiap bulan adalah: Rp. " + cicilanPerBulan);
        sc.close();
    }
}
