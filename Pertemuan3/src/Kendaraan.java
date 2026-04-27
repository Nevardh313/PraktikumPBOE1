/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Nevlyn Abbel Fikri Ardho
 * Tanggal      : Kamis 5 Maret 2026
 */


public class Kendaraan {
    private String noPlat;
    private String jenis; 

    // Konstruktor tanpa parameter
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Getter dan Setter
    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // Method untuk menampilkan data kendaraan
    public void tampilkan() {
        System.out.println("No. Plat: " + noPlat + ", Jenis: " + jenis);
    }
}
