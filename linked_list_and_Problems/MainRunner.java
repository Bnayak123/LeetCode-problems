package linked_list_and_Problems;

public class MainRunner{

public static void main(String[] args) {
		CreateSingleLinkedLIst ll = new CreateSingleLinkedLIst();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		
		CreateSingleLinkedLIst l2 = new CreateSingleLinkedLIst();
		l2.insert(40);
		l2.insert(60);
	
		
		CreateSingleLinkedLIst mergeTwoLit = CreateSingleLinkedLIst.mergeTwoLit(ll, l2);
		mergeTwoLit.display();
		
		
		
		
		
		
//		ll.insert(10);
//		ll.insert(20);
//		ll.insert(30);
//		ll.insertLast(50);
//		ll.insert(4, 40);
//		System.out.println(ll.find(20));
//		ll.display();
//
//		System.out.println();
//		System.out.println(ll.deleteFirst());
//		ll.display();
//		System.out.println();
//		System.out.println(ll.deleteLast());
//		ll.display();
//		System.out.println();
//		System.out.println(ll.delete(2));
//		ll.display();
//

//
//		System.out.println("=========================================================================");
//
//		CreateDoublyLinkedList dll = new CreateDoublyLinkedList();
//		dll.insertFirst(20);
//		dll.insertFirst(30);
//		dll.insertFirst(45);
//		dll.insertFirst(25);
//		dll.display();
//		System.out.println();
//		dll.displayRev();
//		System.out.println();
//		dll.insertLat(10);
//		dll.insertLat(80);
//		dll.insertLat(15);
//		dll.display();
//		System.out.println();
//		dll.displayRev();
//		dll.insert(2, 70);
//		dll.insert(4, 75);
//		System.out.println();
//		dll.display();
//		System.out.println(dll.delete(75));
//		System.out.println();
//		dll.displayRev();
//
//		System.out.println("========================================================================");
//
//		CircularLinkedList cll = new CircularLinkedList();
//		cll.insert(10);
//		cll.insert(20);
//		cll.insert(30);
//		cll.insert(40);
//		cll.insert(50);
//		cll.dispaly();
//		cll.delete(50);
//		System.out.println();
//		cll.dispaly();

	}

}
