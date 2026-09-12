import java.util.Scanner;

public class StrukBelanja {
    public static void main(String[] args) {
        // Scanner digunakan untuk membaca input dari keyboard
        Scanner sc = new Scanner(System.in);

        // Input barang 1
        System.out.print("Nama barang 1  : ");
        String nama1 = sc.nextLine();
        System.out.print("Harga satuan   : ");
        int harga1 = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah         : ");
        int jumlah1 = Integer.parseInt(sc.nextLine());

        // Input barang 2
        System.out.print("Nama barang 2  : ");
        String nama2 = sc.nextLine();
        System.out.print("Harga satuan   : ");
        int harga2 = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah         : ");
        int jumlah2 = Integer.parseInt(sc.nextLine());

        // Input barang 3
        System.out.print("Nama barang 3  : ");
        String nama3 = sc.nextLine();
        System.out.print("Harga satuan   : ");
        int harga3 = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah         : ");
        int jumlah3 = Integer.parseInt(sc.nextLine());

        // Input uang dibayar
        System.out.print("Uang dibayar   : ");
        int uangDibayar = Integer.parseInt(sc.nextLine());

        // ===== PERHITUNGAN =====
// Semua hasil hitung disimpan ke variabel dulu sebelum ditampilkan
// Tidak ada angka yang ditulis manual, semua dari hasil hitung
        int subtotal1 = harga1 * jumlah1;
        int subtotal2 = harga2 * jumlah2;
        int subtotal3 = harga3 * jumlah3;
        int totalBelanja = subtotal1 + subtotal2 + subtotal3;
        int kembalian = uangDibayar - totalBelanja;

        // Tampilkan struk
        System.out.println();
        System.out.println("===== STRUK BELANJA =====");
        System.out.println(nama1 + "  " + jumlah1 + " x " + harga1 + " = " + subtotal1);
        System.out.println(nama2 + "  " + jumlah2 + " x " + harga2 + " = " + subtotal2);
        System.out.println(nama3 + "  " + jumlah3 + " x " + harga3 + " = " + subtotal3);
        System.out.println("------------------------");
        System.out.println("Total belanja   = " + totalBelanja);
        System.out.println("Uang dibayar    = " + uangDibayar);
        System.out.println("Kembalian       = " + kembalian);

        sc.close();
    }
}