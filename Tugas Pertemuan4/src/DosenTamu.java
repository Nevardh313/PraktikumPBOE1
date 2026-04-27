/* Nama File    : DosenTamu.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTamu
 * Pembuat      : Nevlyn Abbel Fikri Ardho
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate tanggalAkhirKontrak;

    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmtKerja,
                     double gajiPokok, String fakultas, String nidk, LocalDate tanggalAkhirKontrak) {
        super(nip, nama, tanggalLahir, tmtKerja, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    public double hitungTunjangan() {
        return 0.025 * getGajiPokok();
    }

    @Override
    public void printInfo() {
        System.out.println("=== DOSEN TAMU ===");
        System.out.println("NIP             : " + getNIP());
        System.out.println("NIDK            : " + nidk);
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + getTanggalLahir());
        String tmtKerja = null;
        System.out.println("TMT Kerja       : " + tmtKerja);
        String fakultas = null;
        System.out.println("Fakultas        : " + fakultas);
        String gajiPokok = null;
        System.out.println("Gaji Pokok      : " + gajiPokok);
        System.out.println("Tunjangan       : " + hitungTunjangan());
        System.out.println("Akhir Kontrak   : " + tanggalAkhirKontrak);
    }
}
