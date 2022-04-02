import java.util.Collections;//mengimpor method bawaan dari kelas Java Collections
import java.util.ArrayList;//mengimpor collections dari java untuk membuat arraylist
import java.util.Scanner;//mengimpor library java untuk memasukan inputan dari user

public class MhsSearchDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();//untuk menambahkan data mahasiswa
        listMahasiswa.add(new Mahasiswa("123", "Nina", "D3IF 43-03"));
        listMahasiswa.add(new Mahasiswa("111", "Ria", "D3IF 43-02"));
        listMahasiswa.add(new Mahasiswa("100", "Siti", "D3IF 43-01"));
        listMahasiswa.add(new Mahasiswa("124", "Nina", "D3IF 43-04"));
        cetakList(listMahasiswa);//untuk mencetak seluruh data mahasiswa yang diinputkan
        System.out.println("Masukkan NIM mahasiswa yang dicari: ");
        String keyNim = input.nextLine();//untuk menginputkan NIM mahasiswa yang akan dicari
        Mahasiswa mhsResult = cariMahasiswa(listMahasiswa,keyNim);//untuk menampilkan hasil dari pencarian dengan memanggil method CariMahasiswa
        System.out.print("Mahasiswa dengan NIM "+ keyNim);//menampilkan NIM inputan dari user
        System.out.println(" adalah: \n" + mhsResult);//mencetak/menampilkan hasil dari NIM mahasiswa yang dicari
    }
    private static void cetakList(ArrayList<Mahasiswa> arrayList){//method untuk mencetak list mahasiswa(arraylist)tersebut
        for (Mahasiswa mhs:arrayList) {//mhs merupakan arrayList tersebut
            System.out.println(mhs);//mencetak list mahasiwa yang sudah di inputkan
        }
        System.out.println();
    }
    private static Mahasiswa cariMahasiswa(ArrayList<Mahasiswa> list, String nim){//method untuk mencari letak atau posisi angka
        Mahasiswa result;
        Collections.sort(list);//method Collection.sort untuk melakukan sorting elemen arrayList secara descendind(terbesar ke terkecil)
        int index = Collections.binarySearch(list,new Mahasiswa(nim,null,null));//method bawaan dari kelas Java Collections 
        result = list.get(index);                                               //yang mengembalikan posisi objek dalam daftar yang diurutkan.
        return result;
    }
}
