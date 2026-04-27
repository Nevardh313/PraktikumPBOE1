/* Nama File    : Tendik.java
 * Deskripsi    : berisi atribut dan method dalam class Tendik
 * Pembuat      : Nevlyn Abbel Fikri Ardho
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;

public class Tendik extends Pegawai {
    private String bidang;
    private final int BUP = 55;

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmtKerja,
                  double gajiPokok, String bidang) {
        super();
        this.bidang = bidang;
    }

    public double hitungTunjangan() {
        int masaKerja = hitungMasaKerja();
        return 0.01 * masaKerja * getGajiPokok();
    }

    private int hitungMasaKerja() {
        throw new UnsupportedOperationException("Unimplemented method 'hitungMasaKerja'");
    }

    @Override
    public void printInfo() {
        System.out.println("=== TENAGA KEPENDIDIKAN ===");
        System.out.println("NIP             : " + getNIP());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + getTanggalLahir());
        String tmtKerja = null;
        System.out.println("TMT Kerja       : " + tmtKerja);
        System.out.println("Masa Kerja      : " + hitungMasaKerja() + " tahun");
        System.out.println("Bidang          : " + bidang);
        String gajiPokok = null;
        System.out.println("Gaji Pokok      : " + gajiPokok);
        System.out.println("Tunjangan       : " + hitungTunjangan());
        System.out.println("Tanggal Pensiun : " + hitungTanggalPensiun(BUP));
        System.out.println();
    }

    private String hitungTanggalPensiun(int bUP2) {
        throw new UnsupportedOperationException("Unimplemented method 'hitungTanggalPensiun'");
    }
}
