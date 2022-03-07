package Tree;

public class Binary_Tree {

	private TreeNode root;
	
	private class TreeNode{
		int data;
		TreeNode Left;
		TreeNode Rigth;
		
		TreeNode(int data){
			this.data= data;
		}
	}
	
	public void createBinaryTree() {
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		
		root = one;
		one.Left=two;
		one.Rigth=three;
		two.Left=four;
		two.Rigth = five;
	}
	
	public void preOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.Left);
		preOrder(root.Rigth);
		
	}
	
	public void inOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		
		inOrder(root.Left);
		System.out.print(root.data+" ");
		inOrder(root.Rigth);
		
	}
	public void postOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		
		postOrder(root.Left);
		postOrder(root.Rigth);
		System.out.print(root.data+" ");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Tree bt = new Binary_Tree();
		bt.createBinaryTree();
		System.out.println("PreOrder");
		bt.preOrder(bt.root);
		System.out.println("\n"+"InOrder");
		bt.inOrder(bt.root);
		System.out.println("\n"+"PostOrder");
		bt.postOrder(bt.root);
	}

}
