import java.util.Scanner;

public class Latihan2_10 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

    System.out.println("Masukkan Hari");
    String hari = sc.nextLine();
    
    System.out.println("Masukkan Jenis Buku");
    String buku = sc.nextLine();

    System.out.println("Masukkan Jumlah Buku");
    int jumlah = sc.nextInt();

    System.out.println("Harga Buku");
    double harga = sc.nextDouble();

    double diskon;

    if (hari.equals("Rabu")) {
        if (buku.equals("Kamus")) {
            diskon = 10;
            if (jumlah > 2) {
                diskon = diskon + 2;
            }
        } else {
            if (buku.equals("Novel")) {
                diskon = 7;
                if (jumlah > 3) {
                    diskon = diskon + 2;
                } else {
                    diskon = diskon + 1;
                }
            } else {
                if (jumlah > 3) {
                    diskon = 5;
                } else {
                    diskon = 0;
                }
            }
        }
        
    } else {
        // Selain hari rabu
        diskon = 0;
        }

        double subTotal = harga * jumlah;
        double totalDiskon = subTotal * diskon / 100;
        double totalBayar = subTotal - totalDiskon;

        System.out.println("Jenis Buku      :" + buku);
        System.out.println("Jumlah Buku     :" + jumlah);
        System.out.println("Subtotal        :Rp" + subTotal);
        System.out.println("Total Diskon    :" + diskon + "% (Rp" + totalDiskon + ")");
        System.out.println("Total Bayar     :Rp"+ totalBayar);

        sc.close();
    }
}
