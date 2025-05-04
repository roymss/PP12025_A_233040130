package Latihan;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class StrukturList {
	
	Node HEAD;

    public StrukturList() {
        HEAD = null;
    }
    
    // latihan 1
    
    public boolean find(int x) {
        Node curNode = HEAD;
        boolean ketemu = false;

        while (curNode != null && !ketemu) {
            if (curNode.getData() == x) {
                ketemu = true;
            } else {
                curNode = curNode.getNext();
            }
        }
        return ketemu;
    }



// latihan 3
    
 // Menambahkan elemen di awal list
 public void addFirst(int data) {
     Node newNode = new Node(data);
     newNode.next = HEAD;
     HEAD = newNode;
 }

 // Fungsi size() seperti pada algoritma
 public int size() {
     Node curNode = HEAD;
     int jumlah = 0;

     while (curNode != null) {
         jumlah++;
         curNode = curNode.next;
     }

     return jumlah;
 }

 // Menampilkan elemen dalam list
 public void printList() {
     Node curNode = HEAD;
     while (curNode != null) {
         System.out.print(curNode.data + " ");
         curNode = curNode.next;
     }
     System.out.println();
 }
}
