package leetcodeProblames;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode1 {
	int val;
	int min=Integer.MIN_VALUE;
	TreeNode1 left;
	TreeNode1 right;

	TreeNode1() {
	}

	TreeNode1(int val) {
		this.val = val;
	}

	TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public static void main(String[] args) {
		TreeNode1 leftNode = new TreeNode1(2);
		leftNode.left = new TreeNode1(4);
		leftNode.right = new TreeNode1(5);
		TreeNode1 rightNode = new TreeNode1(3);

		TreeNode1 root = new TreeNode1(1, leftNode, rightNode);

		Solutions solutions = new Solutions();

		// System.out.println(solutions.diameterOfBinaryTree(root));
		List<Integer> display = solutions.display(solutions.invertTree(root));
		System.out.println(Arrays.toString(display.toArray()));

	}
}

class Solutions {
	int diameter = 0;

	public int diameterOfBinaryTree(TreeNode1 root) {
		if (root == null) {
			return 0;
		}
		hight(root);
		return diameter - 1;

	}

	public int hight(TreeNode1 node) {
		if (node == null) {
			return 0;
		}
		int leftNode = hight(node.left);
		int rightNode = hight(node.right);
		int dia = leftNode + rightNode + 1;
		diameter = Math.max(diameter, dia);
		return Math.max(leftNode, rightNode) + 1;
	}

	public TreeNode1 invertTree(TreeNode1 root) {
		if (root == null) {
			return null;
		}
		TreeNode1 left = invertTree(root.left);
		TreeNode1 right = invertTree(root.right);
		root.left = right;
		root.right = left;
		return root;

	}

	public List<Integer> display(TreeNode1 node1) {
		List<Integer> ans = new ArrayList<>();
		Queue<TreeNode1> queue = new LinkedList<>();
		queue.add(node1);
		while (!queue.isEmpty()) {
			int length = queue.size();
			for (int i = 0; i < length; i++) {
				TreeNode1 node = queue.poll();
				ans.add(node.val);
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
		}
		return ans;
	}

}
