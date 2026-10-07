import java.util.Scanner;

public class Latihan3_10 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Masukkan Merk Sepatu");
        String merk = sc.nextLine();

        System.out.println("Masukkan Kategori Sepatu");
        String kategori = sc.nextLine();

        System.out.println("Masukkan Size Sepatu");
        int size = sc.nextInt();

        int harga = 0;

        if (merk.equals("Converse")) {
            if (kategori.equals("Slip On")) {
                if (size >= 36) {
                    if (size  <= 40) {
                        harga = 800000;

                    }
                }
            } else if (kategori.equals("High Top")) {
                if (size >= 40) {
                    if (size <= 44) {
                        harga = 1200000;

                    }
                }
            }
        } else if (merk.equals("Skechers")) {
            if (kategori.equals("Woman")) {
                if (size >= 36) {
                    if (size <= 41) {
                        harga = 1000000;
                    }
                }
            } else if (kategori.equals("Man")) {
                if (size >= 36) {
                    if (size <= 40) {
                        harga = 1800000;

                    }
                }
            }
        } else if (merk.equals("Nike")) {
            if (kategori.equals("Kids")) {
                if (size >= 36) {
                    if (size <= 40) {
                        harga = 750000;
                    }
                }
            } else if (kategori.equals("Adult")) {
                if (size >= 40) {
                    if (size <= 44) {
                        harga = 1500000;
                    }
                }
            }
        } else {
            System.out.println("Merk Tidak Valid");
        }

        if (harga > 0) {
            System.out.println("Harga Sepatu: Rp" + harga);
        }

        sc.close();

    }
}
