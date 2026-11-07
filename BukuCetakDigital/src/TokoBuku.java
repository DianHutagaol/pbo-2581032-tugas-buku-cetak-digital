public class TokoBuku {
    public static void main(String[] args) {
        /*
         * PESAN ERROR SAAT super(...) DIHAPUS DARI CONSTRUCTOR BukuDigital:
         *
         * error: constructor Buku in class Buku cannot be applied to given types;
         * required: java.lang.String,java.lang.String,int
         * found: no arguments
         * reason: actual and formal argument lists differ in length
         *
         * Penjelasan: Karena class Buku tidak memiliki constructor tanpa parameter (default constructor),
         * subclass WAJIB memanggil super(judul, penulis, harga) secara eksplisit pada baris pertama constructor.
         */

        System.out.println("============= KERANJANG =============");

        BukuCetak buku1 = new BukuCetak("Pemrograman Java", "John Doe", 120000, 750);
        BukuCetak buku2 = new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400);
        BukuDigital buku3 = new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5);

        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo();

        System.out.println("-------------------------------------");
        int totalBayar = buku1.hargaAkhir() + buku2.hargaAkhir() + buku3.hargaAkhir();
        System.out.println("Total bayar   : " + Buku.formatRupiah(totalBayar));
    }
}