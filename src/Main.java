public class Main {
    public static void main(String[] args) {
        System.out.println("Membuat objek Programmer dengan nama saja:");
        Programmer programmer1 = new Programmer("Andi Herlambang");
        programmer1.cetakInfo();

        System.out.println("\nMembuat objek Programmer dengan nama dan gajiPokok:");
        Programmer programmer2 = new Programmer("Riko", 6000000);
        programmer2.cetakInfo();

        System.out.println("\nMembuat objek Programmer dengan nama, gajiPokok, dan bonus:");
        Programmer programmer3 = new Programmer("Dina", 5000000, 3000000);
        programmer3.cetakInfo();
    }
}
