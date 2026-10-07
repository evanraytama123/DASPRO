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
        System.out.println("peringkatJuara :");
        int peringkatJuara= scn.nextInt();
        System.out.println("Status :");
        int statusPendanaan= scn.nextInt();

        System.out.println("Nama mahasiswa : "+ namaMahasiswa);
        System.out.println("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) :" + jenisKegiatan);
        System.out.println("Jumlah dokumen : "+ jumlahDoc);
        System.out.println("Peringkat peringkatJuara : "+ peringkatJuara);
        System.out.println("Status : "+ statusPendanaan);

        if (jumlahDoc == 4) {
            if (jenisKegiatan.equals("belmawa") || jenisKegiatan.equals("bakorma")
                    || jenisKegiatan.equals("mandiri")) {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status : Dokumen lengkap, peringkatJuara " + peringkatJuara
                            + ". Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen lengkap, tetapi bukan peringkatJuara 1, 2, atau 3. "
                            + "Dana penghargaan tidak diberikan.");
                }
            } else if (jenisKegiatan.equals("pkm")) {
                if (statusPendanaan == 1) {
                    System.out.println("Status : Dokumen lengkap dan PKM lolos pendanaan. "
                            + "Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen lengkap, tetapi PKM tidak lolos pendanaan. "
                            + "Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
            }
        } else {
            System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - jumlahDoc)
                    + " dokumen). Dana penghargaan tidak diberikan.");
        }

        scn.close();
    }
}
