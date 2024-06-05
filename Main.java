public class Main{
	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		
		System.out.println("In-Order traversal of the Binary Tree:");
		tree.inOrder();//call to method to print the Binary Tree in in-order
		
		System.out.println("Pre-Order traversal of the Binary Tree:");
		tree.preOrder();//call to method to print the Binary Tree in pre-order
		
		System.out.println("Post-Order traversal of the Binary Tree:");
		tree.postOrder();//call to method to print the Binary Tree in post-order
	}
}