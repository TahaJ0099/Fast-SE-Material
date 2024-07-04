package DS_Lab_checking;


public class InorderSuccessorPredecessor {
    
    static int successor, predecessor;

    public void successorPredecessor(Node root, int val) {
        if (root != null) {
            if (root.data == val) {
                // go to the right most element in the left subtree, it will the
                // predecessor.
                if (root.left != null) {
                    Node t = root.left;
                    while (t.right != null) {
                        t = t.right;
                    }
                    predecessor = t.data;
                }
                if (root.right != null) {
                    // go to the left most element in the right subtree, it will
                    // the successor.
                    Node t = root.right;
                    while (t.left != null) {
                        t = t.left;
                    }
                    successor = t.data;
                }
            } else if (root.data > val) {
                // we make the root as successor because we might have a
                // situation when value matches with the root, it wont have
                // right subtree to find the successor, in that case we need
                // parent to be the successor
                successor = root.data;
                successorPredecessor(root.left, val);
            } else if (root.data < val) {
                // we make the root as predecessor because we might have a
                // situation when value matches with the root, it wont have
                // left subtree to find the predecessor, in that case we need
                // parent to be the predecessor.
                predecessor = root.data;
                successorPredecessor(root.right, val);
            }
        }
    }

    public static void main(String args[]) {
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.left.right = new Node(7);
        root.left.right = new Node(15);
        root.right.left = new Node(25);
        root.right.right = new Node(35);
        root.left.right.left = new Node(13);
        root.left.right.left.right = new Node(14);

        root.left.right.right = new Node(18);
        InorderSuccessorPredecessor i = new InorderSuccessorPredecessor();
        i.successorPredecessor(root, 35);
        System.out.println("Inorder Successor of 35 is : " + successor
                + " and predecessor is : " + predecessor);
        i.successorPredecessor(root, 30);
        System.out.println("Inorder Successor of 30 is : " + successor
                + " and predecessor is : " + predecessor);
        i.successorPredecessor(root, 15);
        System.out.println("Inorder Successor of 15 is : " + successor
                + " and predecessor is : " + predecessor);
        i.successorPredecessor(root, 7);
        System.out.println("Inorder Successor of 7 is : " + successor
                + " and predecessor is : " + predecessor);
        i.successorPredecessor(root, 18);
        System.out.println("Inorder Successor of 18 is : " + successor
                + " and predecessor is : " + predecessor);
        i.successorPredecessor(root, 13);
        System.out.println("Inorder Successor of 13 is : " + successor
                + " and predecessor is : " + predecessor);
        i.successorPredecessor(root, 14);
        System.out.println("Inorder Successor of 14 is : " + successor
                + " and predecessor is : " + predecessor);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}