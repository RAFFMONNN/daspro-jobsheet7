import java.util.Scanner;

public class KafeDoWhile21 {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        int totalHarga;
        do {
            System.out.println("Masukkan Nama Pelanggan (ketik 'batal' untuk keluar)");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi Dibatalkan.");
                break;
            }
            System.out.println("Jumlah Kopi:");
            kopi = sc.nextInt();
            System.out.println("Jumlah Teh");
            teh = sc.nextInt();
            System.out.println("Jumlah Roti");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp" + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua Transaksi Selesai.");


    }
}