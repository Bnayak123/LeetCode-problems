package leetcodeProblames.linked_list_and_Problems;

public class CircularLinkedList {
	private Node head;
	private Node tail;

	public CircularLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void insert(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			tail = node;
			return;
		}
		tail.next = node;
		node.next = head;
		tail = node;
	}

	public void dispaly() {
		Node node = head;
		if (node != null) {
			do {
				System.out.print(node.value + "-> ");
				node = node.next;

			} while (node != head);
		}
		System.out.print("Head");
	}

	public void delete(int value) {
		Node node = head;
		if (node.value == value) {
			head = node.next;
			tail.next = head;
			return;
		}
		do {
			Node n = node.next;
			if (n.value == value) {
				node.next = n.next;
				break;
			}
			node = node.next;
		} while (node != head);
	}

	private class Node {
		int value;
		Node next;

		private Node(int value) {
			this.value = value;

		}

		private Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

}
