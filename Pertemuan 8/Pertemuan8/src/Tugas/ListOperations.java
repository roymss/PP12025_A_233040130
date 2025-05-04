package Tugas;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
	
	public static void main(String[] args) {
        // 1. Create list dengan keyword new
        List<Integer> list = new ArrayList<>();

        // 2. Tambah elemen sehingga elemen list berisi (4, 3, 7, 8, 1, 9)
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(1);
        list.add(9);

        // 3. Tampilkan elemen list
        System.out.println("Elemen List: " + list);

        // 4. Hapus semua elemen list
        list.clear();

        // 5. Tampilkan elemen list
        if (list.isEmpty()) {
            System.out.println("List Kosong");
        } else {
            System.out.println("Elemen List: " + list);
        }
    }

}
