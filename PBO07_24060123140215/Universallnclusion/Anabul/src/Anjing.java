/* Nama File    : Anjing.java
 * Deskripsi    : Kelas Anjing yang extends Anabul
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO/24060123140215
 * Tanggal      : 24 April 2026
 */

package AdHocCoersion.Universallnclusion;

public class Anjing extends Anabul {
    private String ras;

    public Anjing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    @Override
    public void suara() {
        System.out.println(nama + " menggonggong WANG WANG!");
    }

    public String getRas() { return ras; }

    @Override
    public String toString() {
        return "Anjing{nama='" + nama + "', umur=" + umur + ", ras='" + ras + "'}";
    }
}
