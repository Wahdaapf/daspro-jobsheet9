import java.util.Scanner;

public class ArrayRataNilai24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahMhs = 0;
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        jumlahMhs = input.nextInt();

        int [] nilaiMhs = new int[jumlahMhs];
        double total = 0;
        double rata2;
        int totalNilaiDiatas70 = 0;

        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan Nilai Akhir Mahasiswa Ke-" + (i+1) + " : ");
            nilaiMhs[i] = input.nextInt();
        }

        for(int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
            if(nilaiMhs[i] > 70) {
                totalNilaiDiatas70++;
            }
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Nilai Rata Rata : " + rata2);
        System.out.println("Jumlah Mahasiswa Yang mendapatkan nilai diatas 70 : " + totalNilaiDiatas70);

        input.close();
    }
}