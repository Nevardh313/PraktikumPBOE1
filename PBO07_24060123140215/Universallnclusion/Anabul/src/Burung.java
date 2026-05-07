/* Nama File    : Burung.java
 * Deskripsi    : Kelas Burung yang extends Anabul
 *                Suara: MANIA 
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO/24060123140215
 * Tanggal      : 24 April 2026
 */

package AdHocCoersion.Universallnclusion;

public class Burung extends Anabul {
    private boolean bisaTerbang;

    public Burung(String nama, int umur, boolean bisaTerbang) {
        super(nama, umur);
        this.bisaTerbang = bisaTerbang;
    }

    @Override
    public void suara() {
        System.out.println(nama + " berkicau MANIA MANIA");
    }

    public boolean isBisaTerbang() { return bisaTerbang; }

    @Override
    public String toString() {
        return "Burung{nama='" + nama + "', umur=" + umur + ", bisaTerbang=" + bisaTerbang + "}";
    }
}
