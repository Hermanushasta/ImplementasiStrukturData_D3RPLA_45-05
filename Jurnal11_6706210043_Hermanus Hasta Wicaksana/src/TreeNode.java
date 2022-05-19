public class TreeNode <E extends Comparable<E>>{
    private TreeNode<E> leftNode;
    private TreeNode<E> rightNode;
    private E data; // nilai dari node
    // membuat konstruktor untuk menginisialisasi data dan menjadikannya simpul daun
    public TreeNode(E nodeData) {
        data = nodeData;
        leftNode = rightNode = null; // node tidak memiliki anak maka null
    }
    public E getData() { // fungsi untuk mendapatkan data
        return data;
    }
    public TreeNode<E> getLeftNode() { // fungsi untuk mendapatkan node kiri
        return leftNode;
    }
    public TreeNode<E> getRightNode() { // fungsi untuk mendapatkan node kanan
        return rightNode;
    }
    // menemukan titik penyisipan dan masukkan node baru; abaikan nilai yang duplikat
    public void insert(E insertValue) {
        // masukkan data di subtree kiri
        if (insertValue.compareTo(data) < 0) {
            // masukan TreeNode baru
            if (leftNode == null) {
                leftNode = new TreeNode<E>(insertValue);
            } else { // lanjut melintasi subtree kiri secara rekursif
                leftNode.insert(insertValue);
            }
        }
        // masukkan data di subtree kanan
        else if (insertValue.compareTo(data) > 0) {
            // masukan TreeNode Baru
            if (rightNode == null) {
                rightNode = new TreeNode<E>(insertValue);
            } else { // lanjut melintasi subtree kanan secara rekursif
                rightNode.insert(insertValue);
            }
        }
    }

}
