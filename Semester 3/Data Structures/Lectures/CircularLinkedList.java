package DS;
public class CircularLinkedList {
	 class Node{
			int data;
			Node next;
		}
 Node  head,ptr,last;
 
 public void addNode(int a) {
	  Node newnode  =  new Node();
	  newnode.data = a;
	  
	  if (head  == null) {
		  head = newnode; 
		  last =head;
		  newnode.next = head;
	  }
	  else {
		  newnode.next = head;
		  last.next = newnode;
		  last = last.next;
	  }

	
 }
 public void print() {
	  Node n  = head; 
	  ptr = last.next;
	  do{
		  System.out.print(n.data);
		 
		  n = n.next;
	  }while(n != last.next );
	System.out.println() ;  
 }
	public void insertAthead(int a) {
		 Node newnodee  =  new Node();
		  newnodee.data = a;
		  newnodee.next =head;
		  head = newnodee;
		  last.next = newnodee;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList CL = new CircularLinkedList();
		CL.addNode(1);
		CL.addNode(2);
		CL.addNode(3);
		CL.print();
		
		CL.insertAthead(0);
		CL.print();
	}

}
