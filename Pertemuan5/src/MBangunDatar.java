/* Nama File    : MBangunDatar.java
 * Deskripsi    : Membuat class MBangunDatar untuk menguji class Persegi dan Lingkaran
 * Pembuat      : Nevlyn Abbel Fikri Ardho
 * Tanggal      : 16 April 2026
 */
public class MBangunDatar {
    public static void main(String[] args) {

        // Membuat objek Persegi
        Persegi p1 = new Persegi(4, "Merah", "Hitam");
        System.out.println("=== Persegi ===");
        p1.printInfo();
        System.out.println("Luas: " + p1.getLuas());
        System.out.println("Keliling: " + p1.getKeliling());
        System.out.println("Diagonal: " + p1.getDiagonal());

        p1.zoomIn();
        System.out.println("Sisi setelah zoomIn: " + p1.getSisi());

        p1.zoomOut();
        System.out.println("Sisi setelah zoomOut: " + p1.getSisi());

        p1.zoom(200);
        System.out.println("Sisi setelah zoom 200%: " + p1.getSisi());

        System.out.println();

        Lingkaran l1 = new Lingkaran(14, "Biru", "Biru", "Putih");
        System.out.println("=== Lingkaran ===");
        l1.printInfo();
        System.out.println("Luas: " + l1.getLuas());
        System.out.println("Keliling: " + l1.getKeliling());
        System.out.println("Diameter: " + l1.Diagonal());

        l1.zoomIn();
        System.out.println("Jari-jari setelah zoomIn: " + l1.getJari());

        l1.zoomOut();
        System.out.println("Jari-jari setelah zoomOut: " + l1.getJari());

        l1.zoom(150);
        System.out.println("Jari-jari setelah zoom 150%: " + l1.getJari());

        System.out.println();

        System.out.println("Apakah luas sama? " + p1.isEqualLuas(l1));

        BangunDatar.printCounterBangunDatar();
    }
}
