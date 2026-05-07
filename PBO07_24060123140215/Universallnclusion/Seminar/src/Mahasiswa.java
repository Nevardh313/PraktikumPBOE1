/* Nama File    : Mahasiswa.java
 * Deskripsi    : Kelas Mahasiswa yang extends Civitasakademika
 *                Dengan atribut NIM dan Dosenwali
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO/24060123140215
 * Tanggal      : 24 April 2026
 */


package AdHocCoersion.Universallnclusion.CivitasAkademika;

class Mahasiswa extends CivitasAkademika {
   private String nim;
    private Dosen dosenwali;
    
    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
        this.dosenwali = null;
    }
    
    public String getNomor() {
        return nim;
    }
    
    public String getNim() {
        return nim;
    }
    
    public void setWali(Dosen dosen) {
        this.dosenwali = dosen;
    }
    
    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + 
                          ", Dosen Wali: " + (dosenwali != null ? dosenwali.getNama() : "Belum ada"));
    }
    
    public Dosen getDosenwali() {
        return dosenwali;
    }
}
