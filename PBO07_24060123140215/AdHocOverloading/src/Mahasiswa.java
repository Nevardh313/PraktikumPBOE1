/* Nama File    : Mahasiswa.java
 * Deskripsi    : Kelas Mahasiswa dengan polimorfisme ad hoc overloading
 *                Atribut NIM, Nama, Programstudi dan method setProgramStudi overloaded
 * Pembuat      : Nevlyn Abbel Fikri Ardho
 * Tanggal      : 24 April 2026
 */

package AdHocCoersion.AdHocOverloading;

class Mahasiswa {
    private String NIM;
    private String Nama;
    private String ProgramStudi;

    // Konstruktor default (poin c)
    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    // Konstruktor 3 parameter (poin d)
    public Mahasiswa(String NIM, String Nama, String ProgramStudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
    }

    // Konstruktor kloning (poin e)
    public Mahasiswa(Mahasiswa mhsLain) {
        this.NIM = mhsLain.NIM;
        this.Nama = mhsLain.Nama;
        this.ProgramStudi = mhsLain.ProgramStudi;
    }

    // Varian 1: tanpa parameter
    public void setProgramStudi() {
        this.ProgramStudi = "Kosong";
    }

    // Varian 2: 1 parameter String
    public void setProgramStudi(String programStudi) {
        this.ProgramStudi = programStudi;
    }

    // Varian 3: 1 parameter Mahasiswa
    public void setProgramStudi(Mahasiswa mhsLain) {
        this.ProgramStudi = mhsLain.ProgramStudi;
    }

    // Getters
    public String getNIM() { return NIM; }
    public String getNama() { return Nama; }
    public String getProgramStudi() { return ProgramStudi; }

    @Override
    public String toString() {
        return String.format("Mahasiswa{NIM='%s', Nama='%s', ProgramStudi='%s'}", 
                           NIM, Nama, ProgramStudi);
    }
}
