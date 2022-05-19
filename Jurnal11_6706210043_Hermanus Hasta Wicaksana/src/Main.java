public class Main {
    public static void main(String[] args) {
        Tree<Character> tree = new Tree<>();
        // Inputkan data berupa character (F, E, H, D, G, C, B, H, K ,J)
        tree.insertNode('F');
        tree.insertNode('E');
        tree.insertNode('H');
        tree.insertNode('D');
        tree.insertNode('G');
        tree.insertNode('C');
        tree.insertNode('B');
        tree.insertNode('H');
        tree.insertNode('K');
        tree.insertNode('J');

        System.out.printf("%n%nPreorder traversal%n");
        tree.preorderTraversal();// mencetak Preorder traversal
        System.out.printf("%n%nInorder traversal%n");
        tree.inorderTraversal();// mencetak Inorder traversal
        System.out.printf("%n%nPostorder traversal%n");
        tree.postorderTraversal();// mencetak Preorder traversal
        System.out.println();

        System.out.println();

        tree.searchBST('K');// mencari karakter K
        tree.searchBST('A');// mencari karakter A
    }
}
