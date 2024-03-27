import java.util.ArrayList;
import java.util.Scanner;

public class soal2KoleksiMain {
    private static ArrayList<soal2Antik> koleksi = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("1. Simpan barang");
            System.out.println("2. Hapus barang");
            System.out.println("3. Lihat koleksi");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    simpanBarang();
                    break;
                case 2:
                    hapusBarang();
                    break;
                case 3:
                    lihatKoleksi();
                    break;
                case 4:
                    running = false;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void simpanBarang() {
        System.out.println("Masukkan nama barang:");
        String nama = scanner.nextLine();

        System.out.println("Masukkan jenis barang:");
        String jenis = scanner.nextLine();

        System.out.println("Masukkan tahun pembuatan:");
        int tahunPembuatan = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Masukkan asal negara:");
        String asalNegara = scanner.nextLine();

        soal2Antik barang = new soal2Antik(nama, jenis, tahunPembuatan, asalNegara);
        koleksi.add(barang);
        System.out.println("Barang berhasil disimpan.");
    }

    private static void hapusBarang() {
        System.out.println("Masukkan nama barang yang ingin dihapus:");
        String namaBarang = scanner.nextLine();

        boolean removed = false;
        for (int i = 0; i < koleksi.size(); i++) {
            if (koleksi.get(i).getNama().equalsIgnoreCase(namaBarang)) {
                koleksi.remove(i);
                removed = true;
                break;
            }
        }

        if (removed) {
            System.out.println("Barang berhasil dihapus.");
        } else {
            System.out.println("Barang tidak ditemukan.");
        }
    }

    private static void lihatKoleksi() {
        if (koleksi.isEmpty()) {
            System.out.println("Koleksi kosong.");
        } else {
            System.out.println("Koleksi Barang Antik:");
            for (soal2Antik barang : koleksi) {
                System.out.println(barang);
            }
        }
    }
}
