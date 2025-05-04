package Pertemuan3Tugas;


public class ListMain {
	
	public static void main(String[] args) {
		
		 System.out.println("Tes-1:");
        StrukturList list = new StrukturList();

        list.addTail(1);
        list.addTail(4);  
        list.addTail(5); 
        list.addTail(7);

        System.out.print("Elemen: ");
        list.display(); 
        
        System.out.println("\n--------------------------");
        
     // ==== Tes-2 ====
        System.out.println("Tes-2:");
        StrukturList list1 = new StrukturList();
        
        list1.addTail(3);
        list1.addTail(4);
        list1.addTail(5);
        list1.addHead(5);
        list1.addHead(4);
        list1.addHead(3);
        
        System.out.print("Output: ");
        list1.display(); // Output yang diharapkan: 3 4 5 3 4 5

        System.out.println("\n--------------------------");

        // ==== Tes-3 (a) ====
        System.out.println("Tes-3 (a):");
        StrukturList list2 = new StrukturList();
        
        list2.addHead(1);
        list2.addHead(2);
        list2.addHead(3);
        
        System.out.print("Output: ");
        list2.display(); // Output yang diharapkan: 3 2 1

        System.out.println("\n--------------------------");

        // ==== Tes-3 (b) ====
        System.out.println("Tes-3 (b):");
        StrukturList list3 = new StrukturList();
        
        list3.addHead(7);
        list3.addHead(5);
        list3.addHead(4);
        list3.addHead(1);
        
        System.out.print("Output: ");
        list3.display(); // Output yang diharapkan: 1 4 5 7
    }

}
