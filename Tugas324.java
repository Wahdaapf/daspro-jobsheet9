import java.util.Scanner;

public class Tugas324 {
    public static void main(String[] args) {
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", 
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Daftar Menu Kafe ---");
        for (String item : menu) {
            System.out.println("- " + item);
        }
        System.out.println();

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = scanner.nextLine();
        
        boolean ditemukan = false;
        for (String item : menu) {
            if (item.equalsIgnoreCase(makananDicari)) {
                ditemukan = true;
                break;
            }
        }
        
        if (ditemukan) {
            System.out.println("Makanan \"" + makananDicari + "\" tersedia di menu.");
        } else {
            System.out.println("Makanan \"" + makananDicari + "\" tidak tersedia di menu.");
        }
        
        scanner.close();
    }
}
