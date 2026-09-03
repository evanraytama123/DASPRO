import java.util.Scanner;

public class Studikasus1_10{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int panjang;
        int lebar;
        int keliling;

        // Tambahkan petunjuk input
        System.out.print("Masukkan panjang: ");
        panjang = input.nextInt();

        System.out.print("Masukkan lebar: ");
        lebar = input.nextInt();

        keliling = 2 * (panjang + lebar);

        System.out.println("Keliling: " + keliling);

        input.close();
    }
}


//  Menentukan Algoritma
// // Input: panjang, lebar
// // Output: keliling
// // Proses:
// // input panjang, lebar
// // kelililing = 2 x (panjang + lebar)
// // Output keliling
// . Mengindentifikasi variable dan jenis tipe data berdasarkan algoritma
// panjang : int
// lebar : int
// keliling : int