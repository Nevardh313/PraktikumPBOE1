/* Nama File    : MOperator.java
 * Deskripsi    : Class utama untuk menguji fungsi generik pada operator tukar dan bobot
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO / 24060123140215
 * Tanggal      : 1 Mei 2026
 */

package GenerikPadaOperator;

import GenerikPadaClass.Anabul;
import GenerikPadaClass.Anggora;
import GenerikPadaClass.Anjing;
import GenerikPadaClass.Kucing;

public class MOperator {
    public static void main(String[] args) {
        System.out.println("=== DEMONSTRASI OPERATOR GENERIK ===\n");
        
        System.out.println("1. TUKAR SESAMA INTEGER");
        Integer[] integers = {3, 6};
        System.out.println("Sebelum: a=" + integers[0] + ", b=" + integers[1]);
        OperatorGenerik.Tukar(integers);
        System.out.println("Sesudah: a=" + integers[0] + ", b=" + integers[1]);
        System.out.println();
        
        System.out.println("2. TUKAR SESAMA STRING");
        String[] strings = {"Java", "Generik"};
        System.out.println("Sebelum: a='" + strings[0] + "', b='" + strings[1] + "'");
        OperatorGenerik.Tukar(strings);
        System.out.println("Sesudah: a='" + strings[0] + "', b='" + strings[1] + "'");
        System.out.println();
        
        System.out.println("3. TUKAR SESAMA ANABUL");
        Anabul[] anabulArray = {new Anjing("Buddy"), new Kucing("Mimi", 4.5)};
        System.out.println("Sebelum:");
        System.out.println("  a: " + anabulArray[0].getClass().getSimpleName() + 
                          " '" + anabulArray[0].getNama() + "'");
        System.out.println("  b: " + anabulArray[1].getClass().getSimpleName() + 
                          " '" + anabulArray[1].getNama() + "'");
        
        OperatorGenerik.Tukar(anabulArray);
        
        System.out.println("Sesudah:");
        System.out.println("  a: " + anabulArray[0].getClass().getSimpleName() + 
                          " '" + anabulArray[0].getNama() + "'");
        System.out.println("  b: " + anabulArray[1].getClass().getSimpleName() + 
                          " '" + anabulArray[1].getNama() + "'");
        System.out.println();
        
        System.out.println("4. FUNGSI BOBOT2 - JUMLAH BOBOT DUA KUCING");
        Kucing kucing1 = new Anggora("Luna", 3.2);
        Kucing kucing2 = new Kucing("Sofi", 2.8);
        
        System.out.println("Kucing 1: " + kucing1.getNama() + " (" + kucing1.getBobot() + " kg)");
        System.out.println("Kucing 2: " + kucing2.getNama() + " (" + kucing2.getBobot() + " kg)");
        
        double totalBobot = OperatorGenerik.Bobot2(kucing1, kucing2);
        System.out.println("Total bobot: " + totalBobot + " kg");
        System.out.println();
        
        System.out.println("5. TUKAR MENGGUNAKAN HOLDER (BONUS)");
        Holder<Integer> h1 = new Holder<>(10);
        Holder<Integer> h2 = new Holder<>(20);
        System.out.println("Sebelum Holder: h1=" + h1.getValue() + ", h2=" + h2.getValue());
        OperatorGenerik.TukarRef(h1, h2);
        System.out.println("Sesudah Holder: h1=" + h1.getValue() + ", h2=" + h2.getValue());
    }
}
