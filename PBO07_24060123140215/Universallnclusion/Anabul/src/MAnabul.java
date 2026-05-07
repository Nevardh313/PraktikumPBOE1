/* Nama File    : MAnabul.java
 * Deskripsi    : Program utama untuk mensimulasikan semua jenis Anabul
 *                Demonstrasi polimorfisme universal inclusion
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO/24060123140215
 * Tanggal      : 24 April 2026
 */

package AdHocCoersion.Universallnclusion;

public class MAnabul {
    public static void main(String[] args) {

        Anjing anjing = new Anjing("Doggy", 3, "Bulldog");
        Burung burung = new Burung("Tweety", 1, true);
        
        Kucing kucing = new Kucing(4.5);

        System.out.println(anjing);
        System.out.println(burung);
        System.out.println(kucing);

        System.out.println();

        anjing.suara();
        burung.suara();
        kucing.suara();
    }
}
