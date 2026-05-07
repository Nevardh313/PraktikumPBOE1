/* Nama File    : Anggora.java
 * Deskripsi    : Membuat class Anggora sebagai subclass dari Kucing dengan mengoverride method bersuara untuk memberikan perilaku 
                  yang spesifik pada kucing Anggora. Method bersuara akan menampilkan bahwa kucing Anggora berbunyi meong lembut.
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO / 24060123140215
 * Tanggal      : 1 Mei 2026
 */


package GenerikPadaClass;

public class Anggora extends Kucing {
    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " (Anggora) mengeong lembut: Miiuuu~");
    }
    
    public void infoAnggora() {
        System.out.println("Anggora: " + nama + ", Bobot: " + bobot + " kg, Bulu panjang halus");
    }
}
