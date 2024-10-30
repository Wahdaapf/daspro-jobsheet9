import java.util.Scanner;

public class ArrayNilai24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilaiAkhir[] = new int[10];

        for(int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukkan Nilai Akhir Mahasiswa Ke-" + (i+1) + " : ");
            nilaiAkhir[i] = input.nextInt();
        }

        for(int i = 0; i < nilaiAkhir.length; i++){
            if(nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa Ke-" + (i+1) + " Lulus!");
            } else {
                System.out.println("Mahasiswa Ke-" + (i+1) + " Tidak Lulus!");
            }
        }

        input.close();
    }
}