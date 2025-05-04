package Pertemuan3Tugas;


public class StrukturList {
	 private Node HEAD; // Pointer ke awal list

	    public StrukturList() {
	        this.HEAD = null;
	    }

	    // Mengecek apakah list kosong
	    public boolean isEmpty() {
	        return HEAD == null;
	    }

	    // Menambahkan elemen di akhir list
	    public void addTail(int data) {
	        Node newNode = new Node(data);

	        if (isEmpty()) {
	            HEAD = newNode;
	        } else {
	            Node posNode = null, curNode = HEAD;

	            while (curNode != null) {
	                posNode = curNode;
	                curNode = curNode.getnext();
	            }

	            posNode.setnext(newNode);
	        }
	    }

	    // Menampilkan elemen dalam list (Latihan 3)
	    public void display() {
	        Node curNode = HEAD;
	        while (curNode != null) {
	            System.out.print(curNode.getData() + " ");
	            curNode = curNode.getnext();
	        }
	        System.out.println();
	    }
	    
	    // Menambahkan elemen di awal list (Latihan 5)
	    public void addHead(int data) {
	        Node newNode = new Node(data);
	        if (isEmpty()) {
	            HEAD = newNode;
	        } else {
	            newNode.setnext(HEAD);
	            HEAD = newNode;
	        }
	    }
}


