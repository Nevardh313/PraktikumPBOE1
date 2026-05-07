/* Nama File    : KembangTelon.java
 * Deskripsi    : Membuat class KembangTelon sebagai subclass dari Kucing dengan mengoverride method bersuara untuk memberikan perilaku 
                  yang spesifik pada kucing KembangTelon. Method bersuara akan menampilkan bahwa kucing KembangTelon berbunyi meong khas.
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO / 24060123140215
 * Tanggal      : 1 Mei 2026
 */


package GenerikPadaClass;

public class KembangTelon extends Kucing {
    public KembangTelon(String nama, double bobot) {
        super(nama, bobot);
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " (Kembangtelon) mengeong: Mioowww!");
    }
    
    public void infoKembangtelon() {
        System.out.println("Kembangtelon: " + nama + ", Bobot: " + bobot + " kg, Tanpa bulu");
    }

    public void infoKembangTelon() {
        throw new UnsupportedOperationException("Unimplemented method 'infoKembangTelon'");
    }
}
