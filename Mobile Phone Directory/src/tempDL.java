import java.util.LinkedList;
import java.util.Queue;

public class tempDL {
	Queue<String> tempQ = new LinkedList<>();
//	SortedSet sortedSedSet = new TreeSet();


Node head , tail ;
int size=0;
public void addtemp(PhonebookData PN) {
	if (tempQ.contains(PN.phoneNumber)==false) {
	Node newNode = new Node(PN);
	
	if(head ==null) {
		head =tail =newNode ;
		tempQ.add(PN.phoneNumber);
		size++;
		
	}
	else {
		tail.next=newNode;
		newNode.previous=tail;
		tail=newNode;
	    tail.next =null;
		tempQ.add(PN.phoneNumber);
		size++;


	}}
	else{
		System.out.println("The number has already been added");
	}
	
}

public void Delete(Node DN) {
	Node Htemp=head;
	Node Ttemp=tail;
	if(Htemp == DN) {
		head =head.next;
		head.previous=null;
		Htemp.next=null;

	}
	else if (Ttemp==DN) {
       tail=tail.previous;
       tail.next=null;
       Ttemp.previous=Ttemp.next=null;

	}
	else {
		while(Htemp.next!=null) {
			Htemp =Htemp.next;
			if(Htemp==DN) {
				DN.next.previous=DN.previous;
				DN.previous.next=DN.next;
				DN.previous=DN.next=null;

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


