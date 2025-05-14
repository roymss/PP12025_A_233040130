package TUGAS;

public class Matakuliah {
	
	  private String kode;
	    private String nama;
	    private int sks;

	    public Matakuliah(String kode, String nama, int sks) {
	        this.kode = kode;
	        this.nama = nama;
	        this.sks = sks;
	    }

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

	    // ===============================
	    // Inner class Node dan LinkedList
	    // ===============================

	    private static Node HEAD = null;

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

	    public static boolean isEmpty() {
	        return HEAD == null;
	    }

	    // Tes-1 & Tes-2: Tambah di depan (addHead)
	    public static void addHead(Matakuliah data) {
	        Node newNode = new Node(data);
	        if (isEmpty()) {
	            HEAD = newNode;
	        } else {
	            newNode.setNext(HEAD);
	            HEAD = newNode;
	        }
	    }

	    // Tes-2: Tambah di akhir (addTail)
	    public static void addTail(Matakuliah data) {
	        Node newNode = new Node(data);
	        if (isEmpty()) {
	            HEAD = newNode;
	        } else {
	            Node cur = HEAD;
	            while (cur.getNext() != null) {
	                cur = cur.getNext();
	            }
	            cur.setNext(newNode);
	        }
	    }

	    // Tes-3: Tambah di tengah setelah kode tertentu (misalnya setelah IF002)
	    public static void addMid(Matakuliah data, String afterKode) {
	        Node newNode = new Node(data);
	        if (isEmpty()) {
	            HEAD = newNode;
	        } else {
	            Node cur = HEAD;
	            while (cur != null && !cur.getData().getKode().equals(afterKode)) {
	                cur = cur.getNext();
	            }
	            if (cur != null) {
	                newNode.setNext(cur.getNext());
	                cur.setNext(newNode);
	            } else {
	                System.out.println("Node dengan kode " + afterKode + " tidak ditemukan.");
	            }
	        }
	    }

	    // Tes-1: Menampilkan semua data
	    public static void displayElement() {
	        if (isEmpty()) {
	            System.out.println("List Kosong");
	        } else {
	            Node curNode = HEAD;
	            while (curNode != null) {
	                Matakuliah mk = curNode.getData();
	                System.out.println("Matakuliah: " + mk.getKode() + ", " + mk.getNama() + ", " + mk.getSks());
	                curNode = curNode.getNext();
	            }
	        }
	    }

	    // Tes-4: Uji coba addHead, addTail, addMid
	    public static void main(String[] args) {
	        Matakuliah mk1 = new Matakuliah("IF001", "Dasar Pemrograman", 4);
	        Matakuliah mk2 = new Matakuliah("IF002", "Pemrograman Web", 3);
	        Matakuliah mk3 = new Matakuliah("IF003", "Struktur Diskrit", 3);
	        Matakuliah mk4 = new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3);

	        addHead(mk1);               // IF001
	        addTail(mk2);               // IF002
	        addTail(mk3);               // IF003
	        addHead(mk4);               // IF004 (paling atas)

	        displayElement();           // Output sesuai Tes-1
	    }

}
