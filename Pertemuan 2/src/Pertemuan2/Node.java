package Pertemuan2;


public class Node {
	private int Nilai;
	private Node Next;
	
	// inisialisasi Node
	
	public Node(int Nilai) {
		this.Nilai = Nilai;
	}
	
	// setter & getter
	
	// setter
	public void setNilai(int Nilai) {
        this.Nilai = Nilai;
    }
	
	// getter
	 public int getNilai() {
	        return Nilai;
	    }
	
	// Setter untuk next node
	    public void setNext(Node Next) {
	        this.Next = Next;
	    }

	// Getter untuk next node
	    public Node getNext() {
	        return Next;
	    }
}
