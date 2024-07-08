package DS;

import java.util.Scanner;

//Binary Tree in Java

//Node creation
class Nod {
int key;
Nod left, right;
public Nod(int data) {
	key = data;
}
}
class BinaryTree {
Nod root;

// Traverse Inorder
public void traverseInOrder(Nod node) {
if (node != null) {
 traverseInOrder(node.left);
 System.out.print(" " + node.key);
 traverseInOrder(node.right);
}
}

// Traverse Postorder
public void traversePostOrder(Nod node) {
if (node != null) {
 traversePostOrder(node.left);
 traversePostOrder(node.right);
 System.out.print(" " + node.key);
}
}

// Traverse Preorder
public void traversePreOrder(Nod node) {
	
if (node != null) {
 System.out.print(" " + node.key);
 traversePreOrder(node.left);
 traversePreOrder(node.right);
}
}
public Nod create() {
	Scanner sc = new Scanner(System.in);
	Nod root = null;
	System.out.println("Enter data: ");
	int data = sc.nextInt();
	
	if(data == -1) return null;
	
	root = new Nod(data);
	
	System.out.println("Enter left for " + data);
	root.left = create();
	
	System.out.println("Enter right for "+ data);
	root.right = create();
	
	return root;	
}

public static void main(String[] args) {
BinaryTree tree = new BinaryTree();
Nod RootNode;
	
	RootNode = tree.create();
	System.out.print("P :  "+ RootNode.key);
System.out.print("Pre order Traversal: ");
tree.traversePreOrder(RootNode);
System.out.print("\nIn order Traversal: ");
tree.traverseInOrder(RootNode);
System.out.print("\nPost order Traversal: ");
tree.traversePostOrder(RootNode);
}
}
