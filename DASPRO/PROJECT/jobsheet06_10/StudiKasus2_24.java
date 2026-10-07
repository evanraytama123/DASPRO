import java.util.Scanner;

public class StudiKasus2_24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nama mahasiswa :");
        String namaMahasiswa= scn.next();
        System.out.println("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) :");
        String jenisKegiatan= scn.next();
        System.out.println("Jumlah dokumen :");
        int jumlahDoc=scn.nextInt();
        System.out.println("Peringkat juara :");
        int peringkatJuara= scn.nextInt();
        System.out.println("Status :");
        int statusPendanaan= scn.nextInt();

        System.out.println("Nama mahasiswa : "+ namaMahasiswa);
        System.out.println("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) :" + jenisKegiatan);
        System.out.println("Jumlah dokumen : "+ jumlahDoc);
        System.out.println("Nama mahasiswa : "+ namaMahasiswa);

    }
}