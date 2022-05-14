 public class HeapSort {
        public void sort(int arr[]) {
            int n = arr.length;

            // Membuat heap atau mengatur ulang array
            for (int i = n / 2 - 1; i >= 0; i--)
                heapify(arr, n, i);

            // fungsi untuk mengekstrak satu persatu elemen dari heap
            for (int i=n-1; i>=0; i--) {
                // Membuat root berpindah ke index terakhir
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                // memanggil max heapify di heap yang dkurangi
                heapify(arr, i, 0);
            }
        }

        // untuk heapify sebuah subtree diroot dengan node i yaitu
        // index in arr[]. n adalah size dari heap
        void heapify(int arr[], int n, int i) {
            int largest = i;  // menginisialisasikan angka terbesar sebagai root
            int l = 2*i + 1;  // anak kiri dari node = 2*i + 1
            int r = 2*i + 2;  // anak kanan dari node = 2*i + 2

            // rumus jika child kiri lebih besar dari root
            if (l < n && arr[l] > arr[largest])
                largest = l;

            // rumus jika child kanan lebih besar dari root
            if (r < n && arr[r] > arr[largest])
                largest = r;

            // jika yang terbesar bukan root
            if (largest != i)
            {
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;

                // melakukan heapify (penyusunan kembali) secara rekursif
                heapify(arr, n, largest);
            }
        }

        /* Fungsi utilitas untuk mencetak array sebanyak n*/
        static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i]+" ");
            System.out.println();
        }

        // code untuk menjalankan programnya
        public static void main(String args[])
        {
            int arr[] = {23, 43, 12, 50, 5, 17, 8, 60, 11, 3};
            int n = arr.length;

            HeapSort ob = new HeapSort();
            ob.sort(arr);

            System.out.println("Sorted array is");
            printArray(arr);
        }
    }

