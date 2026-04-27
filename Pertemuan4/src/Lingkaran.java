/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Nevlyn Abbel Fikri Ardho
 * Tanggal      : 12 Maret 2026
*/

public class Lingkaran extends BangunDatar {
    // Atribut
    private double jari;

    // Method
    public Lingkaran(){
        setJmlSisi(1);
    }

    public Lingkaran(double diameter, int jmlSisi, String warna, String border){
        super(jmlSisi, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * getJari() * getJari();
    }

    public double getKeliling(){
        return 2 * Math.PI * getJari();
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }
}
