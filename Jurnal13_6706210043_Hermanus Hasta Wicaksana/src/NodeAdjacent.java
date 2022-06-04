public class NodeAdjacent { //membuat kelas simpul(NodeAdjacent)
    private int data;
    private boolean visited=false;

    NodeAdjacent(int data) {//NodeAdjacent atau node tetangga
        this.data = data;//dengan tipe data integer
    }

    public int getData() {//mengambil data
        return data;//mengembalikan data
    }

    public boolean isVisited() {//fungsi apakah node isi/sudah dikunjungi
         return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;//menandai node telah dikunjungi
    }
}
