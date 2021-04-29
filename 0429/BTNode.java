package dataStructure;

class TreeNode{ 
	Object data;
	TreeNode left;
	TreeNode right; 
}

class LinkedTree{
	private TreeNode root;
	public TreeNode makeBT(TreeNode bt1, Object data, TreeNode bt2){ 
		TreeNode root = new TreeNode();
		root.data = data;
		root.left = bt1;
		root.right = bt2;
		return root; 
		}
	
public void preorder(TreeNode root){ 
	if(root != null){
		System.out.printf("%c", root.data); 
		preorder(root.left); 
		preorder(root.right);
			}
 		} 

public void inorder(TreeNode root){ 
	if(root != null){
		inorder(root.left); 
		System.out.printf("%c", root.data);
		inorder(root.right); 
		}
}

public void postorder(TreeNode root){
	if(root != null){ 
		postorder(root.left);
	}
		postorder(root.right);
		System.out.printf("%c", root.data); 
	}
}

 

public class BTNode <Key extends Comparable<Key>> { 
	private Key item;
	private BTNode<Key> left; private BTNode<Key> right;
	
	public BTNode( Key newItem, BTNode<Key> lt, BTNode<Key> rt ) { // 노드 생성자 
	item = newItem; left = lt; right = rt; 
	}
	public Key getKey( ) { return item; } 
	public BTNode<Key> getLeft( ) { return left; } 
	public BTNode<Key> getRight( ) { return right;}
	public void setKey(Key newItem) { item = newItem; } 
	public void setLeft(BTNode<Key> lt) { left = lt; } 
	public void setRight(BTNode<Key> rt) { right = rt; }
	
	}
