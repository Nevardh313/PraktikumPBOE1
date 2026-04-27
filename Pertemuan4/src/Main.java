/* Nama File    : Main.java
 * Deskripsi    : berisi atribut dan method dalam class Main
 * Pembuat      : Nevlyn Abbel Fikri Ardho
 * Tanggal      : 12 Maret 2026
*/


public class Main {
    public static void main(String[] args) {

        // Membuat objek Persegi
        Persegi p1 = new Persegi(5, "Merah", "Hitam");
        Persegi p2 = new Persegi(10, "Biru", "Putih");

        // Membuat objek Lingkaran
        Lingkaran l1 = new Lingkaran(14, 1, "Kuning", "Hitam"); // diameter 14
        Lingkaran l2 = new Lingkaran(20, 1, "Hijau", "Putih");  // diameter 20

        // Menampilkan informasi Persegi
        System.out.println("=== DATA PERSEGI 1 ===");
        p1.printInfo();
        System.out.println("Luas: " + p1.getLuas());
        System.out.println("Keliling: " + p1.getKeliling());
        System.out.println("Diagonal: " + p1.getDiagonal());

        System.out.println("\n=== DATA PERSEGI 2 ===");
        p2.printInfo();
        System.out.println("Luas: " + p2.getLuas());
        System.out.println("Keliling: " + p2.getKeliling());
        System.out.println("Diagonal: " + p2.getDiagonal());

        // Menampilkan informasi Lingkaran
        System.out.println("\n=== DATA LINGKARAN 1 ===");
        l1.printInfo();
        System.out.println("Luas: " + l1.getLuas());
        System.out.println("Keliling: " + l1.getKeliling());

        System.out.println("\n=== DATA LINGKARAN 2 ===");
        l2.printInfo();
        System.out.println("Luas: " + l2.getLuas());
        System.out.println("Keliling: " + l2.getKeliling());

        // Menampilkan jumlah bangun datar yang dibuat
        System.out.println("\n=== TOTAL OBJEK BANGUN DATAR ===");
        BangunDatar.getCounterBangunDatar();
    }
}
