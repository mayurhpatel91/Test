
import java.util.Stack; 
public class BSTPrintLeafNode {
	
	public static void main(String[] args) throws Exception {
		TreeNode n10 = new TreeNode(1);
		TreeNode n34 = new TreeNode(34);
		TreeNode n43 = new TreeNode(43);
		TreeNode n78 = new TreeNode(78);
		TreeNode n25 = new TreeNode(25, n10, n34);
		TreeNode n65 = new TreeNode(65, n43, n78);
		TreeNode root = new TreeNode(50, n25, n65); 
		
		System.out .println("Printing all leaf nodes of a binary tree in Java (recursively)"); printLeafNodes(root);

		System.out.println();
		
		System.out.println("Printing all leaf nodes of binary tree in Java using stack");
		printLeafNodesIteratively(root);

		
			
	}



private static class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;

	TreeNode(int data) {
		this.value = data;
	}

	TreeNode(int data, TreeNode left, TreeNode right) {
		this.value = data;
		this.left = left;
		this.right = right;
	}
} 

	public static void printLeafNodes(TreeNode node) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			System.out.printf("%d ", node.value);
		}
		printLeafNodes(node.left);
		printLeafNodes(node.right);
	}

	public static void printLeafNodesIteratively(TreeNode root) {
		if (root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if (node.right != null) {
				stack.add(node.right);
			}
			if (node.left != null) {
				stack.add(node.left);
			}
			if (node.left == null && node.right == null) {
				System.out.printf("%d ", node.value);
			}
		}
	}

	

}