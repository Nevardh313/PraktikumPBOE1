/* Nama File    : Civitasakademika.java
 * Deskripsi    : Kelas abstrak Civitasakademika sebagai induk
 *                Dengan atribut Nama dan method abstrak getNomor()
 * Pembuat      : NEVELYN ABBEL FIKRI ARDHO/24060123140215
 * Tanggal      : 24 April 2026
 */

package AdHocCoersion.Universallnclusion.CivitasAkademika;

 public abstract class CivitasAkademika {
    protected String nama;
    
    public CivitasAkademika(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
       
    public abstract String getNomor();
}
