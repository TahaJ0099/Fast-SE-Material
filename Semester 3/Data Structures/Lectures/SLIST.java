package DS;
class Node{
	int data;
	Node next;
}

public class SLIST {
	Node head;
	Node ptr;
	Node Ptrr;
	public void insert(int a) {
		
		Node newnode  = new Node();
		newnode.data = a;
		newnode.next =null;
		
		if (head==null) {
			head = newnode;
		}
		
		else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = newnode;
		}
	}
	
	// Traversal 
	public void SListPirnt() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	// any node delete
	public void AnyNodeDelete(int a) {
		Node Dtemp =head;
		
		while(Dtemp.data != a) {
			ptr = Dtemp;
			Dtemp = Dtemp.next;				
		}	
		ptr.next = Dtemp.next;
		Dtemp =  null;
		
	}
	
	// Append at Front
	public void AtFront(int a) {
		
		Node newNode = new Node();
		newNode.data = a;
		newNode.next = head;
		head  = newNode;
		
	}
	// Pre Append
	public void PreAppend(int newValue, int CounterValue) {
		Node Ptemp = head;
		while(Ptemp.data != CounterValue) {
			
			Ptrr = Ptemp;
			Ptemp  = Ptemp.next;
		}
		Node newNode = new Node();
		newNode.data = newValue;
		newNode.next = Ptemp;
		Ptrr.next = newNode;		

	}
	// PostApprend
	public void PostAppend(int newValue, int CounterValue) {
		Node Ptemp = head;
		while(Ptemp.data != CounterValue) {
			
			Ptrr = Ptemp;
			Ptemp  = Ptemp.next;
		}
		Node newNode = new Node();
		newNode.data = newValue;
		newNode.next = Ptemp.next;
		Ptemp.next = newNode;		

	}
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		SLIST sl = new SLIST();
		sl.insert(2);
		sl.insert(3);
		sl.insert(4);
		sl.insert(5);
		sl.SListPirnt();
		
		sl.AnyNodeDelete(3);
		System.out.println("After Deletion");
		sl.SListPirnt();
		
		sl.insert(6);
		System.out.println("After Insertion");
		sl.SListPirnt();
		
		System.out.println("After Insertion AT Head");
		sl.AtFront(1);
		sl.SListPirnt();
		
		System.out.println("Pre Insertion AT 4");
		sl.PreAppend(3, 4);
		sl.SListPirnt();
		
		sl.AnyNodeDelete(5);
		System.out.println("After Deletion");
		sl.SListPirnt();
		
		System.out.println("post Insertion AT 4");
		sl.PostAppend(5, 4);
		sl.SListPirnt();
		
		
		
		

	}

}
