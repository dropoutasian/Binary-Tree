public class BinaryTree {
	
	private TreeNode root;//root of the binary tree
	
	private class TreeNode{//creation of the binary tree node
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		
		public TreeNode(int data) {//constructor fore creating tree nodes with given data
			this.data=data;
		}
	}
	public BinaryTree() { //constructor to initialize the binary tree with a specific structure
		TreeNode first=new TreeNode(13);//naming and creating Tree Nodes with their respective values
		TreeNode second=new TreeNode(21);
		TreeNode third=new TreeNode(10);
		TreeNode fourth=new TreeNode(79);
		TreeNode fifth=new TreeNode(66);
		TreeNode sixth=new TreeNode(23);
		TreeNode seventh=new TreeNode(45);
		
		root=first; // first is overall root of the tree
		first.left=second;// second <-L- first
		first.right=third;// first -R-> third
		//second is the left child of the root with two more children being the fourth and fifth nodes
		second.left=fourth;// fourth <-L- second
		second.right=fifth;// second -R-> fifth
		//third is the right child of the root with two more 
		third.left=sixth;// sixth<-L- third
		third.right=seventh;// third -R-> seventh
	}
	public void inOrder() { //method for the in-order traversal of the binary tree
		inOrderRec(root);
		System.out.println(); //new line for better output
	}
	private void inOrderRec(TreeNode root) { //recursive method for in-order traversal
		if(root!=null) {
			inOrderRec(root.left);
			System.out.print(+ root.data + " ");
			inOrderRec(root.right);
		}
	}
	public void preOrder() {//method for the pre-order traversal of the binary tree
		preOrderRec(root);
		System.out.println(" ");//new line for better output
	}
	private void preOrderRec(TreeNode root) { //recursive method for pre-order traversal
		if(root!=null) {
			System.out.print(root.data + " ");
			preOrderRec(root.left);
			preOrderRec(root.right);
		}
	}
	
	public void postOrder() { //method for the post-order traversal of the binary tree
		postOrderRec(root);
		System.out.println(); //new line for better output
	}
	private void postOrderRec(TreeNode root) { //recursive method for post-order traversal
		if(root!=null) {
			postOrderRec(root.left);
			postOrderRec(root.right);
			System.out.print(root.data + " ");
		}
	}
}