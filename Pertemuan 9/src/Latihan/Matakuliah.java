package Latihan;

public class Matakuliah {

    private String kode;
    private String nama;
    private int sks;

    public Matakuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    // Setter & Getter (mengikuti konvensi Java)
    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public int getSks() {
        return sks;
    }

    // ================================
    // Node Linked List & Operasi List
    // ================================

    private static Node HEAD = null;

    // Static inner class Node agar bisa dipakai di method static
    public static class Node {
        private Matakuliah data;
        private Node next;

        public Node(Matakuliah data) {
            this.data = data;
        }

        public Matakuliah getData() {
            return data;
        }

        public void setData(Matakuliah data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    // Cek apakah list kosong
    public static boolean isEmpty() {
        return HEAD == null;
    }

    // Latihan 2: Tambah node di depan
    public static void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    // Latihan 3: Tampilkan semua elemen
    public static void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node curNode = HEAD;
            while (curNode != null) {
                Matakuliah mk = curNode.getData();
                System.out.println(mk.getKode() + " - " + mk.getNama() + " - " + mk.getSks() + " SKS");
                curNode = curNode.getNext();
            }
        }
    }

    // Untuk uji coba
    public static void main(String[] args) {
        Matakuliah m1 = new Matakuliah("IF101", "Dasar Pemrograman", 3);
        Matakuliah m2 = new Matakuliah("IF102", "Struktur Data", 3);

        addHead(m1);
        addHead(m2);

        displayElement();
    }
}

	
	
