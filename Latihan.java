
import java.util.Scanner;

public class Latihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel sesuai tipe data di modul
        String namaBarang;
        int harga;
        int jumlah;
        int total;

        System.out.println("=== Kantin Simpel ===");

        System.out.print("Masukkan Nama Barang: ");
        namaBarang = input.nextLine(); // Input String

        System.out.print("Masukkan Harga: ");
        harga = input.nextInt(); // Input Integer

        System.out.print("Masukkan Jumlah: ");
        jumlah = input.nextInt();

        // Menggunakan operator aritmatika perkalian (*)[cite: 3]
        total = harga * jumlah;

        System.out.println("-----------------------");
        System.out.println("Item: " + namaBarang);
        System.out.println("Total Bayar: Rp " + total);
    }
}
