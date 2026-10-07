import java.util.Scanner;

public class TugasPemilihan10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---Masukkan Jumlah SKS---");
        System.out.print("Jumlah SKS: ");
        int jumlahSKS = sc.nextInt();

        if (jumlahSKS > 24) {
            System.out.println("Melebihi Batas");
        } else {
            System.out.println("KRS Valid");
        }
    }
}
