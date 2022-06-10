import java.util.HashMap;

public class Main {

    public static int mean(HashMap<Mahasiswa, Integer> mhs){ //membuat fungsi untuk mencari nilai rata-rata
        int jumlahNilai = 0;
        for (Object o: mhs.keySet()){
            jumlahNilai += mhs.get(o);
        }
      return (jumlahNilai/ mhs.size());
    }

    public static void print(HashMap<Mahasiswa, Integer> mhs){ //membuat fungsi untuk mencetak/menampilkan hasil
        for (Object o: mhs.keySet()){
            System.out.println("key: " + o + "nilai dari mahasiswa: " + mhs.get(o));
        }
    }
    public static void main(String[] args) {
        HashMap<Mahasiswa, Integer> mhs = new HashMap<Mahasiswa, Integer>();
        //menambahkan nama , nim, dan kelas mahasiswa
        Mahasiswa alex = new Mahasiswa(670621004, "Alex", "45-05");
        mhs.put(alex, 70);
        Mahasiswa gimin = new Mahasiswa(670621004, "Gimin", "45-05");
        mhs.put(gimin, 80);
        Mahasiswa bagong = new Mahasiswa(670621004, "Bagong", "45-05");
        mhs.put(bagong, 60);
        Mahasiswa boy = new Mahasiswa(670621004, "Boy", "45-05");
        mhs.put(boy, 95);

        print(mhs); // memanggil fungsi print
        System.out.println(); //membuat spasi
        System.out.println("Rata-rata nilai mahasiswa di atas adalah " + mean(mhs)); //mencetak rata-rata mahasiswa

        mhs.remove(bagong); // menghapus mahasiswa yang bernama bagong
        System.out.println(); //membuat spasi

        print(mhs); //memanggil fungsi print dan menampilkan mahasiswa setelah satu nama mahasiswa dihapus(bagong)
        mean(mhs); //memanggil fungsi mean untuk mendapatkan rata-rata nilai mahasiswa
        System.out.println();

        //mencetak rata-rata mahasiswa setelah bagong di hapus dari daftar mahasiswa
        System.out.println("Rata-rata nilai mahasiswa di atas adalah " + mean(mhs));
    }
}
