/* Nama File    : MGaris.java
 * Deskripsi    : berisi program utama untuk menggunakan class Garis
 * Pembuat      : Nevlyn Abbel Fikri Ardho
 * Tanggal      : 6 Maret 2026
 */

public class MGaris {
    public static void main(String[] args) {
        System.out.println("=== DEMONSTRASI CLASS GARIS ===\n");

        // Test 1: Konstruktor default
        System.out.println("1. Garis dengan konstruktor default:");
        Garis g1 = new Garis();
        g1.tampilkanTitik();
        System.out.printf("Panjang: %.2f\n", g1.getPanjang());
        System.out.printf("Gradien: %.2f\n", g1.getGradien());
        System.out.println("Titik Tengah: ");
        g1.getTitikTengah().tampilkan();
        System.out.println("Persamaan: " + g1.getPersamaanGaris());
        System.out.println();

        // Test 2: Konstruktor dengan parameter
        System.out.println("2. Garis dengan titik (-2,0) dan (0,4):");
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        Garis g2 = new Garis(t1, t2);
        g2.tampilkanTitik();
        System.out.printf("Panjang: %.2f\n", g2.getPanjang());
        System.out.printf("Gradien: %.2f\n", g2.getGradien());
        System.out.println("Titik Tengah: ");
        g2.getTitikTengah().tampilkan();
        System.out.println("Persamaan: " + g2.getPersamaanGaris());
        System.out.println();

        // Test 3: Test sejajar dan tegak lurus
        System.out.println("3. Test Sejajar dan Tegak Lurus:");
        Titik t3 = new Titik(1, 1);
        Titik t4 = new Titik(3, 3);
        Garis g3 = new Garis(t3, t4); // Gradien = 1

        Titik t5 = new Titik(0, 2);
        Titik t6 = new Titik(2, 4);
        Garis g4 = new Garis(t5, t6); // Gradien = 1 (sejajar dengan g3)

        Titik t7 = new Titik(0, 3);
        Titik t8 = new Titik(1, 1);
        Garis g5 = new Garis(t7, t8); // Gradien = -2 (tegak lurus dengan g3)

        System.out.println("Garis g3 dan g4 sejajar? " + g3.adalahSejajar(g4));
        System.out.println("Garis g3 dan g5 tegak lurus? " + g3.adalahTegakLurus(g5));
        System.out.println();

        // Test 4: Counter
        System.out.println("4. Total objek Garis yang dibuat: " + Garis.getCounterGaris());
        System.out.println();

        // Test 5: Garis vertikal
        System.out.println("5. Test Garis Vertikal:");
        Titik t9 = new Titik(2, 1);
        Titik t10 = new Titik(2, 5);
        Garis g6 = new Garis(t9, t10);
        System.out.println("Persamaan: " + g6.getPersamaanGaris());
        System.out.printf("Gradien: %.2f\n", g6.getGradien());
    }
}
