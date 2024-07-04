package DS;

class  Nodee {
	int data;
	Nodee next;
	Nodee prev;
}
public class DLL {
	
	Nodee head;
	Nodee tail;
	Nodee ptr;
	public void insert(int a) {
		
		Nodee newnode = new Nodee();
		newnode.data = a;
		newnode.next = null; 
		newnode.prev = null;
		
		if (head == null) {
			head = newnode;
		}
		
		else {
			Nodee n = head; 
			while(n.next != null) {
				n = n.next;			
			}
			n.next = newnode;
			newnode.prev = n;
		}
	}
	
	public void FPrintDll() {
		Nodee  temp = head;
		while (temp != null) {
			System.out.print(temp.data);
			tail = temp;
			temp = temp.next;			
		}		
		System.out.println();		
	}
	public void RPrintDll() {
		while (tail != null) {
			System.out.print(tail.data);
			tail = tail.prev;			
		}	
		System.out.println();
	}
	
	public void DeleteNode(int a ) {
		Nodee dtemp = head;
//		Nodee ptr;
		while (dtemp.data != a) 
		{
			tail = dtemp;
			dtemp = dtemp.next;
		}
		ptr = dtemp.next;
		ptr.prev = tail;
		tail.next = dtemp.next;
		
	}
	
	public void InsertAtFront(int a) {
		 ptr = head;
		Nodee newnode = new Nodee();
		newnode.data = a;
		newnode.next = ptr; 
		newnode.prev = null;
		
		ptr.prev = newnode;
		head = newnode;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DLL dl =  new DLL();
		dl.insert(2);
		dl.insert(3);
		dl.insert(4);
		dl.insert(5);
		dl.FPrintDll();
		dl.RPrintDll();
		dl.DeleteNode(3);
		
		dl.FPrintDll();
		dl.RPrintDll();
		
		dl.InsertAtFront(1);
		
		
		dl.FPrintDll();
		dl.RPrintDll();
	
	}

}
