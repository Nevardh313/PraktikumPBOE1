/* Nama File    : Seminar.java
 * Deskripsi    : Kelas Seminar untuk mengelola peserta seminar
 *                Dengan array statis pesertas dan berbagai method
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO/24060123140215
 * Tanggal      : 24 April 2026
 */


package AdHocCoersion.Universallnclusion.CivitasAkademika;

class Seminar {
    private static final int MAKS_PESERTA = 100;
    private CivitasAkademika[] pesertas = new CivitasAkademika[MAKS_PESERTA];
    private int banyakpeserta;
    
    public Seminar() {
        this.banyakpeserta = 0;
    }
    
    public int countPeserta() {
        return banyakpeserta;
    }

    public boolean registrasi(CivitasAkademika peserta) {
        if (banyakpeserta < MAKS_PESERTA) {
            pesertas[banyakpeserta] = peserta; 
            banyakpeserta++;
            return true;
        }
        System.out.println("Kapasitas seminar penuh!");
        return false;
    }
    
    public void tampilPeserta() {
        System.out.println("\n=== DAFTAR PESERTA SEMINAR ===");
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println((i+1) + ". " + pesertas[i].getNomor() + " - " + pesertas[i].getNama());
        }
    }
    
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
    
    public int getBanyakPeserta() {
        return banyakpeserta;
    }
}

