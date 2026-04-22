/* Nama File    : Titik.java
 * Deskripsi    : Method dalam class Titik
 * Pembuat      : Nevlyn Abbel Fikri Ardho
 * Tanggal      : 19 Februari 2026
 */

public class Titik {
    double absis;
    double ordinat;

    Titik(){
        absis = 0;
        ordinat = 0;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + x;
    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}
