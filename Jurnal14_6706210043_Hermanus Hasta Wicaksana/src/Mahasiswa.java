import java.util.Objects;

public class Mahasiswa { // kelas objek untuk menyimpan data NIM, nama, dan kelas
    private Integer NIM;
    private String nama;
    private String kelas;

    public Mahasiswa(Integer NIM, String nama, String kelas){
        //membuat constructor untuk objek NIM, nama, dan kelas
        this.NIM = NIM;
        this.nama = nama;
        this.kelas = kelas;
    }

    @Override // membuat override untuk equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mahasiswa mahasiswa = (Mahasiswa) o;
        return Objects.equals(NIM, mahasiswa.NIM) && Objects.equals(nama, mahasiswa.nama) && Objects.equals(kelas, mahasiswa.kelas);
    }

    @Override
    public int hashCode() { //membuat Override untuk hashcode
        final int HASH_MULTIPLER = 29; // disini saya menggunakan angka prima 29
        int h1 = NIM.hashCode();
        int h2 = nama.hashCode();
        int h3 = kelas.hashCode();
        int h = HASH_MULTIPLER * h1 + h2 + h3;
        return h;
    }

    @Override //melakukan overrider toString untuk print nilai dari objek mahasiswa ini
    public String toString() {
        return "Mahasiswa { " +
                "NIM=" + NIM +
                ", nama='" + nama + '\'' +
                ", kelas='" + kelas + '\'' +
                " }";
    }
}
