public class Programmer extends Pegawai {
    private double bonus;
    // Constructor default
    public Programmer() {
        super();
        this.bonus = 0.0;
    }
    // Constructor dengan parameter nama
    public Programmer(String nama) {
        super(nama);
        this.bonus = 0.0;
    }
    // Constructor dengan parameter nama dan gajiPokok
    public Programmer(String nama, double gajiPokok) {
        super(nama, gajiPokok);
        this.bonus = 0.0;
    }
    // Constructor dengan parameter nama, gajiPokok, dan bonus
    public Programmer(String nama, double gajiPokok, double bonus) {
        super(nama, gajiPokok);
        this.bonus = bonus;
    }
    // Setter dan Getter untuk bonus
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
    // Override method cetakInfo
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Bonus: Rp" + bonus);
    }
}
