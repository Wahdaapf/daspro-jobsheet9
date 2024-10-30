import java.util.Scanner;

public class SearchNilai24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jmlMhs = 0;
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        jmlMhs = input.nextInt();

        int[] arrNilai = new int[jmlMhs];
        int key = 0;

        for(int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i) + " : ");
            arrNilai[i] = input.nextInt();
        }

        System.out.print("Masukkan Nilai Yang Ingin Dicari : ");
        key = input.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                System.out.println("\nNilai " + key + " ketemu di mahasiswa ke-" + i + "\n");
                break;
            } 
            if (i == arrNilai.length - 1) {
                System.out.println("Nilai yang dicari tidak ditemukan");
            }
        }

        input.close();
    }
}