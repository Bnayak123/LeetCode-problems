package leetcodeProblames.linked_list_and_Problems;

public class CreateDoublyLinkedList {

	private Node head;
	private Node tail;
	private int size;

	public CreateDoublyLinkedList() {
		this.size = 0;
	}

	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		node.prev = null;
		if (head != null) {
			head.prev = node;
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}
			last = tail;

		} else {
			tail = node;
		}
		head = node;

		this.size += 1;

	}

	public void insertLat(int value) {
		if (head != null) {
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}
			Node node = new Node(value);
			last.next = node;
			node.next = null;
			node.prev = last;
			tail = node;
			size = size + 1;
		} else {
//			Node node = new Node(value);
//			node.next=head;
//			node.prev=null;
//			head=node;
//			tail=head;
			insertFirst(value);
		}

	}

	public void insert(int index, int value) {
		if (index > size) {
			throw new IndexOutOfBoundsException();
		}
		if (index <= 1) {
			insertFirst(value);
			return;
		}
		if (index == size) {
			insertLat(value);
			return;
		}

		Node node = new Node(value);
		Node temp = get(index);
		node.next = temp.next;
		temp.next = node;
		node.prev = temp;
		node.next.prev = node;

		size += 1;

	}

	private Node get(int index) {

		Node node = head;
		if (index == 2) {
			return node;
		}
		for (int i = 1; i < index; i++) {
			node = node.next;
		}

		return node;
	}

	public void display() {
		Node node = head;
		while (node != null) {
			System.out.print(node.value + "-> ");
			node = node.next;

		}
		System.out.println("end");
	}

	public void displayRev() {
		Node node = tail;
		while (node != null) {
			System.out.print(node.value + "-> ");
			node = node.prev;

		}
		System.out.println("end");
	}

	public int delete(int value) {
		Node temp = fiend(value);
		int val = -1;
		if (temp != null) {
			val = temp.value;
			if (temp.prev == null) {
				temp.next.prev = null;
				head = temp.next;
				temp = null;

			} else if (temp.next == null) {
				temp.prev.next = null;
				tail = temp.prev;
				temp = null;

			} else {
				temp.prev.next = temp.next;
				temp.next.prev = temp.prev;
				temp = null;
			}
		}
		return val;

	}

	private Node fiend(int value) {
		Node node = head;
		while (node != null) {
			if (node.value == value) {
				return node;
			}
			node = node.next;
		}
		return null;
	}
//	public void displayRev() {
//		Node node = head;
//		Node last = null;
//		while (node != null) {
//			last = node;
//			node = node.next;
//
//		}
//		while (last != null) {
//			System.out.print(last.value + "-> ");
//			last = last.prev;
//		}
//		System.out.println("end");
//	}

	private class Node {
		private int value;
		private Node next;
		private Node prev;

		private Node(int value) {
			this.value = value;
		}

		private Node(int value, Node next, Node prev) {
			this.value = value;
			this.prev = prev;
			this.next = next;
		}

	}
}
