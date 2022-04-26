import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Membuat sebuah objek binary tree dengan singkatan bt */
        BinaryTree2 bt = new BinaryTree2();
        /* Perform tree operations */
        System.out.println("Binary Tree Test");
        char ch;
        do { /* Menampilkan pilihan menu yang nantinya akan digunakan*/
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. insert ");/* Menu memasukkan data */
            System.out.println("2. search"); /* Menu mencari sebuah data */
            System.out.println("3. count nodes"); /* Menu menghitung jumlah node */
            System.out.println("4. check empty"); /* Menu untuk mengecek tree kosong atau tidak */
            int choice = scan.nextInt(); /* Pilih menu menggunakan angka */
            scan.nextLine();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter integer element to insert");
                    bt.insert( scan.nextInt() );/* memanggil fungsi insert */
                    break;
                case 2 :
                    System.out.println("Enter integer element to search");
                    System.out.println("Search result : "+ bt.search(/* memanggil fungsi search */
                            scan.nextInt() ));
                    break;
                case 3 :
                    System.out.println("Nodes = "+ bt.countNodes());/* memanggil fungsi countNodes */
                    break;
                case 4 :
                    System.out.println("Empty status = "+ bt.isEmpty());/* memanggil fungsi isEmpty*/
                    break;
                default :
                    System.out.println("Wrong Entry \n ");/* bila inputan user salah*/
                    break;
            }
            /* Untuk menampilkan tree */
            System.out.print("\nPost order : ");/* Menampilkan tree secara postorder */
            bt.postorder();
            System.out.print("\nPre order : ");/* menampilkan tree secara preorder */
            bt.preorder();
            System.out.print("\nIn order : ");/* menampilkan tree secara inorder*/
            bt.inorder();
            System.out.println("\n\nDo you want to continue (Type y or n)\n");
                    ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}
