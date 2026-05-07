/* Nama File    : Kucing.java
 * Deskripsi    : Kelas Kucing yang extends Anabul
 *                Suara: MEOW   
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO/24060123140215
 * Tanggal      : 24 April 2026
 */

package AdHocCoersion.Universallnclusion;

public class Kucing extends Anabul {
    private static final int umur = 0;
    protected double bobot; 

    public Kucing(double bobot) {
        super(nama, umur);
        this.bobot = bobot;
    }

    @Override
    public void suara() {
        System.out.println(nama + " mengMEOW");
    }

    public double getBobot() { return bobot; }
    public void setBobot(double bobot) { this.bobot = bobot; }

    @Override
    public String toString() {
        return "Kucing{nama='" + nama + "', umur=" + umur + ", bobot=" + bobot + " kg}";
    }
}
