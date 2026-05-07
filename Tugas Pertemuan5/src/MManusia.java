/* Nama File    : MManusia.java
 * Deskripsi    : Membuat class Main untuk menguji class Pengusaha dan Pekerja
 * Pembuat      : Nevlyn Abbel Fikri Ardho / 24060124120026
 * Tanggal      : 16 April 2026
 */
import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {

        // Membuat objek PNS
        PNS pns1 = new PNS(
            "Budi Santoso",
            LocalDate.of(2015, 5, 10),
            "Jakarta",
            5000000,
            "1987654321"
        );

        // Membuat objek Pengusaha
        Pengusaha pengusaha1 = new Pengusaha(
            "Siti Aminah",
            LocalDate.of(2018, 3, 15),
            "Bandung",
            10000000,
            "09.876.543.2-123.000"
        );

        // Membuat objek Petani
        Petani petani1 = new Petani(
            "Joko",
            LocalDate.of(2020, 1, 1),
            "Yogyakarta",
            3000000,
            "Sleman"
        );

        // Menampilkan info
        System.out.println("=== DATA PNS ===");
        pns1.cetakInfo();
        System.out.println("Masa Kerja: " + pns1.hitungMasaKerja() + " tahun");
        System.out.println("Pajak: Rp " + pns1.hitungPajak());

        System.out.println("\n=== DATA PENGUSAHA ===");
        pengusaha1.cetakInfo();
        System.out.println("Masa Kerja: " + pengusaha1.hitungMasaKerja() + " tahun");
        System.out.println("Pajak: Rp " + pengusaha1.hitungPajak());

        System.out.println("\n=== DATA PETANI ===");
        petani1.cetakInfo();
        System.out.println("Masa Kerja: " + petani1.hitungMasaKerja() + " tahun");
        System.out.println("Pajak: Rp " + petani1.hitungPajak());

        // Menampilkan jumlah objek
        System.out.println("\n=== JUMLAH OBJEK ===");
        System.out.println("Total Manusia: " + Manusia.getCounterMns());
        System.out.println("Total PNS: " + PNS.getCounterPNS());
        System.out.println("Total Pengusaha: " + Pengusaha.getCounterPengusaha());
        System.out.println("Total Petani: " + Petani.getCounterPetani());
    }
}
