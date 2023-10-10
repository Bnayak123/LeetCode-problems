package leetcodeProblames.linked_list_and_Problems;

public class CreateSingleLinkedLIst {
	private Node head;
	private Node tail;
	int size;

	public CreateSingleLinkedLIst() {
		this.size = 0;
	}

	public void insert(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
		if (tail == null) {
			tail = head;
		}
		this.size = size + 1;

	}

	public void insertLast(int value) {
		if (tail == null) {
			insert(value);
			return;
		}
		Node node = new Node(value);
		tail.next = node;
		tail = node;
		this.size = size + 1;
	}

	public void insert(int index, int value) {
		if (index > this.size) {
			throw new IndexOutOfBoundsException();

		}
		if (index == 0) {
			insert(value);
			return;
		} else if (index == size) {
			insertLast(value);
			return;
		}
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		Node node = new Node(value, temp.next);
		temp.next = node;
		this.size += 1;

	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
	}

	public int deleteFirst() {
		int val = head.value;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		size--;
		return val;
	}

	public int deleteLast() {
		if (size <= 1) {
			return deleteFirst();
		}
		Node secoundLatNode = get(size - 2);
		int value = secoundLatNode.next.value;
		tail = secoundLatNode;
		secoundLatNode.next = null;
		size--;
		return value;
	}

	private Node get(int index) {
		Node secoundLatNode = head;
		for (int i = 0; i < index; i++) {
			secoundLatNode = secoundLatNode.next;

		}
		return secoundLatNode;
	}

	public int delete(int index) {
		if (index <= 1) {
			return deleteFirst();
		}
		if (index == size - 1) {
			return deleteLast();
		}
		Node node = get(index - 1);
		int val = node.next.value;
		node.next = node.next.next;
		size--;
		return val;

	}

	public boolean find(int value) {
		Node node = head;
		while (node != null) {
			if (node.value == value) {
				return true;
			}
			node = node.next;
		}
		return false;
	}

	public void usingRecursion(int value, int index) {
		head = usingRecursion(value, index, head);
	}

	private Node usingRecursion(int value, int index, Node node) {
		if (index == 0) {
			Node temp = new Node(value, node);
			size++;
			return temp;
		}
		node.next = usingRecursion(value, index - 1, node.next);
		return node;

	}

	public void removeDuplicate() {
		Node node = head;
		while (node.next != null) {
			if (node.value == node.next.value) {
				if (node.next.next != null) {
					node.next = node.next.next;
					size--;
				}
			} else {
				node = node.next;
			}
		}
		tail = node;
		tail.next = null;

	}
	public static CreateSingleLinkedLIst mergeTwoLit(CreateSingleLinkedLIst first,CreateSingleLinkedLIst second) {
		Node f =first.head;
		Node s=second.head;
		CreateSingleLinkedLIst ans= new CreateSingleLinkedLIst();
		while(f!=null & s!=null) {
			if(f.value<=s.value) {
				ans.insertLast(f.value);
				f=f.next;
			}
			else {
				ans.insertLast(s.value);
				s=s.next;
			}
		}
		while(f!=null) {
			ans.insertLast(f.value);
			f=f.next;
		}
		while(s!=null) {
			ans.insertLast(s.value);
			s=s.next;
		}
		return ans;
		
	}
	

	
	private class Node {
		private int value;
		private Node next;
		
		private Node() {
			
		}

		private Node(int value) {
			this.value = value;
		}

		private Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

	}

}
