package Pertemuan3;

public class Node {
	
	private int data;
	private Node next;
	
	
	/** 
	 * Inisialisasi atribute Node
	 */
	public Node (int data) {
		this.data = data;
		this.next = null;
	}
	
	// Setter
	public void setnext(Node next) {
        this.next = next;
    }
	
	public int getData() {
        return data;
    }
	
	// Getter
    public Node getdata() {
        return next;
    }
    
    public Node getnext() {
    	return next;
    }
}
