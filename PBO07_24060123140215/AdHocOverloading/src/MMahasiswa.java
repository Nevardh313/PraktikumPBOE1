/* Nama File    : MMahasiswa.java
 * Deskripsi    : Program utama untuk menguji kelas Mahasiswa
 *                Demonstrasi konstruktor dan method overloading
 * Pembuat      : Nevlyn Abbel Fikri Ardho
 * Tanggal      : 24 April 2026
 */


package AdHocCoersion.AdHocOverloading;

public class MMahasiswa {
    public static void main(String[] args) {
        System.out.println("=== TEST LENGKAP KELAS MAHASISWA ===\n");
        
        System.out.println("1. KONSTRUKTOR:");
        Mahasiswa mhs1 = new Mahasiswa(); // Default
        Mahasiswa mhs2 = new Mahasiswa("2023001", "Budi", "Informatika"); // 3 param
        Mahasiswa mhs3 = new Mahasiswa(mhs2); // Kloning
        System.out.println("Default: " + mhs1);
        System.out.println("3 Param: " + mhs2);
        System.out.println("Kloning: " + mhs3);
        System.out.println();
        
        System.out.println("2. SET PROGRAM STUDI:");
        mhs1.setProgramStudi(); // Varian 1
        mhs2.setProgramStudi("Teknik Sipil"); // Varian 2
        mhs3.setProgramStudi(mhs2); // Varian 3
        System.out.println("Varian 1: " + mhs1);
        System.out.println("Varian 2: " + mhs2);
        System.out.println("Varian 3: " + mhs3);
    }
}
