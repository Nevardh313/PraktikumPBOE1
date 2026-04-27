/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atribut dan method dalam class Pegawai
 * Pembuat      : Nevlyn Abbel Fikri Ardho
 * Tanggal      : 12 Maret 2026
 */

public class Pegawai {
    private String NIP;
    private String Nama;
    private String TanggalLahir;
    private String TMT;
    private double GajiPokok;

    public Pegawai() {
        this("", "", "", "", 0.0);
    }

    public Pegawai(String NIP, String Nama, String TanggalLahir, String TMT, double GajiPokok) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.TMT = TMT;
        this.GajiPokok = GajiPokok;
    }

    // Getter & Setter
    public String getNIP() { 
        return NIP; 
    }
    public void setNIP(String NIP) { 
        this.NIP = NIP; 
    }

    public String getNama() { 
        return Nama; 
    }
    public void setNama(String Nama) { 
        this.Nama = Nama; 
    }

    public String getTanggalLahir() { 
        return TanggalLahir; 
    }

    public void setTanggalLahir(String TanggalLahir) { 
        this.TanggalLahir = TanggalLahir; 
    }

    public String getTMT() { 
        return TMT; 
    }
    public void setTMT(String TMT) { 
        this.TMT = TMT; 
    }

    public double getGajiPokok() { 
        return GajiPokok; 
    }
    public void setGajiPokok(double GajiPokok) { 
        this.GajiPokok = GajiPokok; 
    }

    public int getHitungMasaKerja(int tahunTMT){
        return 2026 - tahunTMT;
    }
    public void printInfo() {
        System.out.println("Nama Pegawai: " + Nama);
        System.out.println("NIP Pegawai: " + NIP);
        System.out.println("Tanggal Lahir Pegawai: " + TanggalLahir);
        System.out.println("TMT Pegawai: " + TMT);
        System.out.println("Gaji Pokok Pegawai: " + GajiPokok);
    }
}
