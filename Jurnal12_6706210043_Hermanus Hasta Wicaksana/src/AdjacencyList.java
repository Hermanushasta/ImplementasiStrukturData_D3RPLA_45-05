import java.util.LinkedList;

public class AdjacencyList {
    int V;
    LinkedList<Character> adjListArray[];
    // membuat constructor
    AdjacencyList(int V) {
        this.V = V;
        // menentukan ukuran array
        // yang menunjukkan jumlah simpul
        adjListArray = new LinkedList[V];
        // membuat daftar baru setiap simpul
        // sehingga simpul yang berdekatan dapat disimpan
        for (int i = 0; i < V; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }
    // menambahkan sisi ke graph tak berarah
    public void addEdge(char src, char dest) {
        // menambahkan sebuah src(source) to dest(destination).
        int intsrc = (int)src - 65;
        adjListArray[intsrc].add(dest);
    }
    // fungsi utilitas untuk mencetak representasi
    // daftar adjacency dari graph
    public void printGraph() {
        for (int i = 0; i < V; i++) {
            if (adjListArray[i].size() > 0) {
                char vertex = (char)(i + 65); // untuk mengetahui vertex mana atau vertex apa
                // hasil print out-nya
                System.out.print("Vertex " + vertex + " is connected to: ");
                //perulangan untuk mencetak vertex tetangga yang dicari
                for (int j = 0; j < adjListArray[i].size(); j++) {
                    System.out.print(adjListArray[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}
