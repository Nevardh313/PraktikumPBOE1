/* Nama File    : Teman.java
 * Deskripsi    : Kelas koleksi nama teman menggunakan ArrayList
 * Pembuat      : Nevlyn Abbel Fikri Ardho / 24060123140215
 * Tanggal      : 8 Mei 2026
 */

package KelasDasar;

import java.util.ArrayList;
import java.util.List;

public class Teman {
    private int nbelm;           // Banyaknya elemen
    private List<String> Lnama;  // Koleksi list nama teman
    
    // Konstruktor - menginstantiasi Lnama
    public Teman() {
        this.nbelm = 0;
        this.Lnama = new ArrayList<>();
    }
    
    // a. getNbelm() - Mengembalikan banyaknya elemen
    public int getNbelm() {
        return nbelm;
    }
    
    // b. getNama(indeks) - Mengembalikan nama pada indeks tertentu
    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return Lnama.get(indeks);
        }
        return null;
    }
    
    // c. setNama(indeks, nama) - Mengganti nama pada indeks tertentu
    public boolean setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < nbelm && nama != null && !nama.trim().isEmpty()) {
            Lnama.set(indeks, nama);
            return true;
        }
        return false;
    }
    
    // d. addNama(nama) - Menambahkan nama baru
    public boolean addNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            Lnama.add(nama);
            nbelm++;
            return true;
        }
        return false;
    }
    
    // e. delNama(nama) - Menghapus nama tertentu
    public boolean delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
            return true;
        }
        return false;
    }
    
    // f. isMember(nama) - Mengecek apakah nama ada dalam list
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }
    
    // g. gantiNama(nama, namabaru) - Mengganti nama lama dengan nama baru
    public boolean gantiNama(String namaLama, String namaBaru) {
        if (namaLama != null && namaBaru != null && !namaLama.trim().isEmpty() 
            && !namaBaru.trim().isEmpty() && isMember(namaLama)) {
            int indeks = Lnama.indexOf(namaLama);
            Lnama.set(indeks, namaBaru);
            return true;
        }
        return false;
    }
    
    // h. countNama(nama) - Menghitung kemunculan nama tertentu
    public int countNama(String nama) {
        return (int) Lnama.stream().filter(n -> n.equalsIgnoreCase(nama)).count();
    }
    
    // i. showTeman() - Menampilkan semua nama teman
    public void showTeman() {
        System.out.println("\n=== DAFTAR TEMAN (" + nbelm + " orang) ===");
        if (nbelm == 0) {
            System.out.println("Belum ada teman dalam daftar.");
        } else {
            for (int i = 0; i < nbelm; i++) {
                System.out.println((i + 1) + ". " + Lnama.get(i));
            }
        }
        System.out.println("================================");
    }
}
