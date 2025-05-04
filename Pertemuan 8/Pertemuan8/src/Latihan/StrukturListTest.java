package Latihan;

public class StrukturListTest {
	
	// Latihan 2
	
	public static void main(String[] args) {
        StrukturList list = new StrukturList();
        
        // 1. Create list dengan keyword new
        list.HEAD = new Node(5);
        
        // 2. Tambah elemen 5 di akhir list
        Node second = new Node(4);
        list.HEAD.setNext(second);
        
        // 3. Tambah elemen 6 di akhir list
        Node third = new Node(6);
        second.setNext(third);
        
        // 5. Tampilkan elemen list
        Node currentNode = list.HEAD;
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println();
        
        // 6. Cari elemen bernilai 6
        boolean found = list.find(6);
        System.out.println(found);
        
        
        
        
       
    }
	
}
