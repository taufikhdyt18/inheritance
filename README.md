# inheritance
```
NIM     : 312310576
NAMA    : TAUFIK HIDAYAT
KELAS   : TI.23.A6
MATKUL  : Pemrograman Orientasi Objek
```
## srccode
```// Kelas Pegawai (Superclass)
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

```
## Penjelasan
- 1. Kelas Pegawai (Superclass):
```
Memiliki atribut nama dan gajiPokok yang bersifat privat.
Menyediakan metode setter dan getter untuk mengatur dan mengambil nilai atribut.
Metode cetakInfo() mencetak informasi umum mengenai pegawai (nama dan gaji pokok).
```
- 2. Kelas Manager (Subclass dari Pegawai):
```
Mewarisi atribut dan metode dari kelas Pegawai.
Menambahkan atribut baru tunjangan dengan setter dan getter.
Meng-override metode cetakInfo() untuk menampilkan informasi tambahan tentang tunjangan.
Metode cetakTunjangan() digunakan untuk mencetak tunjangan secara spesifik.
```
- 3. Kelas Programmer (Subclass dari Pegawai):
```
Mewarisi atribut dan metode dari kelas Pegawai.
Menambahkan atribut baru bonus dengan setter dan getter.
Meng-override metode cetakInfo() untuk menampilkan informasi tambahan tentang bonus.
Metode cetakBonus() digunakan untuk mencetak bonus secara spesifik.
```
- 4. Kelas Main:
```
Membuat objek Manager dan Programmer.
Mengatur nilai atribut menggunakan metode setter.
Memanggil cetakInfo() untuk menampilkan informasi lengkap masing-masing objek di konsol.
```
### Output
![image](sst4/ss1.png)
```
Output dari program ini akan menampilkan data seorang Manager
bernama Budi dengan gaji pokok dan tunjangan,
serta seorang Programmer bernama Ani dengan gaji pokok dan bonus.
```
