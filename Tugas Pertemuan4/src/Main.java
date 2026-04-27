/* Nama File    : Main.java
 * Deskripsi    : berisi atribut dan method dalam class Main
 * Pembuat      : Nevlyn Abbel Fikri Ardho
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        DosenTetap dt = new DosenTetap(
                "1987654321",
                "Budi Santoso",
                LocalDate.of(1980, 5, 10),
                LocalDate.of(2010, 1, 1),
                7000000,
                "Fakultas Teknik",
                "001234567"
        );

        DosenTamu dtu = new DosenTamu(
                "1999999999",
                "Siti Aminah",
                LocalDate.of(1985, 7, 20),
                LocalDate.of(2022, 3, 1),
                6000000,
                "Fakultas Ekonomi",
                "009876543",
                LocalDate.of(2026, 12, 31)
        );

        Tendik tendik = new Tendik(
                "1977777777",
                "Andi Wijaya",
                LocalDate.of(1975, 2, 15),
                LocalDate.of(2005, 6, 1),
                5000000,
                "Akademik"
        );

        dt.printInfo();
        dtu.printInfo();
        tendik.printInfo();
    }
}
