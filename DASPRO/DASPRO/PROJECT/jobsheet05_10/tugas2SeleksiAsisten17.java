import java.util.Scanner;

public class tugas2SeleksiAsisten17 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        String pesan = "";
        int nilaiPemrograman, sertifikatPemrograman, nilaiWawancara;
        boolean aktif, bebasKompen;

        System.out.print("Apakah mahasiswa aktif (true/false): ");
        aktif = Scanner.nextBoolean();
        System.out.print("Apakah mahasiswa sudah bebas kompen (true/false): ");
        bebasKompen = Scanner.nextBoolean();
        System.out.print("Masukkan nilai pemrograman: ");
        nilaiPemrograman = Scanner.nextInt();
        System.out.print("Masukkan jumlah sertifikat pemrograman: ");
        sertifikatPemrograman = Scanner.nextInt();

        if (aktif && bebasKompen){
            pesan = "Mahasiswa aktif dan sudah bebas kompen.";
            if (nilaiPemrograman >= 80 || sertifikatPemrograman > 0){
                pesan = "Nilai pemrograman: " + nilaiPemrograman;
                pesan = "Tahap 1 mahasiswa lolos, silahkan menuju wawancara.";
                
                System.out.print("Masukkan nilai wawancara: ");
                nilaiWawancara = Scanner.nextInt();

                if (nilaiWawancara >= 75) {
                    pesan = "Nilai wawancara: " + nilaiWawancara;
                    pesan = "Mahasiswa lolos 2 seleksi dan menjadi asisten LAB.";
                } else {
                    pesan = "Nilai wawancara: " + nilaiWawancara;
                    pesan = "Mahasiswa tidak lolos seleksi asisten.";
                }

            } else{
                pesan = "Nilai pemrograman: " + nilaiPemrograman;
                pesan = "Jumlah sertifikat: " + sertifikatPemrograman;
                pesan = "Mahasiswa tidak lolos tahap 2.";
            }
        } else{
            if(!aktif){
                pesan = "Mahasiswa tidak aktif.";
            }
            if(!bebasKompen){
                pesan = "Mahasiswa belum bebas kompen.";
            }
            pesan = "Mahasiswa tidak lolos tahap 1.";
        }
        System.out.println(pesan);
    }
}
