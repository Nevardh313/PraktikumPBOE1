/* Nama File    : Persegi.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * Pembuat      : Nevlyn Abbel Fikri Ardho
 * Tanggal      : 12 Maret 2026
*/

public class Persegi extends BangunDatar {
    // Atribut 
    private double sisi;

    // Method
    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return getSisi() * getSisi();
    }

    public double getKeliling(){
        return getJmlSisi() * getSisi();
    }
    
    public double getDiagonal(){
        return getSisi() * Math.sqrt(2);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}
