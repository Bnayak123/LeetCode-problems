package leetcodeProblames.recursion;

import java.util.Scanner;

public class CreateTree {
	private Node root;

	private static class Node {
		int value;
		Node left;
		Node right;

		public Node(int value) {
			this.value = value;
		}
	}

	public void populete(Scanner scanner) {
		System.out.println("Enter the root node");
		int value = scanner.nextInt();
		root = new Node(value);
		populete(scanner, root);

	}

	private void populete(Scanner scanner, Node node) {
		System.out.println("Do you want to enter left of :" + node.value);
		boolean left = scanner.nextBoolean();
		if (left) {
			System.out.println("Enter the left nood vaule of :" + node.value);
			int value = scanner.nextInt();
			node.left = new Node(value);
			populete(scanner, node.left);
		}

		System.out.println("Do you want to enter right of :" + node.value);
		boolean right = scanner.nextBoolean();
		if (right) {
			System.out.println("Enter the right nood vaule of :" + node.value);
			int value = scanner.nextInt();
			node.right = new Node(value);
			populete(scanner, node.right);
		}

	}

	public void display() {
		display(this.root, "");
	}

	private void display(Node nood, String indent) {
		if (nood == null) {
			return;
		}
		System.out.println(indent + nood.value);
		display(nood.left, indent + "\t");
		display(nood.right, indent + "\t");

	}

}
