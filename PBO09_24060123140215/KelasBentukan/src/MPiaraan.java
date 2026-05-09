/* Nama File    : MPiaraan.java
 * Deskripsi    : Class Main Piaraan
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO / 24060123140215
 * Tanggal      : 8 Mei 2026
 */

package KelasBentukan;

public class MPiaraan {
    public static void main(String[] args) {
        Piaraan<Anabul> klinik = new Piaraan<>();

        // Instansiasi berbagai hewan
        Anjing doggy = new Anjing("Rex");
        Kucing mpus = new Kucing("Mpus", 4.5);
        Anggora snow = new Anggora("Snowy", 3.2);
        Burung tweety = new Burung("Tweety");

        // b.ii Enqueue
        klinik.enqueueAnabul(doggy);
        klinik.enqueueAnabul(mpus);
        klinik.enqueueAnabul(snow);
        klinik.enqueueAnabul(tweety);

        // c. showAnabul
        klinik.showAnabul();

        // d. countKucing
        System.out.println("\nJumlah keluarga kucing: " + klinik.countKucing());

        // e. bobotKucing
        System.out.println("Total bobot keluarga kucing: " + klinik.bobotKucing() + " kg");

        // f. showJenisAnabul
        System.out.println("");
        klinik.showJenisAnabul();
        
        // v. Dequeue
        System.out.println("\nMemproses antrean pertama: " + klinik.dequeueAnabul().getNama());
        System.out.println("Sisa antrean: " + klinik.getNbelm());
    }
}
