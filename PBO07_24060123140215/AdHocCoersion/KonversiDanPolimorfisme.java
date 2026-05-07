/* Nama File    : KonversiDanPolimorfisme.java
 * Deskripsi    : Program ilustrasi polimorfisme ad hoc coercion
 *                Konversi tipe data dan operasi string
 * Pembuat      : Nevlyn Abbel Fikri Ardho
 * Tanggal      : 24 April 2026
 */

package AdHocCoersion;

public class KonversiDanPolimorfisme {
    public static void main(String[] args) {
        System.out.println("=== a. Ilustrasi Polimorfisme Konversi Data ===");
        int nilaiInt = 65;
        
        // Tampilkan sebagai berbagai tipe data
        System.out.println("Sebagai Integer: " + nilaiInt);
        System.out.println("Sebagai Karakter: " + (char)nilaiInt);
        System.out.println("Sebagai Real: " + (double)nilaiInt);
        System.out.println();
        
        // b. Konversi integer ke real, lalu kembali ke integer (variabel berbeda)
        System.out.println("=== b. Konversi Integer -> Real -> Integer ===");
        int intAsli = 65;
        double realValue = intAsli;  // Integer ke real
        int intBaru = (int)realValue; // Real kembali ke integer (variabel berbeda)
        
        System.out.println("Integer asli: " + intAsli);
        System.out.println("Dijadi real: " + realValue);
        System.out.println("Kembali ke integer: " + intBaru);
        System.out.println();
        
        // c. String X="1234", Y="5678" -> konkatenasi S, penjumlahan Z
        System.out.println("=== c. Konkatenasi dan Penjumlahan String ke Integer ===");
        String X = "1234";
        String Y = "5678";
        String S = X + Y;  // Konkatenasi
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);  // Penjumlahan
        
        System.out.println("X = " + X);
        System.out.println("Y = " + Y);
        System.out.println("S (konkatenasi) = " + S);
        System.out.println("Z (penjumlahan) = " + Z);
        System.out.println();
        
        // d. String P="12.34", Q="56.78" -> konkatenasi R, penjumlahan D
        System.out.println("=== d. Konkatenasi dan Penjumlahan String ke Double ===");
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;  // Konkatenasi
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);  // Penjumlahan
        
        System.out.println("P = " + P);
        System.out.println("Q = " + Q);
        System.out.println("R (konkatenasi) = " + R);
        System.out.println("D (penjumlahan) = " + D);
        System.out.println();
        
        // e. Integer A dari konversi String S
        System.out.println("=== e. Konversi String S ke Integer A ===");
        Integer A = Integer.parseInt(S);
        System.out.println("S = " + S);
        System.out.println("A = " + A);
        System.out.println();
        
        // f. String T dari konversi Integer A
        System.out.println("=== f. Konversi Integer A ke String T ===");
        String T = A.toString();
        System.out.println("A = " + A);
        System.out.println("T = " + T);
        System.out.println();
        
        // Bonus: Demonstrasi lengkap semua konversi
        System.out.println("=== DEMONSTRASI LENGKAP SEMUA KONVERSI ===");
        System.out.println("1. int -> String: " + Integer.toString(123));
        System.out.println("2. String -> int: " + Integer.parseInt("123"));
        System.out.println("3. String -> double: " + Double.parseDouble("123.45"));
        System.out.println("4. double -> String: " + Double.toString(123.45));
        System.out.println("5. int -> char: " + (char)65);
        System.out.println("6. char -> int: " + (int)'A');
    }
}
