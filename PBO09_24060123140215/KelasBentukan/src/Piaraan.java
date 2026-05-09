/* Nama File    : Piaraan.java
 * Deskripsi    : Class Piaraan
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO / 24060123140215
 * Tanggal      : 8 Mei 2026
 */

package KelasBentukan;

import java.util.ArrayList;
import java.util.List;

public class Piaraan<T extends Anabul> {
    private List<T> Lanabul;
    private int nbelm;

    public Piaraan() {
        this.Lanabul = new ArrayList<>();
        this.nbelm = 0;
    }

    // i. getNbelm()
    public int getNbelm() {
        return Lanabul.size();
    }

    // ii. enqueueAnabul (Menambah ke akhir antrean)
    public void enqueueAnabul(T anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    // iii. isMember (Mengecek apakah anabul ada dalam antrean)
    public boolean isMember(T anabul) {
        return Lanabul.contains(anabul);
    }

    // iv. getAnabul (Melihat elemen pertama tanpa menghapus)
    public T getAnabul() {
        if (!Lanabul.isEmpty()) {
            return Lanabul.get(0);
        }
        return null;
    }

    // v. dequeueAnabul (Mengambil dan menghapus elemen pertama)
    public T dequeueAnabul() {
        if (!Lanabul.isEmpty()) {
            nbelm--;
            return Lanabul.remove(0);
        }
        return null;
    }

    // c. showAnabul (Menampilkan nama panggilan)
    public void showAnabul() {
        System.out.println("Daftar Nama Panggilan Anabul:");
        for (T a : Lanabul) {
            System.out.println("- " + a.getNama());
        }
    }

    // d. countKucing (Menghitung keluarga kucing: Kucing, Anggora, KembangTelon)
    public int countKucing() {
        int count = 0;
        for (T a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    // e. bobotKucing (Menghitung total bobot keluarga kucing)
    public double bobotKucing() {
        double totalBobot = 0;
        for (T a : Lanabul) {
            if (a instanceof Kucing) {
                // Casting ke Kucing untuk mengakses method getBobot()
                totalBobot += ((Kucing) a).getBobot();
            }
        }
        return totalBobot;
    }

    // f. showJenisAnabul (Nama panggilan + jenis objek/class)
    public void showJenisAnabul() {
        System.out.println("Daftar Anabul dan Jenisnya:");
        for (T a : Lanabul) {
            System.out.println("- Nama: " + a.getNama() + " | Jenis: " + a.getClass().getSimpleName());
        }
    }
}
