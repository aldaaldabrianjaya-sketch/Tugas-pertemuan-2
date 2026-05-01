
import java.util.Scanner;

public class Latihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaBarang;
        int harga;
        int jumlah;
        int total;

        System.out.println("=== Kantin Simpel ===");

        System.out.print("Masukkan Nama Barang: ");
        namaBarang = input.nextLine(); 

        System.out.print("Masukkan Harga: ");
        harga = input.nextInt(); 

        System.out.print("Masukkan Jumlah: ");
        jumlah = input.nextInt();

       
        total = harga * jumlah;

        System.out.println("-----------------------");
        System.out.println("Item: " + namaBarang);
        System.out.println("Total Bayar: Rp " + total);
    }
}
