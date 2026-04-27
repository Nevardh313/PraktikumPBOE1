/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Nevlyn Abbel Fikri Ardho
 * Tanggal      : 5 Maret 2026
*/

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private static MataKuliah[] listMatKul = new MataKuliah[50];
    private static int indexMatKul = 0; // Counter untuk array mata kuliah
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    // Getter dan Setter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // Method addMatKul
    public boolean addMatKul(MataKuliah matKul) {
        if (indexMatKul < 50) {
            listMatKul[indexMatKul] = matKul;
            indexMatKul++;
            return true;
        }
        return false; // Array penuh
    }

    // Method getJumlahSKS
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < indexMatKul; i++) {
            if (listMatKul[i] != null) {
                totalSKS += listMatKul[i].getSks();
            }
        }
        return totalSKS;
    }

    // Method getJumlahMatKul
    public int getJumlahMatKul() {
        return indexMatKul;
    }

    // Method printMhs
    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // Method printDetailMhs
    public void printDetailMhs() {
        System.out.println("=== DETAIL MAHASISWA ===");
        printMhs();
        System.out.println("\nJumlah Mata Kuliah: " + getJumlahMatKul());
        System.out.println("Total SKS: " + getJumlahSKS());
        
        System.out.println("\nDaftar Mata Kuliah:");
        for (int i = 0; i < indexMatKul; i++) {
            if (listMatKul[i] != null) {
                listMatKul[i].tampilkan();
            }
        }
        
        System.out.println("\nDosen Wali:");
        dosenWali.tampilkan();
        
        System.out.println("\nKendaraan:");
        kendaraan.tampilkan();
        System.out.println();
    }
}
