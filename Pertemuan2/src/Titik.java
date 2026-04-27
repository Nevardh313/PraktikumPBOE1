/* Nama File    : Titik.java
 * Deskripsi    : berisi program utama untuk menggunakan class Titik
 * Pembuat      : Nevlyn Abbel Fikri Ardho
 * Tanggal      : 27 Febuari 2026
 */

public class Titik {
    private double x;
    private double y;

    // Konstruktor default
    public Titik() {
        this.x = 0;
        this.y = 0;
    }

    // Konstruktor dengan parameter
    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter dan Setter
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Method untuk menampilkan titik
    public void tampilkan() {
        System.out.printf("(%.2f, %.2f)\n", x, y);
    }
}
