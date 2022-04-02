import java.security.SecureRandom;//uuntuk menghasilkan bilangan acak secara kriptografis
import java.util.Arrays;//mengimpor library java untuk memasukkan data tipe array
import java.util.Scanner;//mengimpor library java untuk memasukan inputan dari user 

public class BinarySearchTest {
    public static int binarySearch(int[] data, int key) {
        int low = 0; // merupakan elemen dari bawah area pencarian(search)
        int high = data.length - 1; //merupakan elemen paling atas area pencarian(search)
        int middle = (low + high + 1) / 2; // merupakan elemen tengah area pencarian(search)
        int location = -1; // return value; -1 if not found
        do { // proses looping atau perulangan untuk mencari elemen
            // untuk mencetak elemen array yang tersisa
            System.out.print(remainingElements(data, low, high));
            
            for (int i = 0; i < middle; i++) {
                System.out.print(" ");
            }
            System.out.println(" * "); // untuk mengindikasikan atau menandai elemen tengah
            // jika suatu objek ditemukan di tengah maka akan ditandai
            if (key == data[middle]) {
                location = middle; // bila lokasi objek berada di tengah
            }
            else if (key < data[middle]) { // jika elemen tengah nilai lebih tinggi
                high = middle - 1; // untuk menghilangkan elemen tingi tadi
            }
            else { // jika elemen tengah nilainya lebih rendah
                low = middle + 1; // untuk menghilangkan elemen rendah tadi
            }
            middle = (low + high + 1) / 2; // menghitung kembali bagian tengah elemen
        } while ((low <= high) && (location == -1));
        return location; // mengembalikan lokasi kunci pencarian(search key)
    }
    //membuat method untuk menampilkan nilai-nilai tertentu dalam array
    private static String remainingElements(
            int[] data, int low, int high) {
        StringBuilder temporary = new StringBuilder();
        // menambahkan spasi untuk menyelaraskan agar lebih mudah dibaca
        for (int i = 0; i < low; i++) {
            temporary.append(" ");
        }
        // untuk menambahkan elemen yang tersisa dalam array
        for (int i = low; i <= high; i++) {
            temporary.append(data[i] + " ");
        }
        return String.format("%s%n", temporary);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();
        // membuat masukan array 15 bilangan bulat acak dalam urutan yang diurutkan
        int[] data = generator.ints(15, 10, 91).sorted().toArray();
        System.out.printf("%s%n%n", Arrays.toString(data)); // untuk menampilkan array
        // untuk mendapatkan input dari user
        System.out.print("Please enter an integer value (-1 to quit): ");
        int searchInt = input.nextInt();
        // untuk memasukkan data tipe integer berulang kali, dan masukkan angka -1 untuk keluar dari program
        while (searchInt != -1) {
            // untuk melakukan pencarian
            int location = binarySearch(data, searchInt);
            if (location == -1) { // bila lokasi elemen tidak ditemukan
                System.out.printf("%d was not found%n%n", searchInt);
            }
            else { // bila lokasi elemen ditemukan 
                System.out.printf("%d was found in position %d%n%n",
                        searchInt, location);
            }
            // untuk mendapatkan input dari user
            System.out.print("Please enter an integer value (-1 to quit): ");
            searchInt = input.nextInt();
        }
    }
}
