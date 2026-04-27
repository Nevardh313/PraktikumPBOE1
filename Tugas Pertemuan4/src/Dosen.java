/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Nevlyn Abbel Fikri Ardho
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;

public class Dosen extends Pegawai {
    private String Fakultas;

    public Dosen(String nip, String nama, String tanggalLahir, String tmtKerja, double gajiPokok, String fakultas, String Fakultas) {
        super(nip, nama, tanggalLahir, tmtKerja, gajiPokok);
        this.Fakultas = Fakultas;
    }

    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmtKerja, double gajiPokok,
            String fakultas2) {
    }

    public double hitungTunjangan() {
        throw new UnsupportedOperationException("Unimplemented method 'hitungTunjangan'");
    }
}
