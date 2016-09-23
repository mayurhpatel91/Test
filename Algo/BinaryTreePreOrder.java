
import java.util.Stack; 
public class BinaryTreePreOrder {
	/*
	 * Java Program to print all leaf nodes of given binary tree.
	 * This program demonstrates both recursive and iterative solution
	 * of this problem.
	 * 
	 * input :   50
	 *         /   \
	 *       25     65
	 *      /  \   /  \
	 *     10  34  43  78
	 * 
	 * output: 10 34 43 78 
	 */
	public static void main(String[] args) throws Exception {
		TreeNode n10 = new TreeNode(10);
		TreeNode n34 = new TreeNode(34);
		TreeNode n43 = new TreeNode(43);
		TreeNode n78 = new TreeNode(78);
		TreeNode n25 = new TreeNode(25, n10, n34);
		TreeNode n65 = new TreeNode(65, n43, n78);
		TreeNode root = new TreeNode(50, n25, n65); 
		
		System.out .println("Printing  pre order of a binary tree in Java (recursively)");
		printPreOrder(root);

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

	public static void printPreOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		
		System.out.printf("%d ", node.value);
		printPreOrder(node.left);
		printPreOrder(node.right);
	}

	public static void printLeafNodesIteratively(TreeNode root) {
		if (root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			System.out.printf("%d ", node.value);
			if (node.right != null) {
				stack.add(node.right);
			}
			if (node.left != null) {
				stack.add(node.left);
			}
			
			
		}
	}

	

}