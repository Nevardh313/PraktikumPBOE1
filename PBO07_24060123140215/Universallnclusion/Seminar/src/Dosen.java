/* Nama File    : Dosen.java
 * Deskripsi    : Kelas Dosen yang extends Civitasakademika
 *                Dengan atribut NIP
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO/24060123140215
 * Tanggal      : 24 April 2026
 */

package AdHocCoersion.Universallnclusion.CivitasAkademika;

class Dosen extends CivitasAkademika {
    private String nip;
    
    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }
    
    public String getNomor() {
        return nip;
    }
    
    public String getNip() {
        return nip;
    }
}
