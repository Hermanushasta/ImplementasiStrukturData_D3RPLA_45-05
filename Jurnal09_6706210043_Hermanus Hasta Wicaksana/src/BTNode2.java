public class BTNode2 <E>{
    BTNode2 left, right;
    E data;
    /* Pembuatan Constructor*/
    public BTNode2() {
        left = null;
        right = null;
        data = null;
    }
    /* Pembuatan Constructor */
    public BTNode2(E item) {
        left = null;
        right = null;
        data = item;
    }
    /* Membuat fungsi untuk mengatur node kiri */
    public void setLeft(BTNode2 n) {
        left = n;
    }
    /* Membuat fungsi untuk mengatur node kanan */
    public void setRight(BTNode2 n) {
        right = n;
    }
    /* Membuat fungsi untuk mengambil node kiri */
    public BTNode2 getLeft() {
        return left;
    }
    /* Membuat fungsi untuk mengambil node kanan */
    public BTNode2 getRight() {
        return right;
    }
    /* Membuat fungsi untuk mengatur data ke node */
    public void setData(E d) {
        data = d;
    }
    /* Membuat fungsi untuk mendapatkan data dari node */
    public E getData() {
        return data;
    }
}
