package DS;


public class DoubleCircularLinkedList {
	
	class Node{
		int data;
		Node next;
		Node prev;
	}
	
	Node head,last; 
	
	  public void insert(int a) {
		  Node newnode = new Node();
		  newnode.data = a;
		  
		  if(head == null) {
			  head = newnode ; 
			  newnode.next = head;
			  newnode.prev = head;
			  last =head;
			  
		  }
		  else {
		
			  newnode.next = head;
			  newnode.prev = last;
			  last.next = newnode;
			  last = last.next;			  
		  }
		  
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleCircularLinkedList DCLL = new DoubleCircularLinkedList();
		DCLL.insert(2);
		DCLL.insert(3);
		DCLL.insert(4);
		
		//DCLL.Fprint();
		
	}

}
