public class Tree <E extends Comparable<E>> {
    private TreeNode<E> root;
    // membuat konstruktor untuk menginisialisasi pohon yang tidak ada bilangan bulat
    public Tree() {
        root = null;
    }
    // memasukkan sebuah node baru di Binary Search Tree
    public void insertNode(E insertValue) {
        if (root == null) {
            root = new TreeNode<E>(insertValue); // membuat node atau simpul akar
        } else {
            root.insert(insertValue); // memanggil method masukan nilai
        }
    }
    // memulai preorder traversal
    public void preorderTraversal() {
        preorderHelper(root);
    }
    // metode rekursif untuk melakukan preorder traversal
    private void preorderHelper (TreeNode<E> node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.getData()); // keluaran data node
        preorderHelper(node.getLeftNode()); // traverse subtree kiri
        preorderHelper(node.getRightNode()); // traverse subtree kanan
    }
    // memulai inorder traversal
    public void inorderTraversal() {
        inorderHelper(root);
    }
    // metode rekursif untuk melakukan inorder traversal
    private void inorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        inorderHelper(node.getLeftNode()); // traverse subtree kiri
        System.out.printf("%s ", node.getData()); // keluaran data node
        inorderHelper(node.getRightNode()); // traverse subtree kanan
    }
    // memulai postorder traversal
    public void postorderTraversal() {
        postorderHelper(root);
    }
    // metode rekursif untuk melakukan postorder traversal
    private void postorderHelper (TreeNode<E> node) {
        if (node == null) {
            return;
        }
        postorderHelper(node.getLeftNode()); // traverse subtree kiri
        postorderHelper(node.getRightNode()); // traverse subtree kanan
        System.out.printf("%s ", node.getData()); // keluaran data node
    }
    public void searchBST(E key){ // fungsi untuk mencari data yang diinginkan
        boolean hasil = searchBSTHelper(root, key);
        if(hasil)
            System.out.println("Data '" +key+"' ditemukan"); //mencetak hasil pencarian
        else
            System.out.println("Data '" +key+ "' tidak ditemukan"); // mencetak hasi pencarian
    }
    //Carrano
    public boolean searchBSTHelper(TreeNode<E> node, E key){
        boolean result = false;
        if(node!=null){
            if(key.equals(node.getData()))
                result = true;
            else if(key.compareTo(node.getData())<0)
                result = searchBSTHelper(node.getLeftNode(),key);
            else
                result = searchBSTHelper(node.getRightNode(),key);
        }
        return result;
    }
}
