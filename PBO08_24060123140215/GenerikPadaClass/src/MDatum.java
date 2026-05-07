/* Nama File    : MDatum.java
 * Deskripsi    : Program untuk menguji kelas Datum dengan berbagai jenis Anabul
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO / 24060123140215
 * Tanggal      : 1 Mei 2026
 */


package GenerikPadaClass;

public class MDatum {
    public static void main(String[] args) {
        System.out.println("DEMONSTRASI KELUARGA ANABUL n");
        
        Anabul[] anabul = new Anabul[6];
        anabul[0] = new Anjing("Buddy");
        anabul[1] = new Burung("Tweety");
        anabul[2] = new Kucing("Mimi", 4.5);
        anabul[3] = new Anggora("Luna", 3.2);
        anabul[4] = new KembangTelon("Sofi", 2.8);
        anabul[5] = new Anjing("Rex");
        
        System.out.println("=== Suara Anabul ===");
        for (Anabul a : anabul) {
            a.bersuara();
        }
        
        System.out.println("\n=== Informasi Kucing ===");
        ((Kucing)anabul[2]).infoKucing();
        ((Anggora)anabul[3]).infoAnggora();
        ((KembangTelon)anabul[4]).infoKembangTelon();
        
        System.out.println("\n=== DEMONSTRASI KELAS GENERIK DATUM ===\n");
        
        Datum<String> datumString = new Datum<>("Halo Anabul!");
        Datum<Integer> datumInteger = new Datum<>(42);
        Datum<Double> datumDouble = new Datum<>(3.14);
        
        System.out.println("1. Datum<String>:");
        datumString.tampilkanIsi();
        
        System.out.println("\n2. Datum<Integer>:");
        datumInteger.tampilkanIsi();
        
        System.out.println("\n3. Datum<Double>:");
        datumDouble.tampilkanIsi();
        
        datumString.setIsi("Selamat datang di keluarga Anabul!");
        datumInteger.setIsi(100);
        datumDouble.setIsi(2.718);
        
        System.out.println("\n=== Setelah diubah menggunakan setIsi() ===");
        System.out.println("Datum<String> baru: " + datumString.getIsi());
        System.out.println("Datum<Integer> baru: " + datumInteger.getIsi());
        System.out.println("Datum<Double> baru: " + datumDouble.getIsi());
        
        System.out.println("\n=== Datum dengan objek Anabul ===");
        Datum<Anabul> datumAnabul = new Datum<>(anabul[3]); 
        System.out.println("Anabul dalam Datum: " + datumAnabul.getIsi().getNama());
        datumAnabul.getIsi().bersuara();
        
        datumAnabul.setIsi(anabul[0]); 
        System.out.println("Anabul baru dalam Datum: " + datumAnabul.getIsi().getNama());
        datumAnabul.getIsi().bersuara();
        
        Datum<Kucing> datumKucing = new Datum<>((Kucing)anabul[2]);
        System.out.println("\nKucing dalam Datum: " + datumKucing.getIsi().getNama() + 
                          ", Bobot: " + datumKucing.getIsi().getBobot() + " kg");
    }
}
