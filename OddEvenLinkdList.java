package leetcodeProblames;

import java.util.Arrays;

public class OddEvenLinkdList {
	public static ListNode oddEvenList(ListNode head) {
		ListNode odd = new ListNode(-1);
		ListNode even = new ListNode(-1);
		ListNode oddHead = odd;
		ListNode evenHead = even;
		ListNode node = head;
		int i = 1;
		while (node != null) {
			if (i % 2 == 1) {
				oddHead.next = node;
				oddHead = oddHead.next;
			} else {
				evenHead.next = node;
				evenHead = evenHead.next;
			}
			node = node.next;
			i++;
		}
		evenHead.next = null;
		oddHead.next = even.next;
		return odd.next;

	}

	public static void main(String[] args) {
		ListNode node1= new ListNode();
		node1.val=7;
		
		
		ListNode node2 = new ListNode(4,node1);
		ListNode node3 = new ListNode(6,node2);
		ListNode node4 = new ListNode(5,node3);
		ListNode node5 = new ListNode(3,node4);
		ListNode node6 = new ListNode(1,node5);
		ListNode head= new ListNode(2,node6);
		
		
		
		
		ListNode oddEvenList = oddEvenList(head);
		
		int[] ans=  new int[7];
		int i=0;
		while(oddEvenList!=null) {
			ans[i]=oddEvenList.val;
			i++;
			oddEvenList=oddEvenList.next;
		}
		System.out.println(Arrays.toString(ans));
		
		System.out.println();
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
