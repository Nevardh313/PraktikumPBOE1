/* Nama File    : MTeman.java
 * Deskripsi    : Main untuk menguji fungsionalitas class Teman. Dalam method main, kita membuat objek Teman, menambahkan beberapa nama teman ke dalam
 * Pembuat      : Nevlyn Abbel Fikri Ardho / 24060123140215
 * Tanggal      : 8 Mei 2026
 */

package KelasDasar;

public class MTeman {
    public static void main(String[] args) {
        // Membuat objek Teman
        Teman daftarTeman = new Teman();
        
        System.out.println("=== APLIKASI MANAJEMEN DAFTAR TEMAN ===\n");
        
        // Testing semua operator
        System.out.println("1. Testing addNama():");
        daftarTeman.addNama("Budi");
        daftarTeman.addNama("Ani");
        daftarTeman.addNama("Citra");
        daftarTeman.addNama("Doni");
        daftarTeman.addNama("Budi"); // Duplikat untuk test countNama
        daftarTeman.showTeman();
        
        System.out.println("\n2. Testing getNbelm(): " + daftarTeman.getNbelm());
        
        System.out.println("\n3. Testing getNama(1): " + daftarTeman.getNama(1));
        
        System.out.println("\n4. Testing isMember('Ani'): " + daftarTeman.isMember("Ani"));
        System.out.println("Testing isMember('Eka'): " + daftarTeman.isMember("Eka"));
        
        System.out.println("\n5. Testing setNama(0, 'Budiman'): " + 
                          daftarTeman.setNama(0, "Budiman"));
        daftarTeman.showTeman();
        
        System.out.println("\n6. Testing gantiNama('Citra', 'Citra Dewi'): " + 
                          daftarTeman.gantiNama("Citra", "Citra Dewi"));
        daftarTeman.showTeman();
        
        System.out.println("\n7. Testing countNama('Budi'): " + 
                          daftarTeman.countNama("Budi"));
        System.out.println("Testing countNama('Ani'): " + 
                          daftarTeman.countNama("Ani"));
        
        System.out.println("\n8. Testing delNama('Doni'): " + 
                          daftarTeman.delNama("Doni"));
        daftarTeman.showTeman();
        
        System.out.println("\n9. Testing delNama('Budi'): " + 
                          daftarTeman.delNama("Budi"));
        daftarTeman.showTeman();
        
        // Testing kondisi edge case
        System.out.println("\n10. Testing kondisi khusus:");
        System.out.println("getNama(-1): " + daftarTeman.getNama(-1));
        System.out.println("addNama(null): " + daftarTeman.addNama(null));
        System.out.println("setNama(10, 'Test'): " + daftarTeman.setNama(10, "Test"));
        
        daftarTeman.showTeman();
    }
}
