public class Mahasiswa implements Comparable<Mahasiswa> {//mengimport library java comparable supaya objek selain tipe data primitif dapat diurutkan
    //membuat 3 atribut yang diperlukan yaitu nim, nama, dan kelas
    private String nim;
    private String nama;
    private String kelas;
    public Mahasiswa(String nim, String nama, String kelas) {//membuat constructor untuk mengintansiasikan objek
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }
    public String getNim(){//membuat getter untuk atribut nim(tidak langsung mengakses atribut nim)
        return nim;
    }
    @Override
    public int compareTo(Mahasiswa o) {//membuat method untuk membandingkan object bilangan yang dipanggil
                                       // melalui mehod untuk argumen
        return this.getNim().compareTo(o.getNim());
    }
    @Override
    public String toString() {////suatu fungsi untuk mengubah objek menjadi tipe data String
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                ", kelas='" + kelas + '\'' +
                '}';
    }
}