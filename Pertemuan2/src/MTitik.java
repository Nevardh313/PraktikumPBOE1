public class MTitik {
    public static void main(String[] args) {
        System.out.println("=== DEMONSTRASI CLASS TITIK ===\n");

        // Test 1: Konstruktor default
        System.out.println("1. Titik dengan konstruktor default:");
        Titik t1 = new Titik();
        System.out.print("Titik t1: ");
        t1.tampilkan();
        System.out.println();

        // Test 2: Konstruktor dengan parameter
        System.out.println("2. Titik dengan konstruktor parameter:");
        Titik t2 = new Titik(3.5, -2.7);
        System.out.print("Titik t2: ");
        t2.tampilkan();
        System.out.println();

        // Test 3: Getter dan Setter
        System.out.println("3. Test Getter dan Setter:");
        System.out.print("Titik t2 awal: ");
        t2.tampilkan();
        
        // Mengubah koordinat menggunakan setter
        t2.setX(5.0);
        t2.setY(4.2);
        
        System.out.print("Titik t2 setelah diubah: ");
        t2.tampilkan();
        
        System.out.printf("X: %.2f, Y: %.2f\n", t2.getX(), t2.getY());
        System.out.println();

        // Test 4: Membuat beberapa titik
        System.out.println("4. Membuat beberapa titik:");
        Titik[] titikArray = {
            new Titik(0, 0),
            new Titik(1, 2),
            new Titik(-3, 4),
            new Titik(2.5, -1.5)
        };

        for (int i = 0; i < titikArray.length; i++) {
            System.out.printf("Titik[%d]: ", i);
            titikArray[i].tampilkan();
        }
        System.out.println();

        // Test 5: Operasi sederhana dengan titik
        System.out.println("5. Operasi dengan titik:");
        Titik t3 = new Titik(1, 1);
        Titik t4 = new Titik(4, 5);
        
        System.out.print("Titik t3: ");
        t3.tampilkan();
        System.out.print("Titik t4: ");
        t4.tampilkan();
        
        // Titik tengah manual (untuk demo)
        double xTengah = (t3.getX() + t4.getX()) / 2;
        double yTengah = (t3.getY() + t4.getY()) / 2;
        System.out.printf("Titik tengah t3-t4: (%.2f, %.2f)\n", xTengah, yTengah);
    }
}
