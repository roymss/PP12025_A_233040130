package Latihan;

public class StrukturListMain {
	
	// latihan4
	
	
	 public static void main(String[] args) {
	        // 1. Buat list baru
	        StrukturList list = new StrukturList();

	        // 2. Tambah elemen: 7, 6, 4, 2, 3 (di-depan sehingga urutan input terbalik)
	        list.addFirst(3);
	        list.addFirst(2);
	        list.addFirst(4);
	        list.addFirst(6);
	        list.addFirst(7);

	        // 3. Tampilkan elemen list
	        list.printList();  // Output: 7 6 4 2 3

	        // 4. Tampilkan size elemen list
	        System.out.println(list.size());  // Output: 5
	    }
	 
}

