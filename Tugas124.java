import java.util.Scanner;

public class Tugas124 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahMhs = 0;
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        jumlahMhs = input.nextInt();

        int [] nilaiMhs = new int[jumlahMhs];
        double total = 0;
        double rata2;
        int nilaiTinggi = 0, nilaiRendah = 100;

        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + " : ");
            nilaiMhs[i] = input.nextInt();
        }

        for(int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
            if(nilaiMhs[i] > nilaiTinggi) {
                nilaiTinggi = nilaiMhs[i];
            }
            if(nilaiMhs[i] < nilaiRendah) {
                nilaiRendah = nilaiMhs[i];
            }
        }

        rata2 = total / nilaiMhs.length;

        System.out.println();
        System.out.println("--- Output ---");
        System.out.println("Nilai Rata Rata : " + rata2);
        System.out.println("Nilai Tertinggi " + nilaiTinggi);
        System.out.println("Nilai Terendah " + nilaiRendah);
        System.out.println("Daftar Mahasiswa");
        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.println("Mahasiswa ke-" + (i+1) + " Nilai : " + nilaiMhs[i]);
        }

        input.close();
    }
}
