public class Manager extends Pegawai {
    private double tunjangan;
    // Constructor default
    public Manager() {
        super();
        this.tunjangan = 0.0;
    }
    // Constructor dengan parameter nama dan gajiPokok
    public Manager(String nama, double gajiPokok) {
        super(nama, gajiPokok);
        this.tunjangan = 0.0;
    }
    // Constructor dengan parameter nama, gajiPokok, dan tunjangan
    public Manager(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }
    // Setter dan Getter untuk tunjangan
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    public double getTunjangan() {
        return tunjangan;
    }
    // Override method cetakInfo
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tunjangan: Rp" + tunjangan);
    }
}
