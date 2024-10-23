// Kelas Pegawai (Superclass)
class Pegawai {
    // Atribut
    private String nama;
    private double gajiPokok;

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
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}

// Kelas Manager (Subclass dari Pegawai)
class Manager extends Pegawai {
    // Atribut tambahan untuk Manager
    private double tunjangan;

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
        super.cetakInfo(); // Memanggil method cetakInfo dari kelas Pegawai
        System.out.println("Tunjangan: " + tunjangan);
    }

    // Method untuk mencetak informasi tunjangan
    public void cetakTunjangan() {
        System.out.println("Tunjangan: " + tunjangan);
    }
}

// Kelas Programmer (Subclass dari Pegawai)
class Programmer extends Pegawai {
    // Atribut tambahan untuk Programmer
    private double bonus;

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
        super.cetakInfo(); // Memanggil method cetakInfo dari kelas Pegawai
        System.out.println("Bonus: " + bonus);
    }

    // Method untuk mencetak informasi bonus
    public void cetakBonus() {
        System.out.println("Bonus: " + bonus);
    }
}

// Kelas Utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Manager
        Manager manager = new Manager();
        manager.setNama("Budi");
        manager.setGajiPokok(8000000);
        manager.setTunjangan(2000000);
        manager.cetakInfo();

        System.out.println();

        // Membuat objek Programmer
        Programmer programmer = new Programmer();
        programmer.setNama("Ani");
        programmer.setGajiPokok(6000000);
        programmer.setBonus(1500000);
        programmer.cetakInfo();
    }
}
