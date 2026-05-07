/* Nama File    : Holder.java
 * Deskripsi    : Membuat class Holder sebagai generic class yang dapat menyimpan data dengan tipe tertentu.
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO / 24060123140215
 * Tanggal      : 1 Mei 2026
 */

package GenerikPadaOperator;

public class Holder<T> {
    private T value;
    
    public Holder(T value) {
        this.value = value;
    }
    
    public T getValue() {
        return value;
    }
    
    public void setValue(T value) {
        this.value = value;
    }
}
