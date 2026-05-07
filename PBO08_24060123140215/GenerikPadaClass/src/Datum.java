/* Nama File    : Datum.java
 * Deskripsi    : Membuat class Datum sebagai generic class yang dapat menyimpan nilai dengan tipe data apa pun.
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO / 24060123140215
 * Tanggal      : 1 Mei 2026
 */

package GenerikPadaClass;

public class Datum<T> {
    private T isi;
    
    public Datum(T isi) {
        this.isi = isi;
    }
    
    public T getIsi() {
        return isi;
    }
    
    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }
    
    public void tampilkanIsi() {
        System.out.println("Isi Datum: " + isi);
    }
}
