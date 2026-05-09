/* Nama File    : Burung.java
 * Deskripsi    : Membuat class Burung sebagai subclass dari Anabul dengan mengoverride method gerak dan bersuara 
                  untuk memberikan perilaku yang spesifik pada burung. Method gerak akan menampilkan bahwa burung 
                  bergerak dengan terbang, sedangkan method bersuara akan menampilkan bahwa burung berbunyi cuit.
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO / 24060123140215
 * Tanggal      : 8 Mei 2026
 */


package KelasBentukan;

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " berkicau: Cuit! Cuit!");
    }
}
