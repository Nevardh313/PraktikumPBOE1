/* Nama File    : DosenTetap.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTetap
 * Pembuat      : Nevlyn Abbel Fikri Ardho
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private String nidn;
    private final int BUP = 65;

    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmtKerja,
                      double gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmtKerja, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public double hitungTunjangan() {
        int masaKerja = hitungMasaKerja();
        return 0.02 * masaKerja * getGajiPokok();
    }

    private int hitungMasaKerja() {
        throw new UnsupportedOperationException("Unimplemented method 'hitungMasaKerja'");
    }

    @Override
    public void printInfo() {
        System.out.println("=== DOSEN TETAP ===");
        System.out.println("NIP           : " + getNIP());
        System.out.println("NIDN          : " + nidn);
        System.out.println("Nama          : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggalLahir());
        String tmtKerja = null;
        System.out.println("TMT Kerja     : " + tmtKerja);
        System.out.println("Masa Kerja    : " + hitungMasaKerja() + " tahun");
        String fakultas = null;
        System.out.println("Fakultas      : " + fakultas);
        String gajiPokok = null;
        System.out.println("Gaji Pokok    : " + gajiPokok);
        System.out.println("Tunjangan     : " + hitungTunjangan());
        System.out.println("Tanggal Pensiun : " + hitungTanggalPensiun(BUP));
        System.out.println();
    }

    private String hitungTanggalPensiun(int bUP2) {
        throw new UnsupportedOperationException("Unimplemented method 'hitungTanggalPensiun'");
    }
}
