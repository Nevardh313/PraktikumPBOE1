/* Nama File    : OperatorGenerik.java
 * Deskripsi    : Membuat class OperatorGenerik yang berisi method-method generik untuk operasi tukar dan menghitung bobot.
 * Pembuat      : NEVLYN ABBEL FIKRI ARDHO / 24060123140215
 * Tanggal      : 1 Mei 2026
 */


package GenerikPadaOperator;

import GenerikPadaClass.Kucing;

public class OperatorGenerik {
    
    public static <T> void Tukar(T[] arr) {
        if (arr.length >= 2) {
            T temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
    }
    
    public static <T> void TukarRef(Holder<T> holder1, Holder<T> holder2) {
        T temp = holder1.getValue();
        holder1.setValue(holder2.getValue());
        holder2.setValue(temp);
    }
    
    public static double Bobot2(Kucing kucing1, Kucing kucing2) {
        return kucing1.getBobot() + kucing2.getBobot();
    }
}
    
