/* Nama File    : Anabul.java
 * Deskripsi    : Membuat class Anabul sebagai kelas dasar untuk berbagai jenis hewan peliharaan (Anabul = Anak Bulu) 
                  dengan atribut nama dan method gerak serta bersuara. Kelas ini akan menjadi parent class untuk kelas Anjing dan Burung
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO / 24060123140215
 * Tanggal      : 8 Mei 2026
 */

package KelasBentukan;

public class Anabul {
    protected String nama;
    
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    public void bersuara() {
        System.out.println(nama + " bersuara...");
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
