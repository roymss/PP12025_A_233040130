package Pertemuan3;

public class ListMain {
	
	public static void main(String[] args) {
        StrukturList list = new StrukturList(); // Membuat list

        list.addTail(3); // Tambah elemen 3
        list.addTail(4); // Tambah elemen 4
        list.addTail(5); // Tambah elemen 5

        System.out.print("Elemen: ");
        list.display(); // Menampilkan elemen list
    }

}
