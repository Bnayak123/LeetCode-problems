package leetcodeProblames;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
      }
     
     public static List<Integer> rightSideView(TreeNode root) {
    	 List<Integer> ans= new ArrayList<>();
         if(root==null){
        return ans;
    }
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int lengthSize=queue.size();
            for(int i=0;i<lengthSize;i++){
                TreeNode node= queue.poll();
                if(i==lengthSize-1){
                ans.add(node.val);
            }
                if(node.left!=null){
                    queue.offer(node.left);
                }
                 if(node.right!=null){
                    queue.offer(node.right);
                }
            }
        }
    return ans;
}
     
     public static void main(String[] args) {
		TreeNode right= new TreeNode(2);
		TreeNode root= new TreeNode(1, right,null);
		List<Integer> rightSideView = rightSideView(root);
		System.out.println(rightSideView);
		
	}
 }