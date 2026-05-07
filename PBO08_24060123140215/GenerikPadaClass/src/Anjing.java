/* Nama File    : Anjing.java
 * Deskripsi    : Membuat class Anjing sebagai subclass dari Anabul dengan mengoverride method gerak dan bersuara 
                  untuk memberikan perilaku yang spesifik pada anjing. Method gerak akan menampilkan bahwa anjing 
                  bergerak dengan melata, sedangkan method bersuara akan menampilkan bahwa anjing berbunyi guk-guk.
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO / 24060123140215
 * Tanggal      : 1 Mei 2026
 */


package GenerikPadaClass;

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " menggonggong: Wuff! Wuff!");
    }
}
