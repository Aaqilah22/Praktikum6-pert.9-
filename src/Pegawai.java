public class Pegawai {
    private String nama;
    private double gajiPokok;
    // Constructor default
    public Pegawai() {
        this.nama = "Tidak Diketahui";
        this.gajiPokok = 0.0;
    }
    // Constructor dengan parameter nama
    public Pegawai(String nama) {
        this.nama = nama;
        this.gajiPokok = 0.0;
    }
    // Constructor dengan parameter nama dan gajiPokok
    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }
    // Setter dan Getter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    // Setter dan Getter untuk gajiPokok
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    public double getGajiPokok() {
        return gajiPokok;
    }
    // Method untuk mencetak informasi pegawai
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
    }
}
