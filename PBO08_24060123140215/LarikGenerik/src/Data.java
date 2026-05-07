/* Nama File    : Data.java
 * Deskripsi    : Membuat class Data sebagai generic class untuk menyimpan elemen-elemen dengan tipe data yang spesifik.
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO / 24060123140215
 * Tanggal      : 1 Mei 2026
 */

package LarikGenerik;

public class Data<T> {
    private T[] ruang;  
    private int banyak; 
    
    // Konstruktor
    @SuppressWarnings("unchecked")
    public Data() {
        this.ruang = (T[]) new Object[100]; 
        this.banyak = 0;
    }
    
    // Fungsi getIsi
    public T getIsi(int indeks) {
        if (indeks < 1 || indeks > 100) {
            throw new IllegalArgumentException("Indeks harus antara 1-100");
        }
        if (indeks > banyak) {
            throw new IndexOutOfBoundsException("Indeks melebihi banyak elemen efektif");
        }
        return ruang[indeks - 1]; 
    }
    
    // Prosedur setIsi
    public void setIsi(int indeks, T nilai) {
        if (indeks < 1 || indeks > 100) {
            throw new IllegalArgumentException("Indeks harus antara 1-100");
        }
        
        ruang[indeks - 1] = nilai; 
        
        if (indeks > banyak) {
            banyak = indeks;
        }
    }
    
    // Fungsi getSize
    public int getSize() {
        return banyak;
    }
    
    public void tampilkanIsi() {
        System.out.println("Isi Data (size=" + banyak + "):");
        for (int i = 1; i <= banyak; i++) {
            System.out.printf("  [%d] %s\n", i, ruang[i-1]);
        }
    }
}
