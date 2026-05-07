/* Nama File    : MData.java
 * Deskripsi    : Membuat class MData sebagai class utama untuk menguji fungsi dari class Data.
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO / 24060123140215
 * Tanggal      : 1 Mei 2026
 */


package LarikGenerik;

import GenerikPadaClass.Anabul;
import GenerikPadaClass.Anggora;
import GenerikPadaClass.Anjing;
import GenerikPadaClass.Burung;
import GenerikPadaClass.KembangTelon;
import GenerikPadaClass.Kucing;

public class MData {
    public static void main(String[] args) {
        System.out.println("=== DEMONSTRASI KELAS GENERIK DATA ===\n");
        
        // a. Aplikasi kelas Data dengan berbagai tipe
        System.out.println("A. APLIKASI DATA DENGAN BERBAGAI TIPE\n");
        
        Data<Integer> dataInt = new Data<>();
        dataInt.setIsi(1, 10);
        dataInt.setIsi(2, 20);
        dataInt.setIsi(3, 30);
        
        System.out.println("Data<Integer>:");
        System.out.println("  getIsi(2) = " + dataInt.getIsi(2));
        System.out.println("  getSize() = " + dataInt.getSize());
        dataInt.tampilkanIsi();
        System.out.println();
        
        Data<String> dataStr = new Data<>();
        dataStr.setIsi(1, "Java");
        dataStr.setIsi(3, "Generik"); 
        
        System.out.println("Data<String>:");
        System.out.println("  getIsi(1) = '" + dataStr.getIsi(1) + "'");
        System.out.println("  getIsi(3) = '" + dataStr.getIsi(3) + "'");
        System.out.println("  getSize() = " + dataStr.getSize());
        dataStr.tampilkanIsi();
        System.out.println();
        
        System.out.println("B,C,D. APLIKASI DATA UNTUK KELUARGA ANABUL\n");
        
        Data<Anabul> dataAnabul = new Data<>();
        
        System.out.println("B. Menggunakan setIsi() untuk Anabul:");
        Anabul anabul1 = new Anjing("Buddy");
        Anabul anabul2 = new Kucing("Mimi", 4.5);
        Anabul anabul3 = new Anggora("Luna", 3.2);
        Anabul anabul4 = new KembangTelon("Sofi", 2.8);
        Anabul anabul5 = new Burung("Tweety");
        
        dataAnabul.setIsi(1, anabul1);
        dataAnabul.setIsi(3, anabul2);
        dataAnabul.setIsi(2, anabul3); 
        dataAnabul.setIsi(5, anabul4);
        dataAnabul.setIsi(4, anabul5);
        
        dataAnabul.tampilkanIsi();
        System.out.println();
        
        // c. Aplikasi getIsi untuk Anabul
        System.out.println("C. Menggunakan getIsi() untuk Anabul:");
        System.out.println("  Posisi 1: " + dataAnabul.getIsi(1).getClass().getSimpleName() + 
                          " '" + dataAnabul.getIsi(1).getNama() + "'");
        dataAnabul.getIsi(1).bersuara();
        
        System.out.println("  Posisi 2: " + dataAnabul.getIsi(2).getClass().getSimpleName() + 
                          " '" + dataAnabul.getIsi(2).getNama() + "'");
        ((Kucing)dataAnabul.getIsi(2)).infoKucing();
        
        System.out.println("  Posisi 5: " + dataAnabul.getIsi(5).getClass().getSimpleName() + 
                          " '" + dataAnabul.getIsi(5).getNama() + "'");
        dataAnabul.getIsi(5).bersuara();
        System.out.println();
        
        // d. Aplikasi getSize untuk Anabul
        System.out.println("D. getSize() untuk Data<Anabul>:");
        System.out.println("  Banyak elemen efektif: " + dataAnabul.getSize());
        System.out.println();
        
        System.out.println("E. TEST ERROR HANDLING:");
        try {
            dataAnabul.getIsi(6); // Melebihi size
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            dataAnabul.setIsi(101, anabul1); // Melebihi 100
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
