/* Nama File    : Kucing.java
 * Deskripsi    : Membuat class Kucing sebagai subclass dari Anabul dengan mengoverride method gerak dan bersuara 
                  untuk memberikan perilaku yang spesifik pada kucing. Method gerak akan menampilkan bahwa kucing 
                  bergerak dengan melata, sedangkan method bersuara akan menampilkan bahwa kucing berbunyi meong.
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO / 24060123140215
 * Tanggal      : 1 Mei 2026
 */

package GenerikPadaClass;

public class Kucing extends Anabul {
    protected double bobot; 
    
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " mengeong: Meow! Meow!");
    }
    
    public double getBobot() {
        return bobot;
    }
    
    public void setBobot(double bobot) {
        this.bobot = bobot;
    }
    
    public void infoKucing() {
        System.out.println("Kucing: " + nama + ", Bobot: " + bobot + " kg");
    }
}
