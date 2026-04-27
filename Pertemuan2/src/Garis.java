/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Nevlyn Abbel Fikri Ardho
 * Tanggal      : 5 Maret 2026
 */

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // Konstruktor tanpa parameter
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Getter dan Setter
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    // Method panjang garis
    public double getPanjang() {
        double deltaX = titikAkhir.getX() - titikAwal.getX();
        double deltaY = titikAkhir.getY() - titikAwal.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Method gradien garis
    public double getGradien() {
        double deltaX = titikAkhir.getX() - titikAwal.getX();
        if (deltaX == 0) {
            return Double.POSITIVE_INFINITY; // Garis vertikal
        }
        return (titikAkhir.getY() - titikAwal.getY()) / deltaX;
    }

    // Method titik tengah
    public Titik getTitikTengah() {
        double xTengah = (titikAwal.getX() + titikAkhir.getX()) / 2;
        double yTengah = (titikAwal.getY() + titikAkhir.getY()) / 2;
        return new Titik(xTengah, yTengah);
    }

    // Method cek sejajar
    public boolean adalahSejajar(Garis garisLain) {
        double gradien1 = this.getGradien();
        double gradien2 = garisLain.getGradien();
        
        // Handle kasus garis vertikal (gradien tak hingga)
        if (Double.isInfinite(gradien1) && Double.isInfinite(gradien2)) {
            return true;
        }
        if (Double.isInfinite(gradien1) || Double.isInfinite(gradien2)) {
            return false;
        }
        
        return Math.abs(gradien1 - gradien2) < 1e-10; // Toleransi untuk floating point
    }

    // Method cek tegak lurus
    public boolean adalahTegakLurus(Garis garisLain) {
        double gradien1 = this.getGradien();
        double gradien2 = garisLain.getGradien();
        
        // Handle kasus garis vertikal dan horizontal
        if (Double.isInfinite(gradien1)) {
            return garisLain.getTitikAwal().getX() == garisLain.getTitikAkhir().getX() == false;
        }
        if (Double.isInfinite(gradien2)) {
            return this.getTitikAwal().getX() != this.getTitikAkhir().getX();
        }
        
        // Produk gradien = -1 untuk tegak lurus
        return Math.abs(gradien1 * gradien2 + 1) < 1e-10;
    }

    // Method tampilkan titik awal dan akhir
    public void tampilkanTitik() {
        System.out.print("Titik Awal: ");
        titikAwal.tampilkan();
        System.out.print("Titik Akhir: ");
        titikAkhir.tampilkan();
    }

    // Method persamaan garis y = mx + c
    public String getPersamaanGaris() {
        double m = getGradien();
        double x1 = titikAwal.getX();
        double y1 = titikAwal.getY();
        
        if (Double.isInfinite(m)) {
            return "x = " + String.format("%.2f", x1);
        }
        
        double c = y1 - m * x1;
        return String.format("y = %.2fx + %.2f", m, c);
    }
}
