/* Nama File    : Pengusaha.java
 * Deskripsi    : Membuat class Pengusaha dengan inherit Manusia dan implement Pajak
 * Pembuat      : Nevlyn Abbel Fikri Ardho
 * Tanggal      : 16 April 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha;
    private static final int B = 2;

    public Pengusaha(){
        super();
        npwp = "";
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp(){
        return this.npwp;
    }

    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    @Override
    public int hitungMasaKerja(){
        Period period = Period.between(getTgl_mulai_kerja(), LocalDate.now());
        return period.getYears() + B;
    }

    @Override
    public double hitungPajak() {
        return getPendapatan() * 0.15;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP : " + npwp);
    }
}
