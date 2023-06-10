import java.util.*;

public class DLL {
	Queue<String> Q = new LinkedList<>();


Node head , tail ;
int size=0;
public void addNode(PhonebookData PN) {
	if (Q.contains(PN.phoneNumber)==false) {
			Node newNode = new Node( PN);
			 
			if(head ==null) {
					head =tail =newNode ;
					Q.add(PN.phoneNumber);
				
			}
			else {
					tail.next=newNode;
					newNode.previous=tail;
					tail=newNode;
				    tail.next =null;
					Q.add(PN.phoneNumber);
			}
	}
	else{
			System.out.println("The number has already been added");
	}
	
}
public Node Search(String searchItem) {
	tempDL tempDLL = new tempDL();
	Node tempCurr = null;
    Node current = head;
	    if (head == null) {
	        System.out.println("This number is not saved on the phone");
	
	    }
	    else{//    System.out.println("Nodes of doubly linked list: ");
		    while (current != null) {
		        //Checks each node by incrementing the pointer.
		        if (current.data.name.contains(searchItem.toLowerCase().strip()) || current.data.phoneNumber.contains(searchItem)) {
			        	tempDLL.addtemp(current.data);
			        	tempCurr = current;
		        }
		        current = current.next;
		    }
		    
			    if (tempDLL.head!=null) {
					      System.out.println("Search results:");  tempDLL.print();
					      return tempCurr;
			      }
			    
			    else {
		    			  System.out.println("No search results found...");
			    }
		    }
		return null;
}
public void addFirst(Node N ) {
	
	Node newNode = new Node( N.data);
	if (head==null ) {
		head=tail=newNode;
		size++;
		}
	else {
		newNode.next=head;
		newNode.previous=null;
	    head.previous=newNode;
	    head=newNode;
	    size++;
	    }
	}

public void Delete(Node DN) {
	Node Htemp=head;
	Node Ttemp=tail;
	if(Htemp == DN) {
		
		head.previous=null;
		head =head.next;
		Htemp.next=null;
	}
	else if (Ttemp==DN) {
       tail=tail.previous;
       tail.next=null;
       Ttemp.previous=Ttemp.next=null;
	}
	else {
		while(Ttemp.previous.previous!=null) {
			Ttemp =Ttemp.previous;
			if(Ttemp==DN) {
					DN.next.previous=DN.previous;
					DN.previous.next=DN.next;
					DN.previous	=DN.next=null;
					break;
			}
		}
	}
}
public void print() {
	Node h =head;
		while (h!=null) {
				System.out.println(h.data.name+" , "+h.data.phoneNumber);
				h=h.next;
		}
}
}
