/* Nama File    : Anabul.java
 * Deskripsi    : Kelas abstrak Anabul sebagai induk untuk hewan peliharaan
 *                Dengan method abstrak suara() dan gerak()
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO/24060123140215
 * Tanggal      : 24 April 2026
 */

package AdHocCoersion.Universallnclusion;

public class Anabul {
    protected static String nama;
    protected int umur;

    public Anabul(String nama, int umur) {
        Anabul.nama = nama;
        this.umur = umur;
    }

    public void suara() {
        System.out.println(nama + " berbunyi...");
    }

    public static String getNama() { return nama; }
    public int getUmur() { return umur; }

    @Override
    public String toString() {
        return "Anabul{nama='" + nama + "', umur=" + umur + "}";
    }
}
